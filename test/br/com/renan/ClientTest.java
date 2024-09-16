package br.com.renan;

import br.com.renan.mock.ClientDAOMock;
import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;
import main.br.com.renan.services.ClientService;
import main.br.com.renan.services.IClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    private IClientService clientService;

    public ClientTest(){
        IClientDAO mockDao = new ClientDAOMock();
        clientService = new ClientService(mockDao);
    }

    @Test
    public void searchClient(){
        Client client = new Client();
        client.setCpf("1231231233");
        client.setName("Renan");
        client.setStreet("Rua Jorge Augusto");
        client.setCity("São Paulo");
        client.setState("SP");
        client.setTel("11912341234");
        client.setNumber(1424);

        clientService.save(client);
        Client findClient = clientService.findByCpf(client.getCpf());

        Assert.assertNotNull(findClient);
    }
}
