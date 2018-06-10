package bean;



<<<<<<< HEAD
import java.io.Serializable;
import java.util.List;

=======
>>>>>>> f3159f8cbdfb75b2ba274179612298c0733109ec
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entitie.*;
import entitie.Critere;
import entitie.Individu;
import entitie.Publicite;
import service.ArticleService;
import service.CritereService;
import service.IndividuService;
import service.PubliciteService;

@ManagedBean
@SessionScoped
public class CibleDeRoutageBean {
	private static final long serialVersionUID = 1L;

	// @Autowired
	private NavigationBean navigationBean;

	private IndividuService individuService;

	private ArticleService articleService;
	
	private CritereService critereService;

	private PubliciteService publiciteService;
	
	private Individu individu;

	private List<Article> article;
	
	private Critere critere;
	
	private Publicite publicite;
	
	public String ajouterPublicite() {
		if(verifierIndividu() && verifierCritere() && verifierArticle()) {
			publicite.setCritere(critere);
			publicite.setArticles(article);
			
			publiciteService.create(publicite);
			return navigationBean.goAccueil();
		}else {
			return navigationBean.goCritere();
		}
	}
	
	public IndividuService getIndividuService() {
		return individuService;
	}

	public void setIndividuService(IndividuService individuService) {
		this.individuService = individuService;
	}

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	public CritereService getCritereService() {
		return critereService;
	}

	public void setCritereService(CritereService critereService) {
		this.critereService = critereService;
	}

	public Individu getIndividu() {
		return individu;
	}

	public void setIndividu(Individu individu) {
		this.individu = individu;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public Critere getCritere() {
		return critere;
	}

	public void setCritere(Critere critere) {
		this.critere = critere;
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
