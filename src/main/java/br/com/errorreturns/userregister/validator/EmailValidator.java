package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class EmailValidator {

    public static final String REGEX_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public void validate(String email, List<ErrorResponse> errorsList) {
        if (isNull(email)) {
            errorsList.add(ErrorResponse.builder()
                    .field("email")
                    .message("'email' value is required")
                    .build());
        }

        if (nonNull(email)) {

            boolean valid = Pattern.compile(REGEX_PATTERN)
                    .matcher(email)
                    .matches();

            if (!valid) {
                errorsList.add(ErrorResponse.builder()
                        .field("email")
                        .message("'email' must have a valid format")
                        .build());
            }
        }
    }
}
