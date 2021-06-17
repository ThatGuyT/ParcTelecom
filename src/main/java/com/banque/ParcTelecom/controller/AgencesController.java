package com.banque.ParcTelecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banque.ParcTelecom.models.Agences;
import com.banque.ParcTelecom.repositery.AgencesRepository;

@RestController
public class AgencesController {

	@Autowired
	AgencesRepository agencesrepository;
	@GetMapping("GetA")
	public Agences getagences() {
		return agencesrepository.findById(Long.parseLong("1")).get();
	}
}
