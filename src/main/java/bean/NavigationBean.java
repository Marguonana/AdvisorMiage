package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NavigationBean implements Serializable {
    private static final long serialVersionUID = 1L;

	public String goConnexion() {
		return "Connexion";
	}

	public String goAccueil() {
		return "/WEB-INF/pages/suiviCommande.xhtml";
	}
	
	public String goCommande() {
		return "Commande";
	}
	
	public String goCommandes() {
		return "Commandes";
	}
	
	public String goCritere() {
		return "Critere";
	}
}
