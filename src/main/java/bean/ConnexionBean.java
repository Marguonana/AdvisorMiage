package bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entitie.Administrateur;
import service.AdministrateurService;

@ManagedBean
@SessionScoped
public class ConnexionBean implements Serializable { //backing-bean
    private static final long serialVersionUID = 1L;

    //@Autowired
    private NavigationBean navigationBean;
    
    private Administrateur administrateur;
    
    private AdministrateurService administrateurService;

	private String email;

	private String motDePasse;
	
	private String message;
	
	@PostConstruct
	public void init() {
        System.out.println("init");
		administrateur = new Administrateur("Darkaoui", "Fakih", "admin@fenouil.fr", "admin");
		administrateurService.create(administrateur);
		email = "admin@fenouil.fr";
		motDePasse = "admin";
		connexion();
	}
	
	public String connexion() {
        System.out.println("connexion");
		this.administrateur = administrateurService.seConnecter(email, motDePasse);
		if(this.administrateur != null) {
	        message = "Succès de la connexion !";
	        System.out.println(message);
	        return navigationBean.goAccueil();
		} else {
	        message = "Erreur de connexion !";
	        System.out.println(message);
	        return navigationBean.goConnexion();
		}
	}

	public NavigationBean getNavigationBean() {
		return navigationBean;
	}

	public void setNavigationBean(NavigationBean navigationBean) {
		this.navigationBean = navigationBean;
	}

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	public AdministrateurService getAdministrateurService() {
		return administrateurService;
	}

	public void setAdministrateurService(AdministrateurService administrateurService) {
		this.administrateurService = administrateurService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
