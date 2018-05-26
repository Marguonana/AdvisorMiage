package entitie;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

//Precise que ce bean est géré par JSF
@ManagedBean
// Precise au serveur que ce bean a pour portée la requete
@RequestScoped
// EJB Entity
@Entity
public class Administrateur extends Utilisateur {
	
	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY)
	private ArrayList<Individu> individus;

	@OneToMany(mappedBy="admin", fetch = FetchType.LAZY)
	private ArrayList<Article> articles;

	public Administrateur() {

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