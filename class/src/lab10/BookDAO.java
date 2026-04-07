package lab10;

import java.sql.*;
import java.util.Scanner;
public class BookDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER = "root";
    private static final String PASSWORD = "huang426523";
    // 1. 获取数据库连接
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // 加载JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 建立连接并返回
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 2. 添加图书信息
    public void addBook(String isbn, String bookname, String publishhouse, String pubdate) {
        String sql = "INSERT INTO book(isbn, bookname, publishhouse, pubdate) VALUES(?, ?, ?, ?)";
        try (
                Connection conn = getConnection(); // 自动关闭连接
                PreparedStatement pstmt = conn.prepareStatement(sql) // 自动关闭PreparedStatement
        ) {
            // 设置SQL参数（避免SQL注入）
            pstmt.setString(1, isbn);
            pstmt.setString(2, bookname);
            pstmt.setString(3, publishhouse);
            pstmt.setDate(4, Date.valueOf(pubdate)); // 字符串转Date类型

            // 执行插入操作，返回受影响的行数
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("图书添加成功！");
            } else {
                System.out.println("图书添加失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. 根据ISBN删除图书
    public void deleteBook(String isbn) {
        String sql = "DELETE FROM book WHERE isbn = ?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, isbn);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("ISBN为" + isbn + "的图书删除成功！");
            } else {
                System.out.println("未找到ISBN为" + isbn + "的图书，删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 4. 根据ISBN修改图书信息（可修改书名、出版社、出版日期）
    public void updateBook(String isbn, String newBookname, String newPublishhouse, String newPubdate) {
        String sql = "UPDATE book SET bookname = ?, publishhouse = ?, pubdate = ? WHERE isbn = ?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, newBookname);
            pstmt.setString(2, newPublishhouse);
            pstmt.setDate(3, Date.valueOf(newPubdate));
            pstmt.setString(4, isbn);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("ISBN为" + isbn + "的图书修改成功！");
            } else {
                System.out.println("未找到ISBN为" + isbn + "的图书，修改失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5. 根据书名查询图书（模糊查询，支持部分书名匹配）
    public void queryBookByName(String bookname) {
        String sql = "SELECT * FROM book WHERE bookname LIKE ?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, "%" + bookname + "%"); //
            ResultSet rs = pstmt.executeQuery(); // 自动关闭ResultSet
            boolean hasData = false;

            // 输出查询结果表头
            System.out.println("========================================");
            System.out.println("ISBN\t\t书名\t\t出版社\t\t出版日期");
            System.out.println("========================================");

            // 遍历结果集
            while (rs.next()) {
                hasData = true;
                String isbn = rs.getString("isbn");
                String name = rs.getString("bookname");
                String publish = rs.getString("publishhouse");
                Date pubDate = rs.getDate("pubdate");

                // 格式化输出（保证对齐）
                System.out.printf("%s\t%s\t%s\t%s%n", isbn, name, publish, pubDate);
            }

            if (!hasData) {
                System.out.println("未查询到包含\"" + bookname + "\"的图书！");
            }
            System.out.println("========================================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 主函数：测试所有功能（控制台交互）
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 功能菜单
            System.out.println("\n===== 图书信息管理系统 =====");
            System.out.println("1. 添加图书");
            System.out.println("2. 删除图书");
            System.out.println("3. 修改图书");
            System.out.println("4. 按书名查询图书");
            System.out.println("5. 退出系统");
            System.out.print("请选择功能（1-5）：");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 吸收换行符

            switch (choice) {
                case 1:
                    // 添加图书
                    System.out.print("请输入ISBN（17位）：");
                    String isbn = scanner.nextLine();
                    System.out.print("请输入书名（不超过20字）：");
                    String bookname = scanner.nextLine();
                    System.out.print("请输入出版社（不超过20字）：");
                    String publishhouse = scanner.nextLine();
                    System.out.print("请输入出版日期（格式：yyyy-MM-dd）：");
                    String pubdate = scanner.nextLine();
                    bookDAO.addBook(isbn, bookname, publishhouse, pubdate);
                    break;

                case 2:
                    // 删除图书
                    System.out.print("请输入要删除的图书ISBN：");
                    String delIsbn = scanner.nextLine();
                    bookDAO.deleteBook(delIsbn);
                    break;

                case 3:
                    // 修改图书
                    System.out.print("请输入要修改的图书ISBN：");
                    String updateIsbn = scanner.nextLine();
                    System.out.print("请输入新书名：");
                    String newBookname = scanner.nextLine();
                    System.out.print("请输入新出版社：");
                    String newPublishhouse = scanner.nextLine();
                    System.out.print("请输入新出版日期（格式：yyyy-MM-dd）：");
                    String newPubdate = scanner.nextLine();
                    bookDAO.updateBook(updateIsbn, newBookname, newPublishhouse, newPubdate);
                    break;

                case 4:
                    // 查询图书
                    System.out.print("请输入要查询的书名关键词：");
                    String queryName = scanner.nextLine();
                    bookDAO.queryBookByName(queryName);
                    break;

                case 5:
                    // 退出系统
                    System.out.println("系统已退出！");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("输入错误，请选择1-5之间的功能！");
            }
        }
    }
}