package com.sparta.waj;

import org.json.simple.JSONObject;

import javax.print.DocFlavor;

public class UserDetails
{
    private static final String NAME_KEY = "Name";
    private static final String AGE_KEY = "Age";
    private static final String MAIL_KEY = "Mail";


    private JSONObject userDetails = new JSONObject();


    public UserDetails(String name, String email, int age)
    {
        userDetails.put(NAME_KEY, name);
        userDetails.put(AGE_KEY, age);
        userDetails.put(MAIL_KEY, email);



    }

    public int getAge(){
        return Integer.parseInt(userDetails.get(AGE_KEY).toString());
    }

    public String getName(){
        return userDetails.get(NAME_KEY).toString();
    }

    public String getMail(){
        return userDetails.get(MAIL_KEY).toString();
    }


    public JSONObject getJSONObject()
    {
        return userDetails;
    }
}
