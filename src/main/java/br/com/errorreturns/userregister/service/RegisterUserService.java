package br.com.errorreturns.userregister.service;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.RegisterUserResponse;
import br.com.errorreturns.userregister.exception.ApiBaseException;
import br.com.errorreturns.userregister.validator.RegisterUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    private RegisterUserValidator registerUserValidator;

    public RegisterUserResponse register(RegisterUserRequest request) throws ApiBaseException {

         registerUserValidator.validate(request);

         /*
         *
         * Persist the user in the database
         *
         */

         return RegisterUserResponse.builder()
                 .email(request.getEmail())
                 .firstName(request.getFirstName())
                 .build();
    }
}
