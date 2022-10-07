package demoapp;

import demoapp.service.NumeroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class NumeroTest {

    @Autowired
    NumeroService numero;

    @Test
    public void serviceNumero() throws Exception {
        assertThat(numero.npar(10)).isEqualTo("El número 10 es par");
    }

    @Test
    public void serviceNumImpar() throws Exception {
        assertThat(numero.npar(11)).isEqualTo("El número 11 es impar");
    }
}
