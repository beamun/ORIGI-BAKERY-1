package th.ac.kmitl.origibakery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCart {

    @RequestMapping("/shoppingcart")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "ORIGI BAKERY");
        // return home.html
        return "shoppingcart";
    }
}