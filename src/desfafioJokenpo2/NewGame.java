package desfafioJokenpo2;

import java.util.Random;
import java.util.Scanner;

public class NewGame {

	public static void main(String[] args) {

		Random sorteio = new Random();
		Scanner leitor = new Scanner(System.in);

		String resposta = "Sim";
		int numeroDePartidas = 1, usuario, computador, vitoriasPc = 0, vitoriasUsuario = 0, contador = 1, empates = 0;
		computador = sorteio.nextInt(3) + 1;

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
				System.out.println("Atenção a quantidade de partidas deve recber um número ímpar e maior que 3");
				System.out.println("___________________________________");
				System.out.println();
			} else {
				while (contador <= numeroDePartidas && !(vitoriasUsuario > (numeroDePartidas - empates) / 2
						|| vitoriasPc > (numeroDePartidas - empates) / 2)) {
					System.out.println("___________________________________");
					System.out.println();
					System.out.println("Partida " + contador);

					System.out.print("Escolha um número: ");
					usuario = leitor.nextInt();

					if (usuario == 1) {
						System.out.println("Você escolheu pedra");
					} else if (usuario == 2) {
						System.out.println("Você escolheu papel");
					} else if (usuario == 3) {
						System.out.println("Você escolheu tesoura");
					} else {
						while (usuario >= 4) {
							System.out.println("___________________________________");
							System.out.println("Você escolheu uma opção invalida");
							System.out.print("Escolha um número novamente, idiota: ");
							usuario = leitor.nextInt();
							System.out.println("___________________________________");
						}
					}

					if (computador == 1) {
						System.out.println("O computador escolheu pedra");
					} else if (computador == 2) {
						System.out.println("O computador escolheu papel");
					} else {
						System.out.println("O computador escolheu tesoura");
					}

					if (computador == 1 && usuario == 2 || computador == 2 && usuario == 3 || computador == 3 && usuario == 1) {
						System.out.println("Você venceu a batalha");
						System.out.println("___________________________________");
						vitoriasUsuario++;
						contador++;
					} else if (computador == usuario) {
						System.out.println("Empate");
						System.out.println("___________________________________");
						contador++;
						empates++;
					} else {
						System.out.println("Você Perdeu a batalha");
						System.out.println("___________________________________");
						vitoriasPc++;
						contador++;
					}

				}
				if (vitoriasUsuario > vitoriasPc) {
					System.out.println("Você venceu a guerra ");
					System.out.println("Placar jogador: " + vitoriasUsuario);
					System.out.println("Placar pc: " + vitoriasPc);
				} else if (vitoriasPc == vitoriasUsuario) {
					System.out.println("Deseja jogar o desempate? ");
					resposta = leitor.next();
					System.out.println("___________________________________");
					if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equalsIgnoreCase("s")) {
						while (vitoriasPc == vitoriasUsuario) {

							System.out.print("Escolha um número: ");
							usuario = leitor.nextInt();

							if (usuario == 1) {
								System.out.println("Você escolheu pedra");
							} else if (usuario == 2) {
								System.out.println("Você escolheu papel");
							} else if (usuario == 3) {
								System.out.println("Você escolheu tesoura");
							} else {
								while (usuario >= 4) {
									System.out.println("___________________________________");
									System.out.println("Você escolheu uma opção invalida");
									System.out.print("Escolha um número novamente, idiota: ");
									usuario = leitor.nextInt();
									System.out.println("___________________________________");
								}
							}

							if (computador == 1) {
								System.out.println("O computador escolheu pedra");
							} else if (computador == 2) {
								System.out.println("O computador escolheu papel");
							} else {
								System.out.println("O computador escolheu tesoura");
							}

							if (computador == 1 && usuario == 2 || computador == 2 && usuario == 3 || computador == 3 && usuario == 1) {
								System.out.println("Você venceu a batalha");
								System.out.println("___________________________________");
								vitoriasUsuario++;
								contador++;
							} else if (computador == usuario) {
								System.out.println("Empate");
								System.out.println("___________________________________");
								contador++;
								empates++;
							} else {
								System.out.println("Você Perdeu a batalha");
								System.out.println("___________________________________");
								vitoriasPc++;
								contador++;
							}
						}
					}
				} else {
					System.out.println("Você perdeu a guerra");
					System.out.println("___________________________________");
				}
				System.out.println("Placar jogador: " + vitoriasUsuario);
				System.out.println("Placar pc: " + vitoriasPc);
				System.out.println("Número de empates: " + empates);
				System.out.println("___________________________________");
				System.out.println("Deseja jogar novamente ? ");
				resposta = leitor.next();
				if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equalsIgnoreCase("s")) {
					contador = 1;
					vitoriasPc = 0;
					vitoriasUsuario = 0;
					empates = 0;
				} else {
					System.out.println("Obrigado por jogar!!");
				}
			}
			
		}
		leitor.close();
	}
}
