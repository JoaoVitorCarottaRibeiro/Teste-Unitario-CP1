package br.com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

        @Test
        void testCalcularCustoComValorPositivo() {
            Veiculo veiculo = new Veiculo("Gol", 100);
            double resultado = veiculo.calcularCusto(5);
            assertEquals(500, resultado);
        }

        @Test
        void testCalcularCustoComValorZero() {
            Veiculo veiculo = new Veiculo("Gol", 100);
            double resultado = veiculo.calcularCusto(0);
            assertEquals(0, resultado);
        }

        @Test
        void testDescontoComMenosDe7Dias() {
            Veiculo veiculo = new Veiculo("Civic", 100);
            double resultado = veiculo.desconto(5);
            assertEquals(500, resultado);
        }

        @Test
        void testDescontoComMaisDe7Dias() {
            Veiculo veiculo = new Veiculo("Civic", 100);
            double resultado = veiculo.desconto(8);
            assertEquals(100 * 8 * 0.9, resultado);
        }

        @Test
        void testMultaSemAtraso() {
            Veiculo veiculo = new Veiculo("Uno", 100);
            double resultado = veiculo.multaPorDevolucao(5, 5);
            assertEquals(500, resultado);
        }

        @Test
        void testMultaComAtraso() {
            Veiculo veiculo = new Veiculo("Uno", 100);
            double resultado = veiculo.multaPorDevolucao(7, 5);
            assertEquals(500 + (2 * 20), resultado);
        }

    }