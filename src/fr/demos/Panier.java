package fr.demos;

import java.util.ArrayList;

public class Panier {

	
	private ArrayList<Article> contenu = new ArrayList<>();
	

	public void ajouter(Article article){

		contenu.add(article);

	}
	
	public void supprimer(Article article){
		
		contenu.remove(article);
	}


	@Override
	public String toString() {
		return "Panier [contenu=" + contenu + "]";
	}


	
}
