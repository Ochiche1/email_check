package com.assessment.emailcheck.service;

import com.assessment.emailcheck.dto.ApiResponse;

import java.util.List;

public interface ProcessAndVerifyEmailService {
    List<ApiResponse> processEmails(List<String> emailList);
}
