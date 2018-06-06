package service;

import dao.PubliciteDAO;
import entitie.Publicite;


public class PubliciteService {
	
	PubliciteDAO publiciteDAO = new PubliciteDAO();
	
	public Publicite create(Publicite publicite) {
		return publiciteDAO.create(publicite);
	}

	public Publicite update(Publicite publicite) {
		return publiciteDAO.update(publicite);
	}
}
