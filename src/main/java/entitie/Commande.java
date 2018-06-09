package entitie;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commande")
@NamedQueries({
	@NamedQuery(name = "Commande.All", query = "SELECT c FROM Commande c"),
	@NamedQuery(name = "Commande.ById", query = "SELECT c FROM Commande c WHERE c.id =:commande")
})
public class Commande implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
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

	@ManyToMany(fetch = FetchType.LAZY)
	@OrderBy("designation")
	private List<Article> articles;
	
	@OneToMany(fetch = FetchType.LAZY)
	@OrderBy("description")
	private List<Anomalie> anomalies;

	
	public Commande() {

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

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Anomalie> getAnomalies() {
		return anomalies;
	}

	public void setAnomalies(List<Anomalie> anomalies) {
		this.anomalies = anomalies;
	}

	public Reglement getReglement() {
		return reglement;
	}

	public void setReglement(Reglement reglement) {
		this.reglement = reglement;
	}

	public Individu getIndividu() {
		return individu;
	}

	public void setIndividu(Individu individu) {
		this.individu = individu;
	}
}