package com.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String goLogin(HttpServletRequest request){
        System.out.println(request.getRequestURL());
        return "login";
    }

    @GetMapping("/error")
    @ResponseBody
    public String error(){
        return "User name or password incorrect, try again";
    }

    @PostMapping("/login")
    public String login(String userName, String password, HttpSession session){
        System.out.println("username:"+userName+", password: "+password);
        if ("admin".equals(userName) && "456kdSDfvhz834".equals(password)){
            session.setAttribute("userLoginInfo", userName);
            session.setAttribute("authRandString", "348t897ADKHVSHf3hsuf2");
            return "redirect:/book/allBooks";
        }
        else {
            return "redirect:error";
        }
    }

    @GetMapping("/logOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        session.removeAttribute("authRandString");
        return "redirect:/login";
    }
}
