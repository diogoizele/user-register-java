package br.com.errorreturns.userregister.service;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.RegisterUserResponse;
import br.com.errorreturns.userregister.validator.RegisterUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserValidator registerUserValidator;

    public RegisterUserResponse register(RegisterUserRequest request) {

         RegisterUserValidator.validate(request);

        return RegisterUserResponse.builder()
                .email("diogoize@mail.com")
                .firstName("Diogo")
                .build();
    }
}
