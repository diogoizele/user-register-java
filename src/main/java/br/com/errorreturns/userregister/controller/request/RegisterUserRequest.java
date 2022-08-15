package br.com.errorreturns.userregister.controller.request;

import lombok.*;

import java.time.LocalDate;

@Builder @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RegisterUserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private String cpf;
    private String rg;
    private String role;
    private String location;
    private String wage;
}
