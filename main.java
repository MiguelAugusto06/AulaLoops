import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        int idade;
//
//        while (true){
//            System.out.println("Digite sua idade");
//            idade = s.nextInt();
//            System.out.println(idade);
//
//            if (idade < 18){
//                System.out.println(idade);
//                System.out.println("Voce não pode entrar");
//            } else {
//                System.out.println("Bem vindo");
//                break;
//            }
//
//        }


        // for = variavel dentro do escopo
        //while = variavel de fora do escopo

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//
//        do{
//            System.out.println(i);
//        } while (i < 10);

////        //1. O Carregamento do Caminhão
////
//        Scanner s = new Scanner(System.in);
////
////
//        int pesoAtual = 0;
//        int limite = 2000;
//        int pesoBarril;
//        int capacidadeRestante = 2000;
//
//
//        System.out.println("Capacidade atual: " + capacidadeRestante);
//
//        while (pesoAtual < limite) {
//            System.out.println("-Digite o peso do barril a ser adicionado-");
//            pesoBarril = s.nextInt();
//
//            if (limite <= pesoAtual + pesoBarril) {
//                break;
//            } else {
//                capacidadeRestante = capacidadeRestante - pesoBarril;
//                pesoAtual = pesoAtual + pesoBarril;
//                System.out.println("Capacidade atual " + capacidadeRestante);
//                System.out.println("Peso atual: " + pesoAtual);
//            }
//        }
//        System.out.println("Peso atual: " + pesoAtual);
//        System.out.println("Capacidade maxima atingida");

        //2. ~~~~~~~~

//        double lucroEstimado;
//        System.out.println("Digite o lucro estimado");
//        lucroEstimado = s.nextDouble();
//
//
//        int meses = 6;
//        double aumentoDemanda = 0.05;
//
//        for (int i = 0; i < meses; i++) {
//            double valorAumento = lucroEstimado * aumentoDemanda;
//            int mes = i + 1;
//            double valorTotal = valorAumento + lucroEstimado;
//            lucroEstimado = valorTotal;
//            System.out.println("Mês " + mes + ": R$" + valorTotal);
//
//
//        }

        //---EXERCICIOS SIMPLES---

        //1.  Escrever um programa que exiba os números de 1 a 10.
//
//        int contador = 0;
//        System.out.println(contador + "Antes do loop");
//        for (int i = 0; i <= 10; i++) {
//            contador = i;
//            System.out.println(contador);
//
//        }
//        System.out.println(contador + "Depois do loop");

        //2.  Solicitar a digitação de uma senha até que o usuário acerte o valor correto ("1234").

//        Scanner s = new Scanner(System.in);
//
//        int SENHA_CORRETA = 1234;
//
//        System.out.println("-Digite a senha-");
//        int senha = s.nextInt();
//        while (true){
//            if (senha != SENHA_CORRETA){
//                System.out.println("Senha incorreta, tente novamente.");
//                senha = s.nextInt();
//            } else {
//                break;
//            }
//        }
//        System.out.println("Senha correta, seja bem vindo.");

        //3. Receber um número inteiro e exibir a sua tabuada de multiplicação de 1 a 10.

//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Digite o numero desejado");
//        int numeroDesejado = s.nextInt();
//
//        for (int i = 1; i <= 11; i++) {
//            int tabuada = numeroDesejado * i;
//
//            System.out.println("-Tabuada do numero desejado-" + tabuada);
//        }

        //4.Somar números inseridos pelo usuário continuamente até que ele digite o número 0 para encerrar, mostrando a soma total no final.

        //bug normal :)
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Digite um numero inteiro para somar.");
//        System.out.println("Digite 0 para encerrar.");
//
//        int numeroEscolhido = s.nextInt();
//        int soma = 0;
//
//        while (numeroEscolhido != 0) {
//                numeroEscolhido = s.nextInt();
//                soma = soma + numeroEscolhido;
//                System.out.println("Soma atual: " + soma);
//                System.out.println("Digite um novo número para continuar somando");
//            }
//        }
//    }
