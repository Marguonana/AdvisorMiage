package entitie;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
@NamedQueries({
		@NamedQuery(name = "Utilisateur.All", query = "SELECT u FROM Utilisateur u"),
		@NamedQuery(name = "Utilisateur.ById", query = "SELECT u FROM Utilisateur u WHERE u.id =:utilisateur")
})
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "email")
	private String email;

	Utilisateur() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}