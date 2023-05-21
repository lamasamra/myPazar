package com.myPazar.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = {"/home","/"})
    public String home() {
        return "pages/home";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(){ return "pages/Aboutus"; }

    @GetMapping("/contactUs")
    public String contactUs(){return "pages/contactUs";}

    @GetMapping("/sellerOrBuyer")
    public String sellerOrBuyer(){return "pages/sellerOrBuyer";}

    @GetMapping("/FAQ")
    public String FAQ(){return "pages/faq";}

    @GetMapping("/logout")
    public String logout(HttpServletRequest request)throws ServletException {
        request.logout();
        return "redirect:/home";
    }

    @GetMapping("/sellerInfo")
    public String sellerInfo(){
        return "pages/sellerInfo";
    }

    @GetMapping("/forgetPassword")
    public String forgetPassword(){return "pages/forgetPassword"; }
}
