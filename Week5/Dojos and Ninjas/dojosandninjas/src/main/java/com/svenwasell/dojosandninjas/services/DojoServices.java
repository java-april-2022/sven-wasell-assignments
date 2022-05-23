package com.svenwasell.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.svenwasell.dojosandninjas.models.Dojo;
import com.svenwasell.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoServices {
	
    private final DojoRepository dojoRepository;
    
    public DojoServices(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }
    
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    public Dojo updateDojo(Dojo dojo) {
    	return dojoRepository.save(dojo);
    }
    public void deleteDojo(Long id) {
    	Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
        	dojoRepository.deleteById(id);
        }
    	
    }

	public Dojo findById(Long id) {
		Optional<Dojo> result = dojoRepository.findById(id);
		if(result.isPresent()) {
			return result.get();		
		} else {
			return null;
		}
		
	}
}