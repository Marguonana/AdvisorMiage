package service;

import java.util.List;

import dao.CommandeDAO;
import entitie.Commande;

public class CommandeService {
	
	CommandeDAO commandeDAO = new CommandeDAO();
	
	public Commande create(Commande commande) {
		return commandeDAO.create(commande);
	}

	public Commande update(Commande commande) {
		return commandeDAO.update(commande);
	}

	public void delete(Commande commande) {
		commandeDAO.delete(commande);
	}
	
	public List<Commande> findAll(){
		return commandeDAO.findAll();
	}
	
	public Commande getById(Long id) {
		return commandeDAO.getById(id);
	}
}