package jokenpo;

import java.util.Scanner;

public class GameJokenpo {

	public static void main(String[] args) {

		int pedra, papel, tesoura, EscolhaDoUsuario, EscolhaDoComputador;
		pedra = 1;
		papel = 2;
		tesoura = 3;

		Scanner LeitorEscolhaDoUsuario = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("--------------J O K E N P O-------------");
		System.out.println("----------------------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------------------------");

		System.out.print("Qual a sua opção: ");
		EscolhaDoUsuario = LeitorEscolhaDoUsuario.nextInt();
		System.out.println("");
		if (EscolhaDoUsuario == 1) {
			System.out.println("Você escolheu Pedra!");
		} else if (EscolhaDoUsuario == 2) {
			System.out.println("Você escolheu Papel");
		} else if (EscolhaDoUsuario == 3) {
			System.out.println("Você escolheu Tesoura");
		}

		EscolhaDoComputador = (int) (Math.random() * 3 + 1);

		if (EscolhaDoComputador == 1) {
			System.out.println("O computador escolheu Pedra!");
		} else if (EscolhaDoComputador == 2) {
			System.out.println("O computador escolheu Papel");
		} else if (EscolhaDoComputador == 3) {
			System.out.println("O computador escolheu Tesoura");
		}
		// Criando opção para caso jogador escolher 1 (-------PEDRA-------)
		if (EscolhaDoUsuario == 1 && EscolhaDoComputador == 1) {
			System.out.println("O jogo EMPATOU");
		} else if (EscolhaDoUsuario == 1 && EscolhaDoComputador == 2) {
			System.out.println("O Computador GANHOU!!!");
		} else if (EscolhaDoUsuario == 1 && EscolhaDoComputador == 3) {
			System.out.println("Você Ganhou!!!");
		}
		// Criando opção para caso jogador escolher 2 (-------PAPEL------)
		if (EscolhaDoUsuario == 2 && EscolhaDoComputador == 1) {
			System.out.println("Você Ganhou!!!");
		} else if (EscolhaDoUsuario == 2 && EscolhaDoComputador == 2) {
			System.out.println("O jogo EMPATOU");
		} else if (EscolhaDoUsuario == 2 && EscolhaDoComputador == 3) {
			System.out.println("O Computador GANHOU!!!");
		}
		// Criando opção para caso jogador escolher 3 (-------TESOURA------)
		if (EscolhaDoUsuario == 3 && EscolhaDoComputador == 1) {
			System.out.println("O Computador GANHOU!!!");
		} else if (EscolhaDoUsuario == 3 && EscolhaDoComputador == 2) {
			System.out.println("Você Ganhou!!!");
		} else if (EscolhaDoUsuario == 3 && EscolhaDoComputador == 3) {
			System.out.println("O jogo EMPATOU!!!");
		}
	}

}
