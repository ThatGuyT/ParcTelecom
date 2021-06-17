package com.banque.ParcTelecom.repositery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banque.ParcTelecom.models.TypeMateriel;

@Repository
public interface TypeMaterielRepository extends CrudRepository<TypeMateriel, Long>{

}
