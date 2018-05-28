package entitie;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "administrateur")
@NamedQueries({
	@NamedQuery(name = "Administrateur.ForConnection", query = "SELECT a FROM Administrateur a WHERE a.email =:email AND a.mdp =:mdp")
})
public class Administrateur extends Utilisateur {

	@Column(name = "mot_de_passe")
	private String mdp;
	
	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY)
	private ArrayList<Individu> individus;

	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY)
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