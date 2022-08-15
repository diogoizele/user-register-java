package br.com.errorreturns.userregister.controller.response;

import lombok.*;

@Builder @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ErrorResponse {

    private String field;
    private String message;
}
