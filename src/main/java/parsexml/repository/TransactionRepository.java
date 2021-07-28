package parsexml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import parsexml.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction create(Transaction transaction);

    List<Transaction> getAll();
}
