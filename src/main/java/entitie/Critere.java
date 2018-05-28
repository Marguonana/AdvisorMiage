package entitie;


import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

//Precise que ce bean est géré par JSF
@ManagedBean
// Precise au serveur que ce bean a pour portée la requete
@RequestScoped
// EJB Entity
@Entity
public class Critere {
	

	@Column(name = "valide")
	private Boolean valide;
	
	@Column(name = "type")
	private Enum type;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Individu> individus;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Publicite> publicites;

	public Critere() {
		
	}
	
	public Boolean getValide() {
		return valide;
	}

	public void setValide(Boolean valide) {
		this.valide = valide;
	}

	public Enum getType() {
		return type;
	}

	public void setType(Enum type) {
		this.type = type;
	}

	public ArrayList<Individu> getIndividus() {
		return individus;
	}

	public void setIndividus(ArrayList<Individu> individus) {
		this.individus = individus;
	}

	public ArrayList<Publicite> getPublicites() {
		return publicites;
	}

	public void setPublicites(ArrayList<Publicite> publicites) {
		this.publicites = publicites;
	}
	
	
}
