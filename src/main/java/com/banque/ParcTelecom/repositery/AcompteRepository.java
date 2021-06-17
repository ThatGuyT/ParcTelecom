package com.banque.ParcTelecom.repositery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banque.ParcTelecom.models.Acompte;

@Repository
public interface AcompteRepository extends CrudRepository<Acompte, Long> {

}
