package cm.krishsolutions.controllers;


import cm.krishsolutions.DTOs.UserDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcomePage(Model model) {

        model.addAttribute("userDTO", new UserDTO());

        return "home";

    }

    @GetMapping("/processHome")
    public String processHomeHandler(@Valid @ModelAttribute("userDTO") UserDTO userDTO , BindingResult result) {
if(result.hasErrors()){

    result.getAllErrors().forEach(System.out::println);


    return"home";


}



        return "resultPage";

    }

    @GetMapping("/mailPage")
    public String mailPage() {

        return "mailPage";
    }

    @GetMapping("/sendMail")
    public String sendMail(@RequestParam("mail") String mail, Model model) {


        model.addAttribute("ReceivedMail", mail);
        return "sendMail";
    }
}
