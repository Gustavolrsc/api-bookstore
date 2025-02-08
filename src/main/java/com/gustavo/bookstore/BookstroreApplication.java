package com.gustavo.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gustavo.bookstore.domain.Categoria;
import com.gustavo.bookstore.domain.Livro;
import com.gustavo.bookstore.repostories.CategoriaRepository;
import com.gustavo.bookstore.repostories.LivroRepository;

@SpringBootApplication
public class BookstroreApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	@Autowired LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstroreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
	}
	
	

}
