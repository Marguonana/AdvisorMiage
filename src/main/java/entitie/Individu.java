package entitie;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

//Precise que ce bean est géré par JSF
@ManagedBean
// Precise au serveur que ce bean a pour portée la requete
@RequestScoped
// EJB Entity
@Entity
public class Individu extends Utilisateur {
	private Date dateNaissance;
	private String categorieSocio;
	private String telephone;
	private Enum caracteristiqueCommerciale;
	private String adresse;
	private int codePostal;
	private String ville;
	private Administrateur admin;
	private ArrayList<Commande> commandes;
	private ArrayList<Critere> criteres;

	public Individu() {

	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCategorieSocio() {
		return categorieSocio;
	}

	public void setCategorieSocio(String categorieSocio) {
		this.categorieSocio = categorieSocio;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Enum getCaracteristiqueCommerciale() {
		return caracteristiqueCommerciale;
	}

	public void setCaracteristiqueCommerciale(Enum caracteristiqueCommerciale) {
		this.caracteristiqueCommerciale = caracteristiqueCommerciale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	public ArrayList<Critere> getCriteres() {
		return criteres;
	}

	public void setCriteres(ArrayList<Critere> criteres) {
		this.criteres = criteres;
	}
}