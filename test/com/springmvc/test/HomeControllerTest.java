package com.springmvc.test;

import com.springmvc.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/02
 * Time  14:54
 */

public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
      /*  HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/index.do")).andExpect(view().name("index"));*/
    }
}
