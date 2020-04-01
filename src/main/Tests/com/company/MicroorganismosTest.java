package com.company;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class MicroorganismosTest {
    private int vidaMax=256;
    private Microorganismos micro = new Microorganismos();

    @Test
    public void TestIrOrgano(){
        int vida = 256;
        micro.movePlace(5);
        assertFalse(micro.vidas < vida);
    }

    @ParameterizedTest
    @ValueSource(ints={1,2,4,5,5})
    void TestIrLugares(int lugar)
    {
        micro.movePlace(lugar);
        assertEquals(true, micro.vidas == vidaMax);
    }

    @RepeatedTest(10)
    void TestBajarVida(){
        int vida = 256;
        micro.movePlace(3);
        assertTrue(micro.vidas < vida);
    }
}

