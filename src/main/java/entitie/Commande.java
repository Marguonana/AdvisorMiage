package entitie;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@Column(name = "date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "individu_id")
	private Individu individu;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reglement_id")
	private Reglement reglement;

	@OneToMany(mappedBy="commande", fetch = FetchType.LAZY)
	private ArrayList<Article> articles;
	
	@OneToMany(mappedBy="commande", fetch = FetchType.LAZY)
	private ArrayList<Anomalie> anomalies;

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