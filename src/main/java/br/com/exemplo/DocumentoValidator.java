package br.com.exemplo;

import java.util.Scanner;

public class DocumentoValidator {

    public String validar(String documento) {
        String doc = documento.replaceAll("\\D", "");

        if (doc.length() == 11 && !temDigitosRepetidos(doc)) {
            return "CPF válido";
        } else if (doc.length() == 14 && !temDigitosRepetidos(doc)) {
            return "CNPJ válido";
        } else {
            return "Documento inválido";
        }
    }

    private boolean temDigitosRepetidos(String doc) {
        return doc.matches("(\\d)\\1+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentoValidator validator = new DocumentoValidator();

        System.out.println("Digite um CPF ou CNPJ (ou 'sair' para encerrar):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando...");
                break;
            }

            String resultado = validator.validar(input);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}