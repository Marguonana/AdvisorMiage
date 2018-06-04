package service;

import dao.ArticleDAO;
import entitie.Article;


public class ArticleService {
	
	ArticleDAO articleDAO = new ArticleDAO();
	
	public Article create(Article article) {
		return articleDAO.create(article);
	}

	public Article update(Article article) {
		return articleDAO.update(article);
	}

	public void delete(Article article) {
		articleDAO.delete(article);
	}
	
	public Article getById(Long id) {
		return articleDAO.getById(id);
	}
}
