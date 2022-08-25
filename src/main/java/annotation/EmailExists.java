package annotation;

import validation.EmailExistenceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static util.Constants.EXISTS;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailExistenceValidator.class)
@Documented
public @interface EmailExists {

    boolean shouldExist();

    String message() default EXISTS;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
