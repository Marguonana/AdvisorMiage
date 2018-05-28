package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entitie.Article;
import entitie.Individu;
import service.ArticleService;
import service.IndividuService;

@ManagedBean
@SessionScoped
public class GestionPageAdministrateurBean implements Serializable { // backing-bean
	private static final long serialVersionUID = 1L;

	// @Autowired
	private NavigationBean navigationBean;

	private IndividuService individuService;

	private ArticleService articleService;

	private Individu individu;

	private Article article;

	public String modifierIndividu() {
		individuService.update(individu);
		return "";
	}

	public String modifierArticle() {
		articleService.update(article);
		return "";
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

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	public Individu getIndividu() {
		return individu;
	}

	public void setIndividu(Individu individu) {
		this.individu = individu;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
