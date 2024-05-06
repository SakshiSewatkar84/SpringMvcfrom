package com.BankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankApplication.Model.BankModel;
import com.BankApplication.Services.impl.BankIMPL;

@Controller
@RequestMapping("/yourEntity")
public class BankController {
	@Autowired
	BankIMPL bankIMPL;
	
//	@PostMapping("/bank")
//	public BankModel get (@RequestBody BankModel bankModel) {
//		return bankIMPL.create(bankModel);
//	}
	@GetMapping("/form")
    public String showForm() {
        return "bank"; 
	}
	
	
	@PostMapping("/save")
	public String get ( BankModel bankModel) {
		bankIMPL.create(bankModel);
		return  "redirect:/yourEntity/form";
	}

}
