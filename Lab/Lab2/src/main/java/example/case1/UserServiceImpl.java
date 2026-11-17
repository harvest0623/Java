package example.case1;

/**
 * 用户服务实现类 - 使用【构造器注入】UserDao 依赖
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;  // 依赖对象

    // ★ 构造器注入：Spring 通过构造函数把 UserDao 注入进来
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("[UserServiceImpl] 构造器注入成功，userDao = " + userDao.getClass().getSimpleName());
    }

    @Override
    public void modifyUserInfo(int id, String newEmail, String newPhone) {
        System.out.println("====== 案例1：修改用户信息（构造器注入） ======");
        // 1. 先查询原用户
        User user = userDao.findUserById(id);
        System.out.println("修改前: " + user);

        // 2. 修改属性
        user.setEmail(newEmail);
        user.setPhone(newPhone);
        System.out.println("修改后: " + user);

        // 3. 保存到数据库
        userDao.updateUser(user);
        System.out.println("====== 修改完成 ======\n");
    }
}