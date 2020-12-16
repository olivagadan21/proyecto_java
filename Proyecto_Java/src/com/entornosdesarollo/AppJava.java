package com.entornosdesarollo;

import java.util.Scanner;

public class AppJava {

		
	public static String leerStringPorConsola( ) {
			Scanner sc = new Scanner(System.in);
			String result=sc.next();
			sc.close();
			return result;
		
	}

}


