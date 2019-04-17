package com.sparta.waj;

import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDetailsTest
{
    private UserDetails myUser;

    @Before
    public void init()
    {
        myUser = new UserDetails("Bob", "bob@bobsite.bob", 45);
    }

    @Test
    public void nameTest(){
       assertEquals(myUser.getName(), "Bob");
    }

    @Test
    public void ageTest()
    {
        assertEquals(myUser.getAge(), 45);
    }

    @Test
    public void checkObjectType()
    {
        assertTrue(myUser.getJSONObject() instanceof JSONObject);
    }


}
