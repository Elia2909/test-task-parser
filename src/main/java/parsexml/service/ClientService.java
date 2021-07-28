package parsexml.service;

import java.util.List;

import org.springframework.stereotype.Service;
import parsexml.model.Client;

public interface ClientService {
    Client add(Client client);

    List<Client> getAll();
}
