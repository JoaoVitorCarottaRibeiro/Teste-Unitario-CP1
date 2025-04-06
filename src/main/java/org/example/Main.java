package org.example;

import br.com.exemplo.Veiculo; // importa corretamente a classe

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do veículo: ");
        String nomeVeiculo = scanner.nextLine();

        System.out.println("Digite o valor da diária: ");
        double valorDiaria = scanner.nextDouble();

        System.out.println("Digite a quantidade de dias previstos: ");
        int quantidadeDias = scanner.nextInt();

        System.out.println("Digite a quantidade de dias usados: ");
        int diasUsados = scanner.nextInt();

        Veiculo veiculo = new Veiculo(nomeVeiculo, valorDiaria); // uso direto

        double custoSemDesconto = veiculo.calcularCusto(quantidadeDias);
        double custoComDesconto = veiculo.desconto(quantidadeDias);
        double custoComMulta = veiculo.multaPorDevolucao(diasUsados, quantidadeDias);

        System.out.println("\nVeículo: " + nomeVeiculo);
        System.out.println("Custo sem desconto: R$ " + custoSemDesconto);
        System.out.println("Custo com desconto: R$ " + custoComDesconto);
        System.out.println("Custo com multa: R$ " + custoComMulta);

        scanner.close();
    }
}
