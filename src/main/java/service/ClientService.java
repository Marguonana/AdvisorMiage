package service;

import java.util.List;

import dao.ClientDAO;
import entitie.Client;

public class ClientService {
	
	ClientDAO clientDAO = new ClientDAO();
	
	public Client create(Client client) {
		return clientDAO.create(client);
	}

	public Client update(Client client) {
		return clientDAO.update(client);
	}

	public void delete(Client client) {
		clientDAO.delete(client);
	}
	
	public List<Client> findAll(){
		return clientDAO.findAll();
	}
	
	public Client getById(Long id) {
		return clientDAO.getById(id);
	}

	public Client clientExiste(String nom, String prenom) {
		return clientDAO.clientExiste(nom, prenom);
	}
}
