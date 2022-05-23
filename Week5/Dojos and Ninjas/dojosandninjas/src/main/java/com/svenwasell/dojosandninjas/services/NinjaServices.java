package com.svenwasell.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.svenwasell.dojosandninjas.models.Dojo;
import com.svenwasell.dojosandninjas.models.Ninja;
import com.svenwasell.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaServices {
	
    private final NinjaRepository ninjaRepository;
    
    public NinjaServices(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
   
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    
    public Ninja updateNinja(Ninja ninja) {
    	return ninjaRepository.save(ninja);
    }
    
    public void deleteExpense(Long id) {
    	Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            ninjaRepository.deleteById(id);
        }
    }
	
    public Ninja findById(Long id) {
		Optional<Ninja> result = ninjaRepository.findById(id);
		if(result.isPresent()) {
			return result.get();		
		} else {
			return null;
		}
	}

}
