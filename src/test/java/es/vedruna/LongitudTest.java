package es.vedruna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongitudTest {



    @Test
    public void testWordLengthNulo() {
        Longitud longitud = new Longitud();
        assertEquals(0, longitud.getWordLength(null), "🔍 Error: Para un valor nulo, debería devolver 0.");
    }


    @Test
    public void testValidadorValido() {
        Longitud longitud = new Longitud();
        assertTrue(longitud.validador("Texto"), "🔍 Error: 'Texto' es válido y debería devolver true.");
    }


    @Test
    public void testValidadorNulo() {
        Longitud longitud = new Longitud();
        assertFalse(longitud.validador(null), "🔍 Error: Valor nulo debería devolver false.");
    }
}
