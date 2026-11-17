package example.case1;

/**
 * 用户数据访问接口
 */
public interface UserDao {
    /** 根据ID查询用户 */
    User findUserById(int id);
    /** 更新用户信息 */
    void updateUser(User user);
}