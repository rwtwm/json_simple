package com.sparta.waj;

import org.json.simple.JSONObject;


public class App 
{
    public static void main( String[] args )
    {
        JSONObject userDetails = new JSONObject();
        System.out.println(userDetails.getClass());

        userDetails.put("Name", "Eric");
        userDetails.put("Age", 45);
        userDetails.put("email", "ericderek@email.plc");

        System.out.println(userDetails);
    }
}
