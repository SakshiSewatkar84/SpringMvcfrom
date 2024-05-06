package com.BankApplication.Services;

import org.springframework.stereotype.Service;

import com.BankApplication.Model.BankModel;

@Service
public interface BankSevice {
	public BankModel create (BankModel bankModel);
	

}
