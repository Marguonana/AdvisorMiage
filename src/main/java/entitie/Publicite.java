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
public class Publicite implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue/*(strategy = GenerationType.AUTO)*/
	private Long id;

	@Column(name = "type" )
	private String type;
	
	@Column(name = "type" )
	private String titre;
	
	@Column(name = "description")
	private String description;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Critere critere;
	
	@ManyToMany(mappedBy = "publicites")
	private ArrayList<Article> articles;
	
	
	public Publicite() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Critere getCritere() {
		return critere;
	}


	public void setCritere(Critere critere) {
		this.critere = critere;
	}


	public ArrayList<Article> getArticles() {
		return articles;
	}


	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
}