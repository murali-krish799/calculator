package cm.krishsolutions.DTOs;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserMailDTO {

    @NotEmpty(message = "Host should not be empty")
    private String host;

    @NotNull(message = "Port should not be empty")
    private Integer port;

    @NotEmpty(message = "UserMail should not be empty")
    @Email(message = "UserMail should be XXXX@gmail.com")
    private String userMail;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    @AssertTrue
    private boolean smtpAuth;

    @AssertTrue
    private boolean smtpEnable;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(boolean smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public boolean isSmtpEnable() {
        return smtpEnable;
    }

    public void setSmtpEnable(boolean smtpEnable) {
        this.smtpEnable = smtpEnable;
    }
}
