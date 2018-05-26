package entitie;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client extends Individu {

	@Column(name = "etat")
	private String etat;

	public Client() {

	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}