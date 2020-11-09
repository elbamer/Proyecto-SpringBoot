package com.disenotuweb.rolesSecurity.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.validation.Valid;

@Controller
public class AppController {
    @Controller
    @RequestMapping("/")
    public class RedirectController {
    /*  @GetMapping("/redirectWithRedirectView")
        public RedirectView redirectWithUsingRedirectView(
                RedirectAttributes attributes) {
            attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
            attributes.addAttribute("attribute", "redirectWithRedirectView");
            return new RedirectView("http://localhost:3000");
        }
    }
    @GetMapping("/RedirectView")
    public String RedirectView() {
        return "RedirectView";*/
    }



        @GetMapping({"/","/login"})
        public String index() {
            return "index";
        }
        @GetMapping("/menu")
        public String menu() {
            return "menu";
        }
        @GetMapping("/user")
        public String user() {
            return "user";
        }

    @GetMapping("/indexEmpleado")
    public String indexEmpleado() {
        return "indexEmpleado";
    }




        @GetMapping("/admin")
        public String admin() {
            return "admin";
        }

    }