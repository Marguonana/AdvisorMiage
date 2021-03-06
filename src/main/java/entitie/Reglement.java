package entitie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reglement")
public class Reglement implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name ="numero")
	private int numero;
	
	@Column(name ="information_complementaire")
	private String informationComplementaire;
	
	@Column(name ="type")
	private String type;
	
//	@OneToMany(mappedBy="reglement", fetch = FetchType.LAZY)
//	private List<Commande> commandes;
	
	
	public Reglement() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getInformationComplementaire() {
		return informationComplementaire;
	}


	public void setInformationComplementaire(String informationComplementaire) {
		this.informationComplementaire = informationComplementaire;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}