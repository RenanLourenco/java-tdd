package main.br.com.renan.dao;

import main.br.com.renan.domain.Client;

public interface IClientDAO {
    void create(Client client);
    Client findByCpf(String cpf);
}
