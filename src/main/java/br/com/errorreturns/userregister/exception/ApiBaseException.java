package br.com.errorreturns.userregister.exception;


import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class ApiBaseException extends ResponseStatusException {

    private List<ErrorResponse> errors = new ArrayList<>();

    public ApiBaseException(HttpStatus status, List<ErrorResponse> errors) {
        super(status);
        this.errors = errors;
    }
}
