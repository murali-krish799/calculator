package cm.krishsolutions.controllers;


import cm.krishsolutions.DTOs.DestinationDTO;
import cm.krishsolutions.DTOs.UserDTO;
import cm.krishsolutions.DTOs.UserMailDTO;
import cm.krishsolutions.service.UserMailDetailsService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userDTO")
public class MyController {

    @Autowired
    private UserMailDetailsService userMailDetailsService;

    @Autowired
    private HttpSession httpSession;

    @GetMapping("/")
    public String welcomePage(@ModelAttribute("userDTO") UserDTO userDTO) {


        return "home";

    }

    @GetMapping("/processHome")
    public String processHomeHandler(@Valid @ModelAttribute("userDTO") UserDTO userDTO, BindingResult result) {
        if (result.hasErrors()) {

            result.getAllErrors().forEach(System.out::println);


            return "home";


        }


        return "resultPage";

    }

    @GetMapping("/userMailDetails")
    public String userMailDetails(@ModelAttribute("userMailDetail") UserMailDTO userMailDTO) {

        return "userMailPage";


    }

    @GetMapping("/processUserMailDetails")
    public String processUserMailDetails(@Valid @ModelAttribute("userMailDetail") UserMailDTO userMailDTO, BindingResult result) {

        if (result.hasErrors()) {

            return "userMailPage";

        }

        userMailDetailsService.sendUserDetails(userMailDTO, null, null);

        return "redirect:/toMailPage";


    }

    @GetMapping("/toMailPage")
    public String processMailPage(@ModelAttribute("destinationDTO") DestinationDTO destinationDTO) {


        return "mailPage";
    }

    @GetMapping("/toMailProcessPage")
    public String toMailProcessPage(@Valid @ModelAttribute("destinationDTO") DestinationDTO destinationDTO, BindingResult result) {

        if (result.hasErrors()) {

            return "mailPage";
        }
        UserDTO userDTO = (UserDTO) httpSession.getAttribute("userDTO");
        String loveResult = userMailDetailsService.calculateResult(userDTO);
        destinationDTO.setLoveResult(loveResult);
        userMailDetailsService.sendUserDetails(null, destinationDTO, userDTO.getName());

        return "sendMail";
    }

}
