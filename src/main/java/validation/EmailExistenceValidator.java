package validation;

import annotation.EmailExists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
@RequiredArgsConstructor
public class EmailExistenceValidator implements ConstraintValidator<EmailExists, String> {

    private boolean shouldExist;

    @Override
    public void initialize(EmailExists annotation) {
        shouldExist = annotation.shouldExist();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }

}