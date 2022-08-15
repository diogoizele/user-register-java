package br.com.errorreturns.userregister.validator;

import br.com.errorreturns.userregister.controller.request.RegisterUserRequest;
import br.com.errorreturns.userregister.controller.response.ErrorResponse;
import br.com.errorreturns.userregister.exception.ApiBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

@Component
public class RegisterUserValidator {

    @Autowired
    private FirstNameValidator firstNameValidator;

    @Autowired
    private LastNameValidator lastNameValidator;

    @Autowired
    private EmailValidator emailValidator;

    @Autowired
    private CpfValidator cpfValidator;

    @Autowired
    private BirthDateValidator birthDateValidator;

    @Autowired
    private RgValidator rgValidator;

    @Autowired
    private LocationValidator locationValidator;

    @Autowired
    private RoleValidator roleValidator;

    @Autowired
    private WageValidator wageValidator;

    @ResponseStatus(UNPROCESSABLE_ENTITY)
    public void validate(RegisterUserRequest request) throws ApiBaseException {

        List<ErrorResponse> errorsList = new ArrayList<>();

        firstNameValidator.validate(request.getFirstName(), errorsList);
        lastNameValidator.validate(request.getLastName(), errorsList);
        emailValidator.validate(request.getEmail(), errorsList);
        cpfValidator.validate(request.getCpf(), errorsList);
        birthDateValidator.validate(request.getBirthDate(), errorsList);
        rgValidator.validate(request.getRg(), errorsList);
        locationValidator.validate(request.getLocation(), errorsList);
        roleValidator.validate(request.getRole(), errorsList);
        wageValidator.validate(request.getWage(), errorsList);

        if (!errorsList.isEmpty()) {
            throw new ApiBaseException(UNPROCESSABLE_ENTITY, errorsList);
        }

    }
}
