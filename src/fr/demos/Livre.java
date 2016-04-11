package fr.demos;

public class Livre extends Article {

		private String titre, auteur, editeur, genre;
		
		
		public Livre(String d, String ref, double prix, double stock,String titre, String auteur, String editeur, String genre){
			super(d,ref,prix,stock);
			this.titre=titre;
			this.auteur=auteur;
			this.editeur=editeur;
			this.genre=genre;			
		}


		public String getTitre() {
			return titre;
		}


		public String getAuteur() {
			return auteur;
		}


		public String getEditeur() {
			return editeur;
		}


		public String getGenre() {
			return genre;
		}


		@Override
		public String toString() {
			return "Livre [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", genre=" + genre
					+ ", toString()=" + super.toString() + "]";
		}

		
		
		
		
		
		
		
		
		
		
		
}
