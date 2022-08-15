package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import br.com.errorreturns.userregister.controller.response.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Component
public class RegisterUserValidator {

    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public static void validate(RegisterUserRequest request) {
        List<ErrorResponse> errorsList = new ArrayList<>();

        if (isNull(request.getFirstName())) {
            errorsList.add(ErrorResponse.builder()
                    .field("firstName")
                    .message("'firstName' value is required")
                    .build());
        }
        
    }
}
