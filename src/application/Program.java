package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello world");
		
		Position pos = new Position(3, 4);
		
		System.out.println(pos);
		
		sc.close();

	}

}
