package parsexml.service;

import java.util.List;

import org.springframework.stereotype.Service;
import parsexml.model.Transaction;

public interface TransactionService {
    Transaction add(Transaction transaction);

    List<Transaction> getAll();
}
