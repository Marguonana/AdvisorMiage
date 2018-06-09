package entitie;

import java.util.List;
import java.util.Date;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name="individu")
@NamedQueries({
	@NamedQuery(name = "Individu.CheckExist", query = "SELECT i FROM Individu i WHERE i.nom =:nom AND i.prenom =:prenom")
})
public class Individu extends Utilisateur {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "date_naissance")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissance;

	@Column(name = "categorie_socio")
	private String categorieSocio;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "caracteristique_commerciale")
	private String caracteristiqueCommerciale;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "code_postal")
	private int codePostal;

	@Column(name = "ville")
	private String ville;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admin_id")
	private Administrateur admin;

	@OneToMany(mappedBy = "individu", fetch = FetchType.LAZY)
	@OrderBy("date")
	private List<Commande> commandes;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	@OrderBy("type")
	private List<Critere> criteres;

	
	public Individu() {

	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCategorieSocio() {
		return categorieSocio;
	}

	public void setCategorieSocio(String categorieSocio) {
		this.categorieSocio = categorieSocio;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCaracteristiqueCommerciale() {
		return caracteristiqueCommerciale;
	}

	public void setCaracteristiqueCommerciale(String caracteristiqueCommerciale) {
		this.caracteristiqueCommerciale = caracteristiqueCommerciale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Administrateur getAdmin() {
		return admin;
	}

	public void setAdmin(Administrateur admin) {
		this.admin = admin;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<Critere> getCriteres() {
		return criteres;
	}

	public void setCriteres(List<Critere> criteres) {
		this.criteres = criteres;
	}
}