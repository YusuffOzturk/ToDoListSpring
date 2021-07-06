package com.example.yapilacaklar.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.yapilacaklar.entity.YapilacaklarModel;
import com.example.yapilacaklar.entity.Yapilacaklar;
import com.example.yapilacaklar.repository.YapilacaklarRepository;

@RestController

public	class YapilacaklarController {
	
	@Autowired
	private YapilacaklarRepository repository;
	
	@GetMapping("/yapilacaklar")
		List<Yapilacaklar> findAll(){
		
		return repository.findAll();
	}
	

	@GetMapping("/yapilacaklar/{id}")
	Optional<Yapilacaklar> findOneById(@PathVariable Long id) { 
        return repository.findById(id);
        		}
	
	
	@PostMapping("/yapilacaklar")
    	String updateYapilacaklar(@RequestBody YapilacaklarModel updateYapilacaklar) {
		Optional<Yapilacaklar> ent= repository.findById(updateYapilacaklar.getId());
		ent.get().setTamam(updateYapilacaklar.getIsTamam());
        repository.save(ent.get());
        return "baraşıyla tamamlandı";
        
    }
	
	
	@PutMapping ("/yapilacaklar/{id}")
		Yapilacaklar yapilacaklarAdd (@RequestBody Yapilacaklar newYapilacaklar, @PathVariable Long id) {
		return repository.findById(id).map(
				x -> {
					x.setIs(newYapilacaklar.getIst());
					x.setAciklama(newYapilacaklar.getAciklama());
					x.setTamam(newYapilacaklar.isTamam());
					return repository.save(x);
				}).orElseGet(() ->{
					newYapilacaklar.setId(id);
					return repository.save(newYapilacaklar);
				});
	}

	@DeleteMapping("/yapilacaklar/{id}")
	void deleteYapilacaklar(@PathVariable Long id) {
	        repository.deleteById(id);}
	
	}
