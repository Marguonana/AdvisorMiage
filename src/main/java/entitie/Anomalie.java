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
public class Anomalie {
	
	@Column(name="descaription")
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Commande> commandes;
	
	public Anomalie() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
}
