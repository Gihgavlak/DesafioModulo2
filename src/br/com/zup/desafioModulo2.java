package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafioModulo2 {
    public static void main(String[] args) {
        //Criando estruturas

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionaros = new HashMap<String, String>();
        int opcao = 1;

       /*
        //Receber os dados

        System.out.println("      Listamento dos Funcionários");
        System.out.println("Digite o nome completo do funcioário: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o telefone do funcionário: ");
        String telefone = leitor.nextLine();
        System.out.println("digite o email do funcionário: ");
        String email = leitor.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = leitor.nextLine();

        //Declarando qual será a chave

        listaDeFuncionaros.put(cpf, " Nome: " + nome +" Telefone: " + telefone +" Email: "+ email );
        System.out.println(listaDeFuncionaros);

        */

        // Fazendo a solicitação de opção usando laço
        while (opcao >= 1 && opcao <= 3) {
            System.out.println("Digite a opçãp desejada: ");
            System.out.println("1) Adicionar mais funcionários \n"
                    + "2) Exibir Lista \n"
                    + "3) Encerrar ");
            System.out.println("Digite: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    //Lendo as informações do cadastro
                    System.out.println("      Listamento dos Funcionários");
                    System.out.println("Digite o nome completo do funcioário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o telefone do funcionário: ");
                    String telefone = leitor.nextLine();
                    System.out.println("digite o email do funcionário: ");
                    String email = leitor.nextLine();
                    System.out.println("Digite o CPF do funcionário: ");
                    String cpf = leitor.nextLine();
                    // Exibindo lista
                    listaDeFuncionaros.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                    System.out.println(listaDeFuncionaros);
                    break;
                case 2:
                    //exibindo lista
                    for (String exibicao: listaDeFuncionaros.keySet()) {
                        System.out.println("Nome: " + listaDeFuncionaros.get(exibicao)+ " CPF: " +exibicao);
                        
                    }
                    

            }
        }

    }
}
