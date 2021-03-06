package com.example.pranav.myapplication;

/**
 * Created by Pranav on 10/18/2015.
 */

import android.util.Log;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;


public class HTTP {

    public HTTP() {

    }

    public String getRequest(String website) {
        String returnString = "";
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(website);
        HttpResponse response;
        try {
            response = client.execute(request);
            returnString = response.toString();
            Log.d("Response of GET request", response.toString());
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnString;
    }

    public String getRequests() {
        return getRequest("www.somethingOlegSays.com");
    }

    public String getTransactions() {
        return getRequest("www.somethingelseOlegesays.com");
    }

    public String PostRequest(){
        String returnStr = "";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://www.example.com");
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(2);
        nameValuePair.add(new BasicNameValuePair("username", "test_user"));
        nameValuePair.add(new BasicNameValuePair("password", "123456789"));


        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        try {
            HttpResponse response = httpClient.execute(httpPost);
            returnStr = response.toString();
            Log.d("Http Post Response:", response.toString());
        } catch (ClientProtocolException e) {
            // Log exception
            e.printStackTrace();
        } catch (IOException e) {
            // Log exception
            e.printStackTrace();
        }
        return returnStr;
    }
}
