package Controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdivinhacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(101); // gera número aleatório entre 0 e 100
        int tentativas = 10;
        boolean acertou = false;

        System.out.println("🎯 Jogo da Adivinhação 🎯");
        System.out.println("Tente adivinhar o número entre 0 e 100!");
        System.out.println("Você tem " + tentativas + " tentativas.\n");

        while (tentativas > 0) {
            System.out.print("Digite seu palpite: ");
            int palpite = entrada.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou o número " + numeroSecreto + "!");
                acertou = true;
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor que " + palpite + ".");
            } else {
                System.out.println("O número secreto é maior que " + palpite + ".");
            }

            tentativas--;
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println();
        }

        if (!acertou) {
            System.out.println("😢 Suas tentativas acabaram! O número secreto era " + numeroSecreto + ".");
        }

        entrada.close();
    }
}
