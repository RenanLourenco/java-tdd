package main.br.com.renan.services;

import main.br.com.renan.domain.Client;

public interface IClientService {
    public Boolean save(Client client);

    Client findByCpf(String cpf);

    Boolean exclude(String cpf);

    void update(Client client);
}
