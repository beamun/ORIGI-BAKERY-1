package th.ac.kmitl.origibakery.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cake {

    @RequestMapping("/cake")
    public String getCake(Model model) {
        model.addAttribute("greeting", "CAKE");
        return "cake";
    }
}