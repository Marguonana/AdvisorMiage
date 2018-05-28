package entitie;


import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "publicite")
public class Publicite {

	@Column(name = "type" )
	private Enum type;
	
	@Column(name = "type" )
	private String titre;
	
	@Column(name = "description")
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Critere> criteres;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Article> articles;
	
	public Publicite() {
		
	}

	public Enum getType() {
		return type;
	}

	public void setType(Enum type) {
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

	public ArrayList<Critere> getCriteres() {
		return criteres;
	}

	public void setCriteres(ArrayList<Critere> criteres) {
		this.criteres = criteres;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	
	
}