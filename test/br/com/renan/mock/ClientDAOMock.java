package br.com.renan.mock;

import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;

public class ClientDAOMock implements IClientDAO {
    @Override
    public Boolean create(Client client) {
        return true;
    }

    @Override
    public Client findByCpf(String cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }

    @Override
    public Boolean delete(String cpf) {
        return true;
    }
}
