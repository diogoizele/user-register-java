package br.com.errorreturns.userregister.controller.response;

import lombok.*;

@Builder @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RegisterUserResponse {

    private String firstName;
    private String email;
}
