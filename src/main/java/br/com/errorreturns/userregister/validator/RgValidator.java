package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class RgValidator {

    private static final int MIN_CHARACTER_LENGTH = 10;

    public void validate(String rg, List<ErrorResponse> errorsList) {
        if (isNull(rg)) {
            errorsList.add(ErrorResponse.builder()
                    .field("rg")
                    .message("'rg' value is required")
                    .build());
        }

        if (nonNull(rg) && rg.length() < MIN_CHARACTER_LENGTH) {
            errorsList.add(ErrorResponse.builder()
                    .field("rg")
                    .message("'rg' value must have at least " + MIN_CHARACTER_LENGTH + " characters")
                    .build());
        }
    }
}
