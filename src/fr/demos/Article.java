package fr.demos;

public class Article {

	
		private double prixHt, stock;
		private String description, reference;
		
		public Article(String d, String ref, double prix, double stock){
			
			this.description=d;
			this.reference=ref;
			this.prixHt=prix;
			this.stock=stock;
			
		}


		public double getPrixHt() {
			return prixHt;
		}

		public void setPrixHt(double prixHt) {
			this.prixHt = prixHt;
		}

		
		public double getStock() {
			return stock;
		}

	
		public void setStock(double stock) {
			this.stock = stock;
		}

	
		public String getDescription() {
			return description;
		}

	
		public String getReference() {
			return reference;
		}

		
		@Override
		public String toString() {
			return "Article [prixHt=" + prixHt + ", stock=" + stock + ", description=" + description + ", reference="
					+ reference + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
}
