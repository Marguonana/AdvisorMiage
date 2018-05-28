package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entitie.Client;
import entitie.Commande;
import entitie.Individu;
import service.ClientService;
import service.IndividuService;

@ManagedBean
@SessionScoped
public class GestionDeCommandeBean implements Serializable { //backing-bean
    private static final long serialVersionUID = 1L;

    //@Autowired
    private NavigationBean navigationBean;
    
    private IndividuService individuService;
    
    private ClientService clientService;
    
    private Individu individu;
    
    private Commande commande;
    
    private boolean newIndividu;
    
    public String ajouterIndividu() {
    	if(individuService.individuExiste(individu.getNom(), individu.getPrenom()) == null) {
    		//individuService.create(individu);
    		newIndividu = true;
    	}
    	return navigationBean.goCommande();
    }
    
	public String insererInformations() {
		if(verifierCommande()) {
			if(clientService.clientExiste(individu.getNom(), individu.getPrenom()) == null) {
				clientService.create(new Client(individu));
			}
		}
		return navigationBean.goCommandes();
	}
	
	private boolean verifierCommande() {
		if(commande.getArticles().isEmpty()) {
			return false;
		}
		
		if(commande.getReglement().getNumero() == null || commande.getReglement().getInformationComplementaire() == null) {
			Anomalie anomalie = new Anomalie("Problème sur le moyen de paiement");
			commande.getAnomalies().put(anomalie);
			return false;
		} 
		
		if(!commande.getAnomalies().isEmpty()) {
			return false;
		}
		return true;
	}

	public NavigationBean getNavigationBean() {
		return navigationBean;
	}

	public void setNavigationBean(NavigationBean navigationBean) {
		this.navigationBean = navigationBean;
	}

	public IndividuService getIndividuService() {
		return individuService;
	}

	public void setIndividuService(IndividuService individuService) {
		this.individuService = individuService;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public Individu getIndividu() {
		return individu;
	}

	public void setIndividu(Individu individu) {
		this.individu = individu;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public boolean isNewIndividu() {
		return newIndividu;
	}

	public void setNewIndividu(boolean newIndividu) {
		this.newIndividu = newIndividu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
