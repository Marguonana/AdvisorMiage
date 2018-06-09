package entitie;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="article")
@NamedQueries({
	@NamedQuery(name = "Article.All", query = "SELECT a FROM Article a"),
	@NamedQuery(name = "Article.ById", query = "SELECT a FROM Article a WHERE a.id =:article")
})
public class Article implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	
	@Column( name="designation")
	private String designation; 
	
	@Column( name="prix_de_vente")
	private String prixDeVente;
	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id")
//	private List<Publicite> publicites;
//	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id")
//	private List<Commande> commandes;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "admin_id")
//	private Administrateur admin;
	
	
	public Article() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPrixDeVente() {
		return prixDeVente;
	}

	public void setPrixDeVente(String prixDeVente) {
		this.prixDeVente = prixDeVente;
	}
}