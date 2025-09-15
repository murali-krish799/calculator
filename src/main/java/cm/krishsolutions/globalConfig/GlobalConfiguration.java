package cm.krishsolutions.globalConfig;

import cm.krishsolutions.DTOs.UserDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalConfiguration {

    @ModelAttribute("userDTO")
    public UserDTO getUSerDTO(){
        System.out.println("calling every request with different controller");

        return new UserDTO();
    }
}
