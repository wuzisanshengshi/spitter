package com.stone.spittr.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by stone on 17-6-7.
 */
public class HomeControllerTest {

    private MockMvc mockMvc;

    @Before
    public void iniViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        mockMvc= MockMvcBuilders.standaloneSetup(new HomeController()).setViewResolvers(viewResolver).build();
    }

    @Test
    public void home() throws Exception {
        mockMvc.perform(get("/home")).andExpect(view().name("home"));
    }

}