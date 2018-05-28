package entitie;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Precise que ce bean est géré par JSF
@ManagedBean
// Precise au serveur que ce bean a pour portée la requete
@RequestScoped
// EJB Entity
@Entity
public class Reglement {
	
	@Column(name ="numero")
	private int numero;
	
	@Column(name ="information_complementaire")
	private String informationComplementaire;
	
	@Column(name ="type")
	private String type;
	
	@OneToMany(mappedBy="reglement", fetch = FetchType.LAZY)
	private ArrayList<Commande> commandes;
	
	public Reglement() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getInformationComplementaire() {
		return informationComplementaire;
	}

	public void setInformationComplementaire(String informationComplementaire) {
		this.informationComplementaire = informationComplementaire;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
}
