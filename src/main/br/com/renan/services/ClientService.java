package main.br.com.renan.services;

import main.br.com.renan.dao.ClientDAO;
import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;

public class ClientService implements IClientService{
    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }

    @Override
    public void save(Client client) {
        clientDAO.create(client);
    }

    @Override
    public Client findByCpf(String cpf) {
        return this.clientDAO.findByCpf(cpf);
    }
}
