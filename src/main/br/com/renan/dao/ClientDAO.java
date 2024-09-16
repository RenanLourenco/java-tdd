package main.br.com.renan.dao;

import main.br.com.renan.domain.Client;

public class ClientDAO implements IClientDAO{
    @Override
    public Boolean create(Client client) {
        return true;
    }

    @Override
    public Client findByCpf(String cpf) {
        return null;
    }

    @Override
    public Boolean delete(String cpf) {
        return true;
    }
}
