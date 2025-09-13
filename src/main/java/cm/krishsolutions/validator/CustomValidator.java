package cm.krishsolutions.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PhoneConstraint.class})
public @interface CustomValidator {

    int range() default 10;
    String message() default "{myCustomException}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
