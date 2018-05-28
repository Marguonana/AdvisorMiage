package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitie.Commande;

public class CommandeDAO extends GenericDAO<Commande> {
	
	public Commande create(Commande commande) {
		return super.create(commande);
	}

	public Commande update(Commande commande) {
		return super.update(commande);
	}

	public void delete(Commande commande) {
		super.delete(commande);
	}
	
	public List<Commande> findAll() {
		return super.listByNamedQuery("Commande.All");
	}
	
	public Commande getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("commande", id);
		return super.singleByNamedQuery("Commande.ById", parameters);
	}
}