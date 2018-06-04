package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitie.Client;


public class ClientDAO extends GenericDAO<Client> {
	
	public Client create(Client client) {
		return super.create(client);
	}

	public Client update(Client client) {
		return super.update(client);
	}

	public void delete(Client client) {
		super.delete(client);
	}
	
	public List<Client> findAll() {
		return super.listByNamedQuery("Utilisateur.All");
	}
	
	public Client getById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("utilisateur", id);
		return super.singleByNamedQuery("Utilisateur.ById", parameters);
	}

	public Client clientExiste(String nom, String prenom) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("nom", nom);
		parameters.put("prenom", prenom);
		return super.singleByNamedQuery("Client.CheckExist", parameters);
	}
}
