package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NavigationBean implements Serializable { //backing-bean
    private static final long serialVersionUID = 1L;

	public String goConnexion() {
		return "Connexion";
	}

	public String goAccueil() {
		return "Accueil";
	}
	
	public String goCommande() {
		return "Commande";
	}
	
	public String goCommandes() {
		return "Commandes";
	}
}
