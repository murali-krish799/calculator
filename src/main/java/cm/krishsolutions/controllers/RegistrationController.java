package cm.krishsolutions.controllers;

import cm.krishsolutions.DTOs.RegistrationDTO;
import cm.krishsolutions.propertyEditor.IntegerPropertyEditor;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegistrationController {


    @GetMapping("/registration")
    public String registrationPage(@CookieValue("name")String name, @ModelAttribute("registrationDTO") RegistrationDTO registrationDTO) {
//fetching cookie from url
registrationDTO.setName(name);
        return "registration";

    }
//    processRegistration
    @GetMapping("/processRegistration")
   public  String processRegistration(@Valid @ModelAttribute("registrationDTO") RegistrationDTO registrationDTO,   HttpServletResponse response,BindingResult result){
        if(result.hasErrors()){

            result.getAllErrors().forEach(System.out::println);


            return"registration";

        }
        //set cookie to client
        Cookie cookie= new Cookie("name",registrationDTO.getName());
        response.addCookie(cookie);

        return "processRegistration";
   }


//initBinder example only for String
   @InitBinder
   public  void  initBinder(WebDataBinder binder){

       StringTrimmerEditor trimmerEditor= new StringTrimmerEditor(true);

       binder.registerCustomEditor(String.class,trimmerEditor);


       binder.registerCustomEditor(Integer.class,"age",new IntegerPropertyEditor());




   }

}
