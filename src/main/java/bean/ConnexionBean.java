package bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
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
	
	public String connexion() {
		this.administrateur = administrateurService.seConnecter(email, motDePasse);
		FacesMessage message;
		if(this.administrateur != null) {
	        message = new FacesMessage( "Succès de la connexion !" );
	        return navigationBean.goAccueil();
		} else {
	        message = new FacesMessage( "Erreur de connexion !" );
	        return navigationBean.goConnexion();
		}
        //FacesContext.getCurrentInstance().addMessage( null, message );
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
