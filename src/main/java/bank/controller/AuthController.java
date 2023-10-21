package bank.controller;

import bank.model.UserDao;
import bank.utils.Auth;
import bank.utils.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class AuthController {
    @Autowired
    UserDao userDao;
    @GetMapping("/")
    public String homePage(@CookieValue(value = "logInUser", required = false) String username, Model model){
    System.out.println(username);
    String name = "Guest";
    if(username !=null){
        name = username;
    }
    model.addAttribute("user", name);
        return "home";
    }
    @PostMapping("/signIn")
    public String signIn(@ModelAttribute("auth") Auth auth, HttpServletResponse response){
    System.out.println(auth);
      List<User> users = userDao.findUser(auth);
      if(users.size() ==1 ){
      Cookie cookie = new Cookie("logInUser", users.get(0).getName());
      cookie.setMaxAge(60*60*24);
      response.addCookie(cookie);
          return "redirect:/";
           }
      return "notFound";
    }
    @GetMapping("/signIn")
    public String signInPost(Model model ){
        model.addAttribute("auth",new Auth());

        return "signIn";
    }
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("user", new User());
        return "signup";
    }

    @GetMapping("/signOut")
    public String signOut(HttpServletResponse response){
        Cookie cookie = new Cookie("logInUser","");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";
    }
}
