package cm.krishsolutions.validator;

import cm.krishsolutions.DTOs.Phone;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneConstraint implements ConstraintValidator<CustomValidator, Phone> {

  int range;
    @Override
    public void initialize(CustomValidator phoneObj) {
     this.range=  phoneObj.range();


    }

    @Override
    public boolean isValid(Phone value, ConstraintValidatorContext context) {

        System.out.println("bjgjgj    "+value);
        if(value!=null){
            if(value.getSecondNumber().length()>10){

                return true;
        }

        }
        System.out.println("condition false");
        return false;
    }
}
