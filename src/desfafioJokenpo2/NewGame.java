package desfafioJokenpo2;

import java.util.Random;
import java.util.Scanner;

public class NewGame {

	public static void main(String[] args) {

		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);

		String resposta = "Sim";
		int numeroDePartidas = 1, user, comp, vitoriasPc = 0, vitoriasUser = 0, contador = 1, empates = 0;
		comp = sorteio.nextInt(3) + 1;

		System.out.println("*****TUTORIAL*****");
		System.out.println("Comandos: ");
		System.out.println("1- Pedra ");
		System.out.println("2- Papel ");
		System.out.println("3- Tesoura ");
		System.out.println("___________________________________");
		System.out.println();

		while (resposta.equals("Sim") || resposta.equals("sim") || resposta.equalsIgnoreCase("s")) {
			System.out.print("Informe a quantidade de partidas: ");
			numeroDePartidas = leitor.nextInt();

			if (numeroDePartidas % 2 == 0 || numeroDePartidas < 3) {
				resposta = "Sim";
				System.out.println("Aten��o a quantidade de partidas deve recber um n�mero �mpar e maior que 3");
				System.out.println("___________________________________");
				System.out.println();
			} else {
				while (contador <= numeroDePartidas && !(vitoriasUser > (numeroDePartidas - empates) / 2
						|| vitoriasPc > (numeroDePartidas - empates) / 2)) {
					System.out.println("___________________________________");
					System.out.println();
					System.out.println("Partida " + contador);

					System.out.print("Escolha um n�mero: ");
					user = leitor.nextInt();

					if (user == 1) {
						System.out.println("Voc� escolheu pedra");
					} else if (user == 2) {
						System.out.println("Voc� escolheu papel");
					} else if (user == 3) {
						System.out.println("Voc� escolheu tesoura");
					} else {
						while (user >= 4) {
							System.out.println("___________________________________");
							System.out.println("Voc� escolheu uma op��o invalida");
							System.out.print("Escolha um n�mero novamente, idiota: ");
							user = leitor.nextInt();
							System.out.println("___________________________________");
						}
					}

					if (comp == 1) {
						System.out.println("O computador escolheu pedra");
					} else if (comp == 2) {
						System.out.println("O computador escolheu papel");
					} else {
						System.out.println("O computador escolheu tesoura");
					}

					if (comp == 1 && user == 2 || comp == 2 && user == 3 || comp == 3 && user == 1) {
						System.out.println("Voc� venceu a batalha");
						System.out.println("___________________________________");
						vitoriasUser++;
						contador++;
					} else if (comp == user) {
						System.out.println("Empate");
						System.out.println("___________________________________");
						contador++;
						empates++;
					} else {
						System.out.println("Voc� Perdeu a batalha");
						System.out.println("___________________________________");
						vitoriasPc++;
						contador++;
					}

				}
				if (vitoriasUser > vitoriasPc) {
					System.out.println("Voc� venceu a guerra ");
					System.out.println("Placar jogador: " + vitoriasUser);
					System.out.println("Placar pc: " + vitoriasPc);
				} else if (vitoriasPc == vitoriasUser) {
					System.out.println("Deseja jogar o desempate? ");
					resposta = leitor.next();
					System.out.println("___________________________________");
					if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equalsIgnoreCase("s")) {
						while (vitoriasPc == vitoriasUser) {

							System.out.print("Escolha um n�mero: ");
							user = leitor.nextInt();

							if (user == 1) {
								System.out.println("Voc� escolheu pedra");
							} else if (user == 2) {
								System.out.println("Voc� escolheu papel");
							} else if (user == 3) {
								System.out.println("Voc� escolheu tesoura");
							} else {
								while (user >= 4) {
									System.out.println("___________________________________");
									System.out.println("Voc� escolheu uma op��o invalida");
									System.out.print("Escolha um n�mero novamente, idiota: ");
									user = leitor.nextInt();
									System.out.println("___________________________________");
								}
							}

							if (comp == 1) {
								System.out.println("O computador escolheu pedra");
							} else if (comp == 2) {
								System.out.println("O computador escolheu papel");
							} else {
								System.out.println("O computador escolheu tesoura");
							}

							if (comp == 1 && user == 2 || comp == 2 && user == 3 || comp == 3 && user == 1) {
								System.out.println("Voc� venceu a batalha");
								System.out.println("___________________________________");
								vitoriasUser++;
								contador++;
							} else if (comp == user) {
								System.out.println("Empate");
								System.out.println("___________________________________");
								contador++;
								empates++;
							} else {
								System.out.println("Voc� Perdeu a batalha");
								System.out.println("___________________________________");
								vitoriasPc++;
								contador++;
							}
						}
					}
				} else {
					System.out.println("Voc� perdeu a guerra");
					System.out.println("___________________________________");
				}
				System.out.println("Placar jogador: " + vitoriasUser);
				System.out.println("Placar pc: " + vitoriasPc);
				System.out.println("N�mero de empates: " + empates);
				System.out.println("___________________________________");
				System.out.println("Deseja jogar novamente ? ");
				resposta = leitor.next();
				if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equalsIgnoreCase("s")) {
					contador = 1;
					vitoriasPc = 0;
					vitoriasUser = 0;
					empates = 0;
				} else {
					System.out.println("Obrigado por jogar!!");
				}
			}
			
		}
		leitor.close();
	}
}
