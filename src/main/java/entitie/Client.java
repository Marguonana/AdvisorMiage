package entitie;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "client")
@NamedQueries({
		@NamedQuery(name = "Client.CheckExist", query = "SELECT c FROM Client c WHERE c.nom =:nom AND c.prenom =:prenom") })
public class Client extends Individu {

	@Column(name = "etat")
	private String etat;

	public Client() {

	}

	public Client(Individu individu) {
		this.setDateNaissance(individu.getDateNaissance());
		this.setCategorieSocio(individu.getCategorieSocio());
		this.setTelephone(individu.getTelephone());
		this.setCaracteristiqueCommerciale(individu.getCaracteristiqueCommerciale());
		this.setAdresse(individu.getAdresse());
		this.setCodePostal(individu.getCodePostal());
		this.setVille(individu.getVille());
		this.setAdmin(individu.getAdmin());
		this.setCommandes(individu.getCommandes());
		this.setCriteres(individu.getCriteres());
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}