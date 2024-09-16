package main.br.com.renan.dao;

import main.br.com.renan.domain.Client;

public interface IClientDAO {
    Boolean create(Client client);
    Client findByCpf(String cpf);

    Boolean delete(String cpf);

    void update(Client client);
}
