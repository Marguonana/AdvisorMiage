package entitie;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "individu")
@NamedQueries({
	@NamedQuery(name = "Individu.CheckExist", query = "SELECT i FROM Individu i WHERE i.nom =:nom AND i.prenom =:prenom")
})
public class Individu extends Utilisateur {
	
	@Column(name = "date_naissance")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissance;

	@Column(name = "categorie_socio")
	private String categorieSocio;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "caracteristique_commerciale")
	private Enum caracteristiqueCommerciale;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "code_postal")
	private int codePostal;

	@Column(name = "ville")
	private String ville;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admin_id")
	private Administrateur admin;

	@OneToMany(mappedBy="individu", fetch = FetchType.LAZY)
	private ArrayList<Commande> commandes;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private ArrayList<Critere> criteres;

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

	public Enum getCaracteristiqueCommerciale() {
		return caracteristiqueCommerciale;
	}

	public void setCaracteristiqueCommerciale(Enum caracteristiqueCommerciale) {
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

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	public ArrayList<Critere> getCriteres() {
		return criteres;
	}

	public void setCriteres(ArrayList<Critere> criteres) {
		this.criteres = criteres;
	}
}