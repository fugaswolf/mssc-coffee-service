package guru.springframework.mssccoffeeservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.mssccoffeeservice.web.model.CoffeeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CoffeeControllerTest {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getCoffeeById() throws Exception {
        mockMvc.perform(get("/api/v1/coffee/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void saveNewCoffee() throws Exception {

        CoffeeDto coffeeDto = CoffeeDto.builder().build();
        String coffeeDtotoJson = objectMapper.writeValueAsString(coffeeDto);

        mockMvc.perform(post("/api/v1/coffee/")
                .contentType(MediaType.APPLICATION_JSON).content(coffeeDtotoJson))
                .andExpect(status().isCreated());

    }

    @Test
    void updateCoffeeById() throws Exception {

        CoffeeDto coffeeDto = CoffeeDto.builder().build();
        String coffeeDtoJson = objectMapper.writeValueAsString(coffeeDto);

        mockMvc.perform(put("/api/v1/coffee" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(coffeeDtoJson))
                .andExpect(status().isNoContent());
    }
}