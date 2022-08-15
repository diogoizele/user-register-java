package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class LastNameValidator {

    private static final int MIN_CHARACTER_LENGTH = 2;

    public void validate(String lastName, List<ErrorResponse> errorsList) {
        if (isNull(lastName)) {
            errorsList.add(ErrorResponse.builder()
                    .field("lastName")
                    .message("'lastName' value is required")
                    .build());
        }

        if (nonNull(lastName) && lastName.length() < MIN_CHARACTER_LENGTH) {
            errorsList.add(ErrorResponse.builder()
                    .field("lastName")
                    .message("'lastName' value must have at least " + MIN_CHARACTER_LENGTH + " characters")
                    .build());
        }
    }
}
