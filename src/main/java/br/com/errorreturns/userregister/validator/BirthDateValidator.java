package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class BirthDateValidator {

    public void validate(LocalDate birthDate, List<ErrorResponse> errorsList) {

        if (isNull(birthDate)) {

            errorsList.add(ErrorResponse.builder()
                    .field("birthDate")
                    .message("'birthDate' value is required")
                    .build());

        }
    }
}
