package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class LocationValidator {

    public void validate(String location, List<ErrorResponse> errorsList) {
        if (isNull(location)) {
            errorsList.add(ErrorResponse.builder()
                    .field("location")
                    .message("'location' value is required")
                    .build());
        }
    }
}
