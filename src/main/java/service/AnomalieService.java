package service;

import java.util.List;

import dao.AnomalieDAO;
import entitie.Anomalie;

public class AnomalieService {

	AnomalieDAO anomalieDAO = new AnomalieDAO();
	
	public Anomalie create(Anomalie anomalie) {
		return anomalieDAO.create(anomalie);
	}
	
	public void delete(Anomalie anomalie) {
		anomalieDAO.delete(anomalie);
	}
	
	public List<Anomalie> findAll(){
		return anomalieDAO.findAll();
	}
	
	public Anomalie getById(Long id) {
		return anomalieDAO.getById(id);
	}
}
