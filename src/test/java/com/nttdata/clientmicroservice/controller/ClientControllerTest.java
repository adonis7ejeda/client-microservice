package com.nttdata.clientmicroservice.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ClientController.class)
class ClientControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void client() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/clients/222/type/c"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}