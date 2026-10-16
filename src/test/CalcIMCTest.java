package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    @Test
    void testarIMC(){
        CalcIMC calcIMC = new CalcIMC();
        double resultado = CalcIMC.calcularIMC(67, 1,76);
        // metodo assertEquals compara o resultado que esperamos com o resultado real
        assertEquals(21.63, resultado);

    }


}