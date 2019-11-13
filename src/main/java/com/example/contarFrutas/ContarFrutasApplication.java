package com.example.contarFrutas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class ContarFrutasApplication {

	static void contarFrutas(int s, int t, int a, int b, int[] manzanas, int[] naranjas){
		ArrayList<Integer> manzanasCasaJose = new ArrayList<>();
		ArrayList<Integer> naranjasCasaJose = new ArrayList<>();
		boolean validado=false;

		if (1 > s || 1 > t || 1 > a || 1 > b ||
				s > 100000 || t > 100000 || a > 100000 || b > 100000 ){

			System.out.println(0);
			System.out.println(0);
		} else {
			validado = true;
		}

		if (a >= s || s >= t || t>= b){
			System.out.println(0);
			System.out.println(0);
		} else {
			validado = true;
		}

		for (int manzana : manzanas) {
			int numero = manzana;
			numero = numero + a;

			if (! (-100000 > numero && numero> 10000 ) ){
				if (numero == s || numero == t) {
					manzanasCasaJose.add(numero);
				} else if (numero > s && numero < t) {
					manzanasCasaJose.add(numero);
				}
			}else {
				System.out.println(0);
				System.out.println(0);
			}
		}

		for (int naranja : naranjas) {
			int numero = naranja;
			numero = numero + b;

			if (! (-100000 > numero && numero> 10000 ) ) {
				if (numero == s || numero == t) {
					naranjasCasaJose.add(numero);
				} else if (numero > s && numero < t) {
					naranjasCasaJose.add(numero);
				}
			}else {
				System.out.println(0);
				System.out.println(0);
			}
		}

		System.out.println(manzanasCasaJose.size());
		System.out.println(naranjasCasaJose.size());
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			String[] st = scanner.nextLine().split(" ");

			int s = Integer.parseInt(st[0]);

			int t = Integer.parseInt(st[1]);

			String[] ab = scanner.nextLine().split(" ");

			int a = Integer.parseInt(ab[0]);

			int b = Integer.parseInt(ab[1]);

			String[] mn = scanner.nextLine().split(" ");

			int m = Integer.parseInt(mn[0]);

			int n = Integer.parseInt(mn[1]);

			int[] manzanas = new int[m];

			String[] manzanasItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i=0; i < m; i++){
				int manzanaItem = Integer.parseInt(manzanasItems[i]);
				manzanas[i]= manzanaItem;
			}

			int[] nanranjas = new int[n];

			String[] naranjasItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++){
				int naranjasItem = Integer.parseInt(naranjasItems[i]);
				nanranjas[i] = naranjasItem;
			}


			if (1 > m || 1 > n || m > 100000 || n > 100000){

				System.out.println(0);
				System.out.println(0);
			} else {
				contarFrutas(s, t, a, b, manzanas, nanranjas);
			}

			scanner.close();

		}catch (Exception e){
			System.out.println(0);
			System.out.println(0);
		}

	}
}
