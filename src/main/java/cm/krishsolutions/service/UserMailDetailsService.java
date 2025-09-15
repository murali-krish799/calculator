package cm.krishsolutions.service;

import cm.krishsolutions.DTOs.DestinationDTO;
import cm.krishsolutions.DTOs.UserDTO;
import cm.krishsolutions.DTOs.UserMailDTO;
import cm.krishsolutions.constants.LoveUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class UserMailDetailsService {

    private List<JavaMailSenderImpl> listJavaMailSenders = new ArrayList<>();


    public void sendUserDetails(UserMailDTO userMailDTO, DestinationDTO destinationDTO, String userName) {
        JavaMailSenderImpl javaMailSender;
        if (userMailDTO != null) {
            javaMailSender = new JavaMailSenderImpl();
            javaMailSender.setHost(userMailDTO.getHost());
            javaMailSender.setPort(userMailDTO.getPort());
            javaMailSender.setUsername(userMailDTO.getUserMail());
            javaMailSender.setPassword(userMailDTO.getPassword());
            javaMailSender.setJavaMailProperties(setProperties(userMailDTO.isSmtpAuth(), userMailDTO.isSmtpEnable()));

            listJavaMailSenders.add(javaMailSender);
        }
        if (destinationDTO != null) {
            listJavaMailSenders.get(0).send(simpleMailMessage(destinationDTO, userName));
        }


    }


    public SimpleMailMessage simpleMailMessage(DestinationDTO destinationDTO, String userName) {
        System.out.println("add git new version");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destinationDTO.getToMail());
        message.setSubject(destinationDTO.getSubject());
        message.setText("HI " + userName + "\n" + destinationDTO.getBody() + "\n" + "The relationship between you guys is :" + destinationDTO.getLoveResult());
        message.setFrom(destinationDTO.getUserMail()); // must match username

        return message;
    }


    public Properties setProperties(boolean auth, boolean enable) {

        Properties pro = new Properties();
        pro.setProperty("mail.smtp.auth", String.valueOf(auth));
        pro.setProperty("mail.smtp.starttls.enable", String.valueOf(enable));
        return pro;

    }

    public String calculateResult(UserDTO userDTO) {
        int lengthOfBoth = (userDTO.getName() + userDTO.getCrushName()).toCharArray().length;

        int LoveFormula = LoveUtils.FORMULA.toCharArray().length;

        int valueOfCalculation = lengthOfBoth % lengthOfBoth;
        switch (valueOfCalculation) {

            case 0:
                return LoveUtils.F;

            case 1:
                return LoveUtils.L;
            case 2:
                return LoveUtils.A;
            case 3:
                return LoveUtils.M;
            case 4:
                return LoveUtils.E;
            case 5:
                return LoveUtils.S;

        }

        return "";
    }
}
