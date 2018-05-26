package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitie.Administrateur;

public class AdministrateurDAO extends GenericDAO<Administrateur> {
	
	public Administrateur create(Administrateur administrateur) {
		return super.create(administrateur);
	}

	public Administrateur update(Administrateur administrateur) {
		return super.update(administrateur);
	}

	public void delete(Administrateur administrateur) {
		super.delete(administrateur);
	}
	
	public List<Administrateur> findAll() {
		return super.listByNamedQuery("Utilisateur.All");
	}
	
	public Administrateur getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("utilisateur", id);
		return super.singleByNamedQuery("Utilisateur.ById", parameters);
	}
}
