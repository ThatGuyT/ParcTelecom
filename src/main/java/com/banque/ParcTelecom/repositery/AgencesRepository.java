package com.banque.ParcTelecom.repositery;

import org.springframework.stereotype.Repository;

import com.banque.ParcTelecom.models.Agences;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AgencesRepository extends CrudRepository<Agences,Long> {

}
