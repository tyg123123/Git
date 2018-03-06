package com.zking.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.sun.deploy.net.HttpRequest;
import com.zking.model.User;

import java.util.List;

public class Usercontroller extends Controller {

    public void add(){
        User user = getBean(User.class);
//        System.out.println(user.getTUid());
//        System.out.println(user.getTUser());
//        System.out.println(user.getTPassword());
//        System.out.println(user.getAuthority());
//        System.out.println(user.getIsvoid());

        user.save();
    }

    public void list(){
        Page<User> userPage = User.dao.paginate(1, 10, "select *", "from t_user where 1=1");
        List<User> list = userPage.getList();
        this.setAttr("userlist",list);
        render("/result.jsp");
    }

    public void delete(){

        boolean b = User.dao.deleteById();
    }
}
