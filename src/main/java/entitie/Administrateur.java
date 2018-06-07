package entitie;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table
@NamedQueries({
	@NamedQuery(name = "Administrateur.ForConnection", query = "SELECT a FROM Administrateur a WHERE a.email =:email AND a.mdp =:mdp")
})
public class Administrateur extends Utilisateur {

	private static final long serialVersionUID = 1L;

	@Column(name = "mot_de_passe")
	private String mdp;
	
	@OneToMany(mappedBy="admin")
	private ArrayList<Individu> individus;

	@OneToMany(mappedBy="admin")
	private ArrayList<Article> articles;

	
	public Administrateur() {

	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public ArrayList<Individu> getIndividus() {
		return individus;
	}

	public void setIndividus(ArrayList<Individu> individus) {
		this.individus = individus;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
}