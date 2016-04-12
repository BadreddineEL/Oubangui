package fr.demos;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
	
		
		Panier P1 = new Panier();
		Article L1 = new Livre("ouvrage destiné à l'informatique","12365897P",100,12,"Java JEE","Steve","info","Cours");
		Livre L2 = new Livre("ouvrage Numerique","1258977P",120,10,"Jquery","Bob","info","Support");
		Article A1 = new Article("ouvrage Web","1245777J",250,8);
		
//		System.out.println(L1);
//		System.out.println(L2);
		P1.ajouter(L1);
		P1.ajouter(L2);
		P1.ajouter(A1);
		System.out.println(P1);
		P1.supprimer(L1);
		System.out.println(P1);
		
//		PrintWriter W = null;
//		try {
//			 W = new PrintWriter("Panier.txt");
//			 W.println(P1);
		
//		deuxieme methode (x_x)!!
		
		try(PrintWriter W = new PrintWriter("Panier.txt")){
			W.println(P1);
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		
	}
//		finally{
//		try {
//			W.close();
//		} catch (NullPointerException ex) {
//			System.out.print(ex.getMessage());
//		}
//		System.out.print(P1.toString());
//	}
		
}
}