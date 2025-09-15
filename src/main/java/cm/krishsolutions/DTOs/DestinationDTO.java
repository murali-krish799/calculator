package cm.krishsolutions.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class DestinationDTO {

    @NotEmpty(message = "ToMail should not be empty")
    @Email(message = "mail should be XXXX@gmail.com")
    private String toMail;

    @NotEmpty(message = "Subject should not be empty")
    private String subject;

    @NotEmpty(message = "Body should not be empty")
    private String body;

    @NotEmpty(message = "UserMail should not be empty")
    @Email(message = "UserMail should be XXXX@gmail.com")
    private String userMail;

    private String loveResult;


    public String getToMail() {
        return toMail;
    }

    public void setToMail(String toMail) {
        this.toMail = toMail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getLoveResult() {
        return loveResult;
    }

    public void setLoveResult(String loveResult) {
        this.loveResult = loveResult;
    }
}
