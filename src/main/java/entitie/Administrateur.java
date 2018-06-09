package entitie;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name="administrateur")
@NamedQueries({
	@NamedQuery(name = "Administrateur.ForConnection", query = "SELECT a FROM Administrateur a WHERE a.email =:email AND a.mdp =:mdp")
})
public class Administrateur extends Utilisateur {

	private static final long serialVersionUID = 1L;

	@Column(name = "mot_de_passe")
	private String mdp;
	
	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY)
	@OrderBy("nom")
	private List<Individu> individus;

	@OneToMany(fetch = FetchType.LAZY)
	@OrderBy("designation")
	private List<Article> articles;

	
	public Administrateur() {

	}
	
	public Administrateur(String nom, String prenom, String email, String mdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
	}

	public Administrateur(String mdp) {
		super();
		this.mdp = mdp;
	}



	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public List<Individu> getIndividus() {
		return individus;
	}

	public void setIndividus(List<Individu> individus) {
		this.individus = individus;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}