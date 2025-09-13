package cm.krishsolutions.convertor;

import cm.krishsolutions.DTOs.Phone;
import org.springframework.core.convert.converter.Converter;

public class PhoneConvertorString implements Converter<Phone,String> {
    @Override
    public String convert(Phone source) {
        return source.getFirstNumber()+"-"+source.getSecondNumber();
    }
}
