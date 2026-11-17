package example.case1;

/**
 * 用户数据访问实现类（模拟数据库操作）
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User findUserById(int id) {
        // 模拟从数据库查询
        System.out.println("[UserDaoImpl] 正在查询ID为 " + id + " 的用户...");
        return new User(id, "张三", "zhangsan@example.com", "13800138000");
    }

    @Override
    public void updateUser(User user) {
        // 模拟更新数据库
        System.out.println("[UserDaoImpl] 正在更新用户信息到数据库...");
        System.out.println("[UserDaoImpl] 更新成功！用户ID: " + user.getId());
    }
}