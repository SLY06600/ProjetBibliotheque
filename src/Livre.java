package src;

public class Livre {
  private String titre;
  private String auteur;
  private int anneePublication;

  public Livre(String titre, String auteur, int anneePublication) {
    this.titre = titre;
    this.auteur = auteur;
    this.anneePublication = anneePublication; 
  }

  public void afficherDetails() {
    System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", Année: " + anneePublication);
  }
}