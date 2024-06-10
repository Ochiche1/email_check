package com.assessment.emailcheck.service;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmailVerificationService {


        // ... Previous code ...

        public List<String> getEmailListFromFile(String filePath) {
            List<String> emailList = new ArrayList<>();

            try (FileInputStream fileInputStream = new FileInputStream(filePath);
                 InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    // Assuming each line in the file contains one email address.
                    // You may need to adapt this logic to your specific file format.
                    emailList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return emailList;
        }

        // ... Rest of the code ...
    }

