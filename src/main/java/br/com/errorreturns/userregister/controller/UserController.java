package br.com.errorreturns.userregister.controller;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.RegisterUserResponse;
import br.com.errorreturns.userregister.exception.ApiBaseException;
import br.com.errorreturns.userregister.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private RegisterUserService registerUserService;

    @PostMapping
    public ResponseEntity<RegisterUserResponse> register(@RequestBody RegisterUserRequest request) {

        try {
            return new ResponseEntity<>(registerUserService.register(request), OK);
        } catch (ApiBaseException e) {
            return new ResponseEntity<>(RegisterUserResponse.builder()
                    .errors(e.getErrors())
                    .build(), UNPROCESSABLE_ENTITY);
        }
    }
}
