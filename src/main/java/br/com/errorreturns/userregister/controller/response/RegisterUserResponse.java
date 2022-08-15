package br.com.errorreturns.userregister.controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Builder @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterUserResponse {

    private String firstName;
    private String email;
    private List<ErrorResponse> errors;
}
