package desc;
import java.util.*;
public class Commercial {
	private char categorie;
	private String nom;
	private String prenom;
	private int puissanceVoiture;
	private List<NoteFrais> mesNotes;
	
	
	public Commercial( char categorie, String nom, String prenom, int puissanceVoiture) {
		this.categorie = categorie;
		this.nom = nom;
		this.prenom = prenom;
		this.puissanceVoiture = puissanceVoiture;
	}

	@Override
	public String toString() {
		return "le Commercial : "+nom+" "+prenom+", la categorie : "+categorie+" et enfin la puissance de la voiture : "+puissanceVoiture;
		
	}
	
	
	
	public char getCategorie() {
		return this.categorie;
	}
	public void setCategorie(char categorie) {
		this.categorie = categorie;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public int getPuissanceVoiture() {
		return this.puissanceVoiture;
	}
	public void setPuissanceVoiture(int puissanceVoiture) {
		this.puissanceVoiture = puissanceVoiture;
	}
}
