package com.banque.ParcTelecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banque.ParcTelecom.repositery.AgencesRepository;

@Service
public class AgencesService {

	@Autowired
	AgencesRepository agencesRepository;

	public AgencesService() {
		//System.out.println(" !!!! -----"+ agencesRepository.findById(Long.parseLong("1")).get().getEmployes().size());
	}
}
