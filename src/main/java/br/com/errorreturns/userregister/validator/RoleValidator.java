package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
public class RoleValidator {

    public void validate(String role, List<ErrorResponse> errorsList) {
        if (isNull(role)) {
            errorsList.add(ErrorResponse.builder()
                    .field("role")
                    .message("'role' value is required")
                    .build());
        }
    }
}
