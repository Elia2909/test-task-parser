package parsexml.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import parsexml.model.Client;
import parsexml.repository.ClientRepository;
import parsexml.service.ClientService;

import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client add(Client client) {
        return clientRepository.create(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }
}
