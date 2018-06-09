package bean;



import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entitie.Article;
import entitie.Critere;
import entitie.Individu;
import service.ArticleService;
import service.CritereService;
import service.IndividuService;

@ManagedBean
@SessionScoped
public class CibleDeRoutageBean {
	private static final long serialVersionUID = 1L;

	// @Autowired
	private NavigationBean navigationBean;

	private IndividuService individuService;

	private ArticleService articleService;
	
	private CritereService critereService;

	private Individu individu;

	private Article article;
	
	private Critere critere;
	
	public String ajouterPublicite() {
		if(verifierIndividu() && verifierCritere() && verifierArticle()) {
			return navigationBean.goAccueil();
		}else {
			return navigationBean.goCritere();
		}
	}
	
	private boolean verifierIndividu() {
		if(individuService.individuExiste(individu.getNom(),individu.getPrenom()) == null) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean verifierCritere() {
		if(critere == null) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean verifierArticle() {
		if(article == null) {
			return false;
		}else {
			return true;
		}
	}
}
