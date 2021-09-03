package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafioModulo2 {
    public static void main(String[] args) {
        //Criando estruturas

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaDeFuncionaros = new HashMap<String, String>();

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
    }
}
