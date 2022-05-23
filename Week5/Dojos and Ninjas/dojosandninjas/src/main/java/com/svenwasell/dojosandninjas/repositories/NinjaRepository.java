package com.svenwasell.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svenwasell.dojosandninjas.models.Dojo;
import com.svenwasell.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository <Ninja, Long> {
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
