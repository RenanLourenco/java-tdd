package main.br.com.renan.services;

import main.br.com.renan.domain.Client;

public interface IClientService {
    public void save(Client client);

    Client findByCpf(String cpf);
}
