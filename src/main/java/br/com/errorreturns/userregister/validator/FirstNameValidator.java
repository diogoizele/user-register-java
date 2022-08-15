package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class FirstNameValidator {

    private static final int MIN_CHARACTER_LENGTH = 3;

    public void validate(String firstName, List<ErrorResponse> errorsList) {
        if (isNull(firstName)) {
            errorsList.add(ErrorResponse.builder()
                    .field("firstName")
                    .message("'firstName' value is required")
                    .build());
        }

        if (nonNull(firstName) && firstName.length() < MIN_CHARACTER_LENGTH) {
            errorsList.add(ErrorResponse.builder()
                    .field("firstName")
                    .message("'firstName' value must have at least " + MIN_CHARACTER_LENGTH + " characters")
                    .build());
        }
    }
}
