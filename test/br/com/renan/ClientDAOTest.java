package br.com.renan;

import br.com.renan.mock.ClientDAOMock;
import main.br.com.renan.dao.ClientDAO;
import main.br.com.renan.dao.IClientDAO;
import main.br.com.renan.domain.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientDAOTest {
    private IClientDAO clientDAO;
    private Client client;

    public ClientDAOTest(){
        IClientDAO mockDao = new ClientDAOMock();
        this.clientDAO = mockDao;
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
        clientDAO.create(client);
        Client findClient = clientDAO.findByCpf(client.getCpf());

        Assert.assertNotNull(findClient);
    }

}
