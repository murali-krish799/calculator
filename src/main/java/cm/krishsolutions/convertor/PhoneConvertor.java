package cm.krishsolutions.convertor;

import cm.krishsolutions.DTOs.Phone;
import org.springframework.core.convert.converter.Converter;

public class PhoneConvertor implements Converter<String, Phone> {
    @Override
    public Phone convert(String phone) {
        Phone phoneObj = new Phone();
        boolean matches = phone.matches("^[0-9-]+$");

        if (matches) {

            if (phone.contains("-")) {
                if (phone.startsWith("-")) {

                    phoneObj.setFirstNumber(String.valueOf(91));
                    phoneObj.setSecondNumber(String.valueOf(phone.substring(1)));
                    return phoneObj;
                } else {
                    String[] phoneNo = phone.split("-");

                    phoneObj.setFirstNumber(String.valueOf(phoneNo[0]));
                    phoneObj.setSecondNumber(String.valueOf(phoneNo[1]));
                    return phoneObj;
                }
            } else {

                phoneObj.setFirstNumber(String.valueOf(91));
                phoneObj.setSecondNumber(String.valueOf(phone));
                return phoneObj;

            }


        }

        return null;
    }
}
