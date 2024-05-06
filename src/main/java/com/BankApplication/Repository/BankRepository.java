package com.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankApplication.Model.BankModel;

@Repository
public interface BankRepository extends JpaRepository<BankModel, Integer> {
	

}
