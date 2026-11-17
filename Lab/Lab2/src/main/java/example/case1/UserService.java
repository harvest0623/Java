package example.case1;

/**
 * 用户服务接口
 */
public interface UserService {
    /** 修改用户信息 */
    void modifyUserInfo(int id, String newEmail, String newPhone);
}