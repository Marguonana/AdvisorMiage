package entitie;


import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Critere implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue/*(strategy = GenerationType.AUTO)*/
	private Long id;
	
	@Column(name = "valide")
	private Boolean valide;
	
	@Column(name = "type")
	private String type;
	
	@ManyToMany(mappedBy = "criteres")
	private ArrayList<Individu> individus;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Publicite publicite;

	
	public Critere() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Boolean getValide() {
		return valide;
	}


	public void setValide(Boolean valide) {
		this.valide = valide;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public ArrayList<Individu> getIndividus() {
		return individus;
	}


	public void setIndividus(ArrayList<Individu> individus) {
		this.individus = individus;
	}


	public Publicite getPublicite() {
		return publicite;
	}


	public void setPublicite(Publicite publicite) {
		this.publicite = publicite;
	}
}