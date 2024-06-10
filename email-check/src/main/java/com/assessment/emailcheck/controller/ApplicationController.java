package com.assessment.emailcheck.controller;

import com.assessment.emailcheck.dto.ApiResponse;
import com.assessment.emailcheck.service.ProcessAndVerifyEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ApplicationController {
    private final ProcessAndVerifyEmailService checkEmailServices;

    @PostMapping("checkEmail")
    @ResponseStatus(HttpStatus.OK)
    public List<ApiResponse> checkEmail(@RequestBody List<String> emails ){
        return checkEmailServices.processEmails(emails);
    }
}
