package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitie.Individu;

public class IndividuDAO extends GenericDAO<Individu> {
	
	public Individu create(Individu individu) {
		return super.create(individu);
	}

	public Individu update(Individu individu) {
		return super.update(individu);
	}

	public void delete(Individu individu) {
		super.delete(individu);
	}
	
	public List<Individu> findAll() {
		return super.listByNamedQuery("Utilisateur.All");
	}
	
	public Individu getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("utilisateur", id);
		return super.singleByNamedQuery("Utilisateur.ById", parameters);
	}
}
