package com.estoque.app;

import com.estoque.model.Teclado;
import com.estoque.validacoes.Validacoes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Esse é o que eu uso atualmente!!!
        Teclado teclado = new Teclado("HyperX", "Alloy Origins", 1);

        int op;

        do {

            exibirMenu();
            
            op = receberOp(sc);

            switch (op) {
                case 1:
                    System.out.println(teclado.toString());
                    break;
                case 2:
                    setMarca(teclado, sc);
                    break;
                case 3:
                    setModelo(teclado, sc);
                    break;
                case 4:
                    addEstoque(teclado, sc);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);

        sc.close();
    }

    

    
    private static void exibirMenu() {
        System.out.println("\n===== BLEH =====");
        System.out.println("1 - Mostrar Teclado");
        System.out.println("2 - Alterar Marca");
        System.out.println("3 - Alterar Modelo");
        System.out.println("4 - Adicionar Estoque");
        System.out.println("0 - Sair");
        System.out.println("========================");
        System.out.print("\nEscolha uma opção: ");
    }


    public static int receberOp(Scanner sc){
        int op;
        try {
            op = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Por favor, digite um número válido");
            op = -1;
        }
        return op;
    }

    private static void setMarca(Teclado teclado, Scanner sc){
        System.out.print("Digite a nova marca: ");
        String novaMarca = sc.nextLine();
        if (Validacoes.marcaValida(novaMarca)){
            teclado.setMarca(novaMarca);
            System.out.println("Marca alterada.");
        } else {
            System.out.println(Validacoes.mensagemErroMarca(novaMarca));
        }
    }

    // Modelo não tem validação, pq pode ser um Logitech K150, ou um ULTRAKILL
    // **ULTIMATE** +1250 INDUCTION-MAX with KEYSWITCHES CHERRY MX °_° AMAZING
    // ...
    // ..
    // tendeu?


    private static void setModelo(Teclado teclado, Scanner sc){
        System.out.print("Digite o novo modelo: ");
        String novoModelo = sc.nextLine();
        teclado.setModelo(novoModelo);
        System.out.println("Modelo alterado.");
    }

    

    public static void addEstoque(Teclado teclado, Scanner sc) {
        System.out.print("Adicione mais estoque: ");
        try {
            int estoqueAdicionado = Integer.parseInt(sc.nextLine());
            if (Validacoes.estoqueValido(estoqueAdicionado)) {
                teclado.addEstoque(estoqueAdicionado);
                System.out.println("Estoque alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroEstoque(estoqueAdicionado));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }
}