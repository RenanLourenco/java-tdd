package br.com.renan.mock;

import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;

public class ClientDAOMock implements IClientDAO {
    @Override
    public void create(Client client) {

    }

    @Override
    public Client findByCpf(String cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }
}
