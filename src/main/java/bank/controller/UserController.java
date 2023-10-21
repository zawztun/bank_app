package bank.controller;

import bank.model.UserDao;
import bank.utils.AccountTransaction;
import bank.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/users")
    public String user(ModelMap model){
        // key value
        List<User> users = userDao.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("title" , "Client List");
        return "users";
    }

  @PostMapping("/users")
  public String postUsers(@ModelAttribute("user") User user) {
    int res = userDao.saveUser(user);
    if (res == 1) {
      return "redirect:/users";
    } else {
    return "redirect:/not-found";
    }
  }

  @GetMapping("/not-found")
  public String notFound() {
        return "notFound";
    }
    @GetMapping("/transaction")
    public String getTransaction(ModelMap m , @CookieValue(value = "logInUser", required = false)String userName) {
    System.out.println(userName);
    m.addAttribute("transaction", new AccountTransaction());
    if(userName == null){
        return "redirect:/signIn";
    }
        return "transactionForm";
    }
    @PostMapping("/transaction")
    public String postTransaction(@ModelAttribute("transaction") AccountTransaction transaction)
    {
    System.out.println(transaction);
        int res = userDao.makeTransaction(transaction);
    if(res == 0){
        return "notFound";
    }
        return "redirect:/users";
    }

}
