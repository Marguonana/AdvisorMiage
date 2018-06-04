package entitie;


import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "critere")
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