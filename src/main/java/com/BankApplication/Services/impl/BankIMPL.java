package com.BankApplication.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApplication.Model.BankModel;
import com.BankApplication.Repository.BankRepository;
import com.BankApplication.Services.BankSevice;

@Service
public class BankIMPL implements BankSevice {
@Autowired
BankRepository bankRepository;
	@Override
	public BankModel create(BankModel bankModel) {
		return bankRepository.save(bankModel);
	}

}
