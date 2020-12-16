package com.entornosdesarollo;

import java.util.Scanner;

public class AppJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HOLA ALUMNOS!");
		System.out.println("Introduce tu nombre");
		String nombre= leerStringPorConsola();
		System.out.println("Muy buenas, " + nombre);
		
	}
		
	public static String leerStringPorConsola() {
			Scanner sc = new Scanner(System.in);
			String result=sc.next();
			sc.close();
			return result;
	}

	}


