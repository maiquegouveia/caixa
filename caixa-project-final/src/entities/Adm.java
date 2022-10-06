package entities;
import application.Main;
import java.util.Scanner;


public class Adm {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		
		public void NotasRepor() {
			int option;
			int qntRepor2 = 20 - main.nota2;
			int qntRepor10 = 20 - main.nota10;
			int qntRepor20 = 20 - main.nota20;
			int qntRepor50 = 20 - main.nota50;
			
			System.out.println("Quantidade de Notas para Repor:");
			System.out.println("Notas R$2: " + qntRepor2);
			System.out.println("Notas R$10: " + qntRepor10);
			System.out.println("Notas R$20: " + qntRepor20);
			System.out.println("Notas R$50: " + qntRepor50);
				
				
		}
		
		public void VisualizarSaldos() {
			System.out.println("Saldo das Contas:");
			System.out.println("Conta N 123456: " + main.saldoFilhos[0]);
			System.out.println("Conta N 745464: " + main.saldoFilhos[1]);
			System.out.println("Conta N 757456: " + main.saldoFilhos[2]);
			System.out.println("Conta N 746841: " + main.saldoFilhos[3]);
		}
		
}
