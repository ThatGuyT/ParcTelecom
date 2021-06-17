package com.banque.ParcTelecom.repositery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banque.ParcTelecom.models.Prestataire;

@Repository
public interface PrestataireRepository extends CrudRepository<Prestataire, Long> {

}
