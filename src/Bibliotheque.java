package src;
import  java.util.ArrayList;


public class Bibliotheque {
  private ArrayList<Livre> livres;

  public Bibliotheque() {
    this.livres = new ArrayList<>();
  }
  
  public void ajouterLivre(Livre livre) {
    livres.add(livre);
  }

  public void afficherLivres() {
    if (livres.isEmpty()) {
      System.out.println("La bibliothèque est vide.");
    } else {
      System.out.println("Livres dans la bibliotheque:");
      for (Livre livre : livres) {
        livre.afficherDetails();
      }
    }
  }
}
