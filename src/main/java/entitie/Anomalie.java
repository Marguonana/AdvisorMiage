package entitie;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "anomalie")
public class Anomalie {
	
	@Column(name="description")
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