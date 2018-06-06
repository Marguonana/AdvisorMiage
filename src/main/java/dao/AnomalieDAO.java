package dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitie.Anomalie;
import entitie.Individu;


public class AnomalieDAO extends GenericDAO<Anomalie>{

	public Anomalie create(Anomalie anomalie) {
		return super.create(anomalie);
	}

	public void delete(Anomalie anomalie) {
		super.delete(anomalie);
	}
	
	public List<Anomalie> findAll() {
		return super.listByNamedQuery("Anomalie.All");
	}
	
	public Anomalie getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("anomalie", id);
		return super.singleByNamedQuery("Anomalie.ById", parameters);
	}

}
