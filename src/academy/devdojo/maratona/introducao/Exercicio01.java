package academy.devdojo.maratona.introducao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] produtos = new String[]{"Notebook", "Celular", "Fone Bluetooth"};
        int[] quantidadeProdutos = new int[]{5, 10, 3};
        double[] valorProdutos = new double[]{5000, 2500, 100};
        double faturamentoTotal = 0;
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ver Estoque");
            System.out.println("2. Realizar Venda");
            System.out.println("3. Resumo do dia");
            System.out.println("4. Sair");

            System.out.println("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- ESTOQUE ATUAL ---");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(i + ". " + produtos[i] + " | Qtd: " + quantidadeProdutos[i] + " | Preço: R$" + valorProdutos[i]);
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o numero do produto que deseja comprar.");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(i + ". " + produtos[i]);
                    }
                    int opcaoCompra = scanner.nextInt();
                    if (opcaoCompra >= produtos.length || opcaoCompra < 0) {
                        System.out.println("Opção Inválida");
                    } else {
                        System.out.println("\nDigite a quantidade que deseja comprar.");
                        int quantCompra = scanner.nextInt();
                        if (quantCompra > quantidadeProdutos[opcaoCompra]) {
                            System.out.println("\nEstoque insuficiente");
                        } else if (quantCompra <= 0) {
                            System.out.println("\nOpção Inválida");
                        } else {
                            quantidadeProdutos[opcaoCompra] = quantidadeProdutos[opcaoCompra] - quantCompra;
                            double valorVenda = valorProdutos[opcaoCompra];
                            faturamentoTotal += valorProdutos[opcaoCompra] * quantCompra;
                            System.out.println("\nCompra realizada no valor de R$" + valorVenda * quantCompra);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nFaturamento total do dia: R$" + faturamentoTotal);
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        }
    }
}