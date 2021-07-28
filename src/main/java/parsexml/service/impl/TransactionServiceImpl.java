package parsexml.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import parsexml.model.Transaction;
import parsexml.repository.TransactionRepository;
import parsexml.service.TransactionService;

import java.util.List;

@Component
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction add(Transaction transaction) {
        return transactionRepository.create(transaction);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionRepository.getAll();
    }
}
