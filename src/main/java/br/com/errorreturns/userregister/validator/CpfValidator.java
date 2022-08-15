package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class CpfValidator {

    public static final String REGEX_PATTERN = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$";

    public void validate(String cpf, List<ErrorResponse> errorsList) {
        if (isNull(cpf)) {
            errorsList.add(ErrorResponse.builder()
                    .field("cpf")
                    .message("'cpf' value is required")
                    .build());
        }

        if (nonNull(cpf)) {

            boolean valid = Pattern.compile(REGEX_PATTERN)
                    .matcher(cpf)
                    .matches();

            if (!valid) {
                errorsList.add(ErrorResponse.builder()
                        .field("cpf")
                        .message("'cpf' must have a valid format")
                        .build());
            }
        }
    }
}
