package cm.krishsolutions.DTOs;

import cm.krishsolutions.validator.CustomValidator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class RegistrationDTO {

    @NotEmpty(message = "name should not empty")
    private String name;

    @Min(value = 5, message = "should be 5 or more")
    @NotNull(message = "should be 5 or more")
    private Integer age;

    @NotEmpty(message = "password should not empty")
    private char[] password;


    @CustomValidator
    private Phone phone;


    @NotEmpty(message = "cuntry should not empty")
    private String cuntry;

    @NotEmpty(message = "hobbies should not empty")
    private String[] hobbies;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getCuntry() {
        return cuntry;
    }

    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
