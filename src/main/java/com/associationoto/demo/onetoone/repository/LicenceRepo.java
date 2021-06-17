package com.associationoto.demo.onetoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.associationoto.demo.onetoone.entities.Licence;

public interface LicenceRepo extends CrudRepository<Licence, Integer> {

}
