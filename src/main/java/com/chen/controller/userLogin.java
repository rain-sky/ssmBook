package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userLogin {


    @RequestMapping("/login")
    public String userLoginController(String username, String password,Model model){
        if (username.equals("rain-sky")&&password.equals("123123")){
            //重定向到/book/allBook,springMvc方式，不使用视图解析器
            return "redirect:/book/allBook";
        }
        else
        {
            //登录失败，重定向到登陆页面
            model.addAttribute("error","用户名或密码错误");
            //此处不可使用重定向，重定向数据不共享，前端页面将获取不到error的值,请求转发将会携带参数值
            return "forward:index.jsp";
        }
    }

    @RequestMapping("/register")
    public String userRegister(){
        return "register";
    }

//    @RequestMapping("/user/register")
//    public String userRegister(String user,String password){
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("user",user);
//        map.put("password",password);
//        userService.userRegister(map);
//        return "redirect:/book/allBook";
//    }
}
