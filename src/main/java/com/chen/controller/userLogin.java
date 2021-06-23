package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.List;

@Controller
public class userLogin {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public String userLoginController(HttpSession session,String username, String password, Model model){
        List<User> list = userService.getAllUser();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            if(username.equals(next.getUser())&&password.equals(next.getPassword())){
                session.setAttribute("msg",username);
                return "redirect:/book/allBook";
            }
        }
            //登录失败，重定向到登陆页面
            model.addAttribute("error","用户名或密码错误");
            //此处不可使用重定向，重定向数据不共享，前端页面将获取不到error的值,请求转发将会携带参数值
            return "forward:index.jsp";
    }

    @RequestMapping("/ajaxForLogin")
    @ResponseBody
    public String ajaxForLogin(String username,String password){
        List<User> list = userService.getAllUser();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            if(username.equals(next.getUser())&&password.equals(next.getPassword())){
                return null;
            }if(username.equals(next.getUser())&&password != next.getPassword()){
                return "密码输入有误";
            }
        }
        return "用户名或密码错误";
    }

    @RequestMapping("/register")
    public String userRegister(){
        return "register";
    }

    @RequestMapping("/userRegister")
    public String userRegister(User newUser,Model model){
        List<User> list = userService.getAllUser();
        Iterator<User> iterator = list.iterator();
        if(newUser.getUser()==null||newUser.getPassword()==null){
            model.addAttribute("msg","账号或密码不能为空");
            return "forward:/register";
        }
        while (iterator.hasNext()){
            User next = iterator.next();
            if(newUser.getUser().equals(next.getUser())) {
                model.addAttribute("msg","账号已存在");
                return "forward:/register";
            }
        }
        userService.userRegister(newUser);
        return "redirect:/index.jsp";
    }
}
