package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
public class WageValidator {

    public void validate(String wage, List<ErrorResponse> errorsList) {
        if (isNull(wage)) {
            errorsList.add(ErrorResponse.builder()
                    .field("wage")
                    .message("'wage' value is required")
                    .build());
        }
    }
}
