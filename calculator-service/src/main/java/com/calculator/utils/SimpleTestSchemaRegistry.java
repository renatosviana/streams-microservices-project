package com.calculator.utils;

import java.net.*;
import java.io.*;

public class SimpleTestSchemaRegistry {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://172.19.113.43:8081/subjects");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        System.out.println("Response: " + content.toString());
    }
}

