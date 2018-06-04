package dao;

import java.util.HashMap;
import java.util.Map;

import entitie.Article;


public class ArticleDAO extends GenericDAO<Article> {
	
	public Article create(Article article) {
		return super.create(article);
	}

	public Article update(Article article) {
		return super.update(article);
	}

	public void delete(Article article) {
		super.delete(article);
	}
	
	public Article getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("article", id);
		return super.singleByNamedQuery("Article.ById", parameters);
	}
}
