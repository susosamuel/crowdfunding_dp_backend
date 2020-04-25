package com.crowdfunding.dp.backend.dao;

import com.crowdfunding.dp.backend.model.Project;
import com.crowdfunding.dp.backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByProject(Project project);
}
