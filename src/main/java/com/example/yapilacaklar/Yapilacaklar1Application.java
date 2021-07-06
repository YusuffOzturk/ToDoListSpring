package com.example.yapilacaklar;

import org.springframework.boot.CommandLineRunner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.yapilacaklar.entity.Yapilacaklar;
import com.example.yapilacaklar.repository.YapilacaklarRepository;

@SpringBootApplication
public class Yapilacaklar1Application {

	public static void main(String[] args) {
		SpringApplication.run(Yapilacaklar1Application.class, args);
	}
		
		@Bean
		CommandLineRunner initDatabase (YapilacaklarRepository repository) {
		return args ->{
			
			
			
			repository.save(new Yapilacaklar((long) 1,"işe git","sabah 9'da işte ol",false));
			repository.save(new Yapilacaklar((long) 2,"sorularını sor", "sorularını müsait birine sor",true));
			repository.save(new Yapilacaklar((long) 3,"eve git","kavacıktan ümraniyeye eve git",true));
			repository.save(new Yapilacaklar((long) 4,"falan yap","falan filan yap",true));
			repository.save(new Yapilacaklar((long) 5,"bir şey yap","bir şeyler ",true));
			repository.save(new Yapilacaklar());

		};
	}
}


