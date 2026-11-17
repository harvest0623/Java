package com.action;

import com.beans.User;
import com.mapper.UserMapper;
import com.util.DBT;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class UserApp {
    public void insertUser(){
        SqlSession session = DBT.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = new User();
        u.setUserName("sunb");
        u.setPassword("sunb");
        u.setAccount(8003.2);
        int i = mapper.insertUser(u);
        System.out.println(i);
        session.commit();
    }

    public void updateUser(){
        SqlSession session = DBT.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = new User();
        u.setId(1);
        u.setUserName("sunc");
        u.setPassword("sunc");
        u.setAccount(9001.2);
        int i = mapper.updateUser(u);
        System.out.println(i);
        session.commit();
    }

    public void selectUser(){
        SqlSession session = DBT.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u = mapper.selectA("sunb", "sunb");
        System.out.println(u.getId() + " " + u.getUserName() + " " + u.getPassword() + " " + u.getAccount());
    }

    public void deleteUser(){
        SqlSession session = DBT.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(1);
        System.out.println(i);
        session.commit();
    }

    public void selectAllUser(){
        SqlSession session= DBT.getSession();//1 连接
        //2 取到mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> arr=mapper.selectAll();//arr中有很多user
        for (User u:arr){//加强for循环
            System.out.println(u.getId()+" "+u.getUserName()+" "
                    +u.getPassword()+" "+u.getAccount());
        }
    }

    public void selectByIf(){
        SqlSession session= DBT.getSession();//1 连接
        //2 取到mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u=new User();
        // u.setUserName("sunb");//先传入一个用户名过来
        // u.setId(1);
        u.setAccount(8001.2);
        List<User> arr=mapper.selectByIf(u);//arr中有很多user
        for (User u1:arr){//加强for循环
            System.out.println(u1.getId()+" "+u1.getUserName()+" "
                    +u1.getPassword()+" "+u1.getAccount());
        }
    }

    public void selectByChoose(){
        SqlSession session= DBT.getSession();//1 连接
        //2 取到mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        User u=new User();
        u.setUserName("sunb");//先传入一个用户名过来
        // u.setId(1);
        // u.setAccount(8001.2);
        List<User> arr=mapper.selectByChoose(u);//arr中有很多user
        for (User u1:arr){//加强for循环
            System.out.println(u1.getId()+" "+u1.getUserName()+" "
                    +u1.getPassword()+" "+u1.getAccount());
        }
    }

    public void deleteByForeach() {
        SqlSession session = DBT.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        int i = mapper.deleteByForeach(ids);
        System.out.println(i);
        session.commit();
    }

    public static void main(String[] args) {
        UserApp app=new UserApp();
        // app.insertUser();
        // app.updateUser();
        // app.deleteUser();
        // app.selectUser();
        // app.selectAllUser();
        // app.selectByChoose();
        app.deleteByForeach();
    }
}
