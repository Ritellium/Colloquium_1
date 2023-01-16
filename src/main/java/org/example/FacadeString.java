package org.example;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;

public class FacadeString {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String AppUrl = "http://localhost:8080/" + WebServiceApp.app;
    public static String stringConCut(String str1, String str2) throws IOException
    {
        StringBuilder request = new StringBuilder(AppUrl).append(StringController.strCut);
        request.append(str1).append("/");
        request.append(str2);

        HttpUriRequest httpRequest = new HttpGet(request.toString());
        var httpResponse = HttpClientBuilder.create().build().execute(httpRequest);
        String result = objectMapper.readValue(httpResponse.getEntity().getContent(), String.class);
        return result;
    }
    public static String stringMultiply(String str1, int num) throws IOException
    {
        StringBuilder request = new StringBuilder(AppUrl).append(StringController.strMul).append("/");
        request.append(str1).append("/");
        request.append(num);

        HttpUriRequest httpRequest = new HttpGet(request.toString());
        var httpResponse = HttpClientBuilder.create().build().execute( httpRequest );
        String result = objectMapper.readValue(httpResponse.getEntity().getContent(), String.class);
        return result;
    }
}
