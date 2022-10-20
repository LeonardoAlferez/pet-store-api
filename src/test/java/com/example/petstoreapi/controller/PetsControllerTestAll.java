package com.example.petstoreapi.controller;

import com.example.petstoreapi.service.PetsService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class PetsControllerTestAll {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PetsService petsService;

    @Test
    void listPets() throws Exception {
        mockMvc.perform(get("/pets").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("Zeus", Matchers.is("Zeus")))
                .andExpect(jsonPath("Pitbull", Matchers.is("Pitbull")));
    }

    @Test
    void showPetById() {
    }

    @Test
    void createPets() {
    }
}