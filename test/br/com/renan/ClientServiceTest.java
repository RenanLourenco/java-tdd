package br.com.renan;

import br.com.renan.mock.ClientDAOMock;
import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;
import main.br.com.renan.services.ClientService;
import main.br.com.renan.services.IClientService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientServiceTest {

    private IClientService clientService;
    private Client client;

    public ClientServiceTest(){
        IClientDAO mockDao = new ClientDAOMock();
        clientService = new ClientService(mockDao);
    }

    @Before
    public void init() {
        Client client = new Client();
        client.setCpf("1231231233");
        client.setName("Renan");
        client.setStreet("Rua Jorge Augusto");
        client.setCity("São Paulo");
        client.setState("SP");
        client.setTel("11912341234");
        client.setNumber(1424);
        this.client = client;
    }

    @Test
    public void searchClient(){
        clientService.save(client);
        Client findClient = clientService.findByCpf(client.getCpf());

        Assert.assertNotNull(findClient);
    }

    @Test
    public void saveClient(){
        Boolean save = clientService.save(client);
        Assert.assertTrue(save);
    }

    @Test
    public void deleteClient() {
        Boolean delete = clientService.exclude(client.getCpf());
        Assert.assertTrue(delete);
    }

    @Test
    public void updateClient(){
        client.setName("Update");
        clientService.update(client);

        Assert.assertEquals("Update", client.getName());
    }
}
