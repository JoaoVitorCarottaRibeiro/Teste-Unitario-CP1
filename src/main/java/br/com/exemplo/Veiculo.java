package br.com.exemplo;

public class Veiculo {
    private String veiculo;
    private double valorDiaria;

    public Veiculo(String veiculo, double valorDiaria){
        this.veiculo = veiculo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int quantidadeDias) {
        if (quantidadeDias <= 0) {
            System.out.println("A quantidade de dias não pode ser 0 ou números negativos");
            return 0;
        }
        return valorDiaria * quantidadeDias;
    }

    public double desconto(int quantidadeDias) {
        double custoComDesconto = calcularCusto(quantidadeDias);
        if (quantidadeDias >= 7) {
            custoComDesconto *= 0.9;
        }
        if (quantidadeDias >= 10) {
            custoComDesconto *= 0.85;
        }
        if (quantidadeDias >= 15){
            custoComDesconto *= 0.80;
        }
        return custoComDesconto;
    }

    public double multaPorDevolucao(int diasUsados, int quantidadeDias){
        double custoComMulta = calcularCusto(quantidadeDias);
        if (diasUsados > quantidadeDias ){
            int atraso = diasUsados - quantidadeDias;
            custoComMulta += atraso * 20;
        }
        return custoComMulta;
    }
}