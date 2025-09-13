package cm.krishsolutions.DTOs;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;

public class UserDTO {


    @NotEmpty(message = "{user.nameMessage}")
    private String name;

    @NotEmpty(message = "crushName should not be empty")
    private String crushName;

    @AssertTrue(message = "Agree for the terms & conditions")
    private boolean active;


    public UserDTO() {

//        System.out.println("default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
       this. active = active;
    }
}
