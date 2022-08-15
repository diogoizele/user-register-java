package br.com.errorreturns.userregister.controller;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.RegisterUserResponse;
import br.com.errorreturns.userregister.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private RegisterUserService registerUserService;

    @PostMapping
    public RegisterUserResponse register(@RequestBody RegisterUserRequest request) {
        return registerUserService.register(request);
    }
}
