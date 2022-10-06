package application;
import java.util.Scanner;

import entities.Adm;
import entities.Validation;

public class Main {
	
	public static double [] saldoFilhos = new double [4];
	public static double saldo = 1640;
	public static int nota2 = 20;
	public static int nota10 = 20;
	public static int nota20 = 20;
	public static int nota50 = 20;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Validation valid = new Validation();
		Adm adm = new Adm();
		saldoFilhos[0] = 999999;
		saldoFilhos[1] = 999999;
		saldoFilhos[2] = 999999;
		saldoFilhos[3] = 999999;
		
		int opcao;
		int isvalid=0;
		int position;
		
		do {
			System.out.println("Caixa");
			System.out.println("1 - Acessar Conta");
			System.out.println("2 - Sair");
			System.out.println("Escolha uma opção -->");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite seu ID de acesso:");
				valid.userID = scan.nextInt();
				isvalid = valid.checkID();
				
				if (isvalid == 1) {
					System.out.println("Login efetuado com sucesso.");
					
					switch(valid.userID) {
					case 123456:
						position = 0;
						saldoFilhos[position] = Conta(saldoFilhos[0],saldoFilhos[1],saldoFilhos[2],saldoFilhos[3],position);
						break;
					case 745464:
						position = 1;
						saldoFilhos[position] = Conta(saldoFilhos[0],saldoFilhos[1],saldoFilhos[2],saldoFilhos[3],position);
						break;
					case 757456:
						position = 2;
						saldoFilhos[position] = Conta(saldoFilhos[0],saldoFilhos[1],saldoFilhos[2],saldoFilhos[3],position);
						break;
					case 746841:
						position = 3;
						saldoFilhos[position] = Conta(saldoFilhos[0],saldoFilhos[1],saldoFilhos[2],saldoFilhos[3],position);
						break;
					case 446516:
						do {
							System.out.println("Opções Conta ADM");
							System.out.println("1 - Exibir Saldo das Contas");
							System.out.println("2 - Exibir Qnt Notas para Repor");
							System.out.println("3 - Encerrar");
							System.out.println("Escolha uma opção -->");
							opcao = scan.nextInt();
							if(opcao == 1) {
								adm.VisualizarSaldos();
							} else if(opcao == 2) {
								adm.NotasRepor();
							} else if(opcao == 3) {
								System.out.println("Logout realizado com sucesso.");
							} else {
								System.out.println("Opção inválida.");
							}
							
						} while (opcao!=3);
						break;
					}
					
				} else {
					System.out.println("ID de acesso não encontrado.");
				}
				
			} else if(opcao == 2) {
				System.out.println("Programa finalizado.");
			} else {
				System.out.println("Opção inválida.");
			}
		} while (opcao != 2);
		scan.close();
	}
	
	public static double Conta(double saldo1, double saldo2, double saldo3, double saldo4, int position){
		Scanner scan = new Scanner(System.in);
		double [] saldoFilhos = new double [4];
		saldoFilhos[0] = saldo1;
		saldoFilhos[1] = saldo2;
		saldoFilhos[2] = saldo3;
		saldoFilhos[3] = saldo4;
		int optionMenu;
		int option;
		int qntNotas;
		double valorRetirar;
		double valorDeposito;
		
		
		do {
			System.out.println("Opções Conta");
			System.out.println("1 - Exibir Saldo");
			System.out.println("2 - Fazer Saque");
			System.out.println("3 - Fazer Depósito");
			System.out.println("4 - Encerrar");
			System.out.println("Escolha uma opção -->");
			optionMenu = scan.nextInt();
			
			if(optionMenu == 1) {
				System.out.println("Saldo: " + saldoFilhos[position]);
				
			} else if(optionMenu == 2) {
				do {
					System.out.println("Dinheiro no Caixa: R$" + saldo);
					System.out.println("Notas para Saque:");
					System.out.println("1 - Notas de R$2 - " + nota2);
					System.out.println("2 - Notas de R$10 - " + nota10);
					System.out.println("3 - Notas de R$20 - " + nota20);
					System.out.println("4 - Notas de R$50 - " + nota50);
					System.out.println("5 - Finalizar Saque");
					System.out.println("Escolha uma opção -->");
					option = scan.nextInt();
					
					
					if(option == 1) {
						System.out.println("Quantas notas de R$2 deseja sacar?");
						qntNotas = scan.nextInt();
						
						if(nota2 == 0) {
							System.out.println("Sem notas de R$2 disponíveis para saque.");
							
						} else if(qntNotas > nota2) {
							System.out.println("Você só pode sacar até " + nota2 + " notas de R$2.");
							
						} else {
							valorRetirar = 2 * qntNotas;
							if(valorRetirar > saldoFilhos[position]) {
								System.out.println("Valor de saque maior que o saldo atual da conta.");
							} else {
								nota2 = nota2 - qntNotas;
								saldo = saldo - valorRetirar;
								saldoFilhos[position] = saldoFilhos[position] - valorRetirar;
							}
						}
						
					} else if(option == 2) {
						System.out.println("Quantas notas de R$10 deseja sacar?");
						qntNotas = scan.nextInt();
						
						if(nota10 == 0) {
							System.out.println("Sem notas de R$10 disponíveis para saque.");
							
						} else if(qntNotas > nota10) {
							System.out.println("Você só pode sacar até " + nota10 + " notas de R$10");
							
						} else {
							valorRetirar = 10 * qntNotas;
							if(valorRetirar > saldoFilhos[position]) {
								System.out.println("Valor de saque maior que o saldo atual da conta.");
							} else {
								nota10 = nota10 - qntNotas;
								saldo = saldo - valorRetirar;
								saldoFilhos[position] = saldoFilhos[position] - valorRetirar;
							}
						}
						
					} else if(option == 3) {
						System.out.println("Quantas notas de R$20 deseja sacar?");
						qntNotas = scan.nextInt();
						
						if(nota20 == 0) {
							System.out.println("Sem notas de R$20 disponíveis para saque.");
							
						} else if(qntNotas > nota20) {
							System.out.println("Você só pode sacar até " + nota20 + " notas de R$20");
							
						} else {
							valorRetirar = 20 * qntNotas;
							if(valorRetirar > saldoFilhos[position]) {
								System.out.println("Valor de saque maior que o saldo atual da conta.");
							} else {
								nota20 = nota20 - qntNotas;
								saldo = saldo - valorRetirar;
								saldoFilhos[position] = saldoFilhos[position] - valorRetirar;
							}
						}
						
					} else if(option == 4) {
						System.out.println("Quantas notas de R$50 deseja sacar?");
						qntNotas = scan.nextInt();
						
						if(nota50 == 0) {
							System.out.println("Sem notas de R$50 disponíveis para saque.");
							
						} else if(qntNotas > nota50) {
							System.out.println("Você só pode sacar até " + nota50 + " notas de R$50");
							
						} else {
							valorRetirar = 50 * qntNotas;
							if(valorRetirar > saldoFilhos[position]) {
								System.out.println("Valor de saque maior que o saldo atual da conta.");
							} else {
								nota50 = nota50 - qntNotas;
								saldo = saldo - valorRetirar;
								saldoFilhos[position] = saldoFilhos[position] - valorRetirar;
							}
						}
			
					} else if(option == 5) {
						System.out.println("Saque finalizado.");
						
					} else {
						System.out.println("Opção inválida.");
					}
				
				} while (option != 5);
			
			} else if (optionMenu == 3) {
				System.out.println("Depósito");
				System.out.println("Digite quanto você quer depositar:");
				valorDeposito = scan.nextDouble();
				saldoFilhos[position] = saldoFilhos[position] + valorDeposito;
				System.out.println("Depósito realizado com sucesso.");
				
			} else if (optionMenu == 4) {
				System.out.println("Logout realizado com sucesso.");
			} else {
				System.out.println("Opção inválida.");
				
			}
			
		} while (optionMenu != 4);

		return saldoFilhos[position];
	}
	
	
}
