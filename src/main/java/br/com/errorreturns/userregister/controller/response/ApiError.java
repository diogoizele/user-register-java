package br.com.errorreturns.userregister.controller.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder @NoArgsConstructor
@Getter @Setter
public class ApiError {

    private HttpStatus status;
    private List<ErrorResponse> errors;


    public ApiError(HttpStatus status, List<ErrorResponse> errors) {
        super();
        this.status = status;
        this.errors = errors;
    }
}
