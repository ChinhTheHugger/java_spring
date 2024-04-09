package com.example.test_java_spring.demo;

import static org.hamcrest.Matchers.containsString;
import org.springframework.test.web.servlet.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockmvs;
    
    @Test
    public void testHomepage() throws Exception {
        mockmvs.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(views().name("home"))
        .andExpect(content().string(containsString(("Welcome to..."))));
    }
}
