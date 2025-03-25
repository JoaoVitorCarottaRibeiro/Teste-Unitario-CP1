package br.com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentoValidatorTest {

    DocumentoValidator validator = new DocumentoValidator();

    @Test
    public void testCPFValido() {
        String result = validator.validar("529.982.247-25");
        assertEquals("CPF válido", result);
    }

    @Test
    public void testCNPJValido() {
        String result = validator.validar("04.252.011/0001-10");
        assertEquals("CNPJ válido", result);
    }

    @Test
    public void testCPFInvalidoComDigitosRepetidos() {
        String result = validator.validar("111.111.111-11");
        assertEquals("Documento inválido", result);
    }

    @Test
    public void testCNPJInvalidoComDigitosRepetidos() {
        String result = validator.validar("00.000.000/0000-00");
        assertEquals("Documento inválido", result);
    }

    @Test
    public void testEntradaComPoucosDigitos() {
        String result = validator.validar("12345");
        assertEquals("Documento inválido", result);
    }
}