package parsexml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parsexml.model.Client;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client create(Client client);

    List<Client> getAll();
}
