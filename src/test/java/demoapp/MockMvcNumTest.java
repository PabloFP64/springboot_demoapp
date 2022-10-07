package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcNumTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    public void getShouldReturnNumero() throws Exception {
        this.mockMvc.perform(get("/numero/10"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("El número 10 es par")));
    }
    @Test
    public void postShoudReturnNumeroForm() throws Exception {
        this.mockMvc.perform(post("/numeroForm")
                        .param("numeroInt", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("El número 10 es par")));
    }
}
