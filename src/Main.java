package src;

public class Main {
  public static void main(String[] args) {
    Bibliotheque bibliotheque = new Bibliotheque();
    Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
    Livre livre2 = new Livre("1984", "George Orwell", 1949);
    Livre livre3 = new Livre("Harry Potter", "J.K. Rowling", 1997);


    bibliotheque.ajouterLivre(livre1);
    bibliotheque.ajouterLivre(livre2);
    bibliotheque.ajouterLivre(livre3);

    bibliotheque.afficherLivres();
  }
}