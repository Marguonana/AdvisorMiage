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
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="publicite")
public class Publicite implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "type" )
	private String type;
	
	@Column(name = "titre" )
	private String titre;
	
	@Column(name = "description")
	private String description;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "critere_id")
	private Critere critere;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@OrderBy("designation")
	private List<Article> articles;
	
	
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


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}