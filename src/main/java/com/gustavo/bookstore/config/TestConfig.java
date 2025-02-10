package com.gustavo.bookstore.config;
<<<<<<< HEAD

=======
>>>>>>> b546b20 (Criacao do perfil de DV)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.gustavo.bookstore.service.DBService;

@Configuration
@Profile("test")
<<<<<<< HEAD
public class TestConfig {
	
	@Autowired 
	private DBService dbService;
	
	@Bean
	public DBService instanciaBaseDeDados() {
	    dbService.instanciaBaseDeDados();
	    return dbService;
	}


}
=======

public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public DBService instanciaBaseDeDados() {
dbService.instanciaBaseDeDados();
		return dbService;
	}
}
>>>>>>> b546b20 (Criacao do perfil de DV)
