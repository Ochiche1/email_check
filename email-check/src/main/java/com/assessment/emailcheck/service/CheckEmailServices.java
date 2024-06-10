//package com.assessment.emailcheck.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class CheckEmailServices {
//
//    private static final String DOJAH_API_URL = "https://dojah.io/all-products/email-check";
//    private static final String API_KEY = "";
//
//
//    public void checkEmails(List<String> emails){
//        HttpClient httpClient = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(DOJAH_API_URL))
//                .header("Authorization", "Bearer " + API_KEY)
//                .POST(HttpRequest.BodyPublishers.ofString(String.join("\n", emails)))
//                .build();
//        try {
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            String responseBody = response.body();
//            System.out.println(responseBody);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    }
//
//
