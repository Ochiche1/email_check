package com.assessment.emailcheck.service;

import com.assessment.emailcheck.dto.ApiResponse;
import com.assessment.emailcheck.dto.EmailUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ProcessAndVerifyEmailImplServices implements ProcessAndVerifyEmailService {
    private static final String DOJAH_API_URL = "https://dojah.io/all-products/email-check";

    private final WebClient.Builder webClient;

    @Value("${dojah.apisecret}")
    private String secretKey;
    @Value("${dojah.appid}")
    private String appid;


    @Override
    public List<ApiResponse> processEmails(List<String> emailList) {
        ArrayList<ApiResponse> emailResponse = new ArrayList<>();
        emailList.forEach(email -> {
            ApiResponse response = webClient.build()
                .get()
                .uri(uriBuilder -> uriBuilder.path(DOJAH_API_URL)
                    .queryParam("email_address", email)
                    .build())
                .header("AppId", appid)
                .header("Authorization", secretKey)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();
            emailResponse.add(response);

        });

        return emailResponse;
    }

    private EmailUserResponse mapToEmailUserResponse(List<ApiResponse> apiResponses){

        List<Integer> reference = apiResponses.stream().map(re -> re.getEntity().getReferences()).toList();
        return EmailUserResponse.builder()
        .reference(reference).build();
    }

}
