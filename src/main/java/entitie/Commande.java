package entitie;

import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

//Precise que ce bean est géré par JSF
@ManagedBean
// Precise au serveur que ce bean a pour portée la requete
@RequestScoped
// EJB Entity
@Entity
public class Commande {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )*/
	private Long id;

	private Date date;
	
	private ArrayList<Article> articles;
	private ArrayList<Anomalie> anomalies;
	
	private Individu individu;
	private Reglement reglement;

	Commande() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public ArrayList<Anomalie> getAnomalies() {
		return anomalies;
	}

	public void setAnomalies(ArrayList<Anomalie> anomalies) {
		this.anomalies = anomalies;
	}

	public Reglement getReglement() {
		return reglement;
	}

	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
	}
}