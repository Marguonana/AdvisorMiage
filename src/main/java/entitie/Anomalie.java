package entitie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Anomalie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue/*(strategy = GenerationType.AUTO)*/
	private Long id;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;
	
	
	public Anomalie() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}