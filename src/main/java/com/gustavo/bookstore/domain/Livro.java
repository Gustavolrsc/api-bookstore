package com.gustavo.bookstore.domain;
<<<<<<< HEAD

import java.io.Serializable;
import java.util.Objects;

=======
import java.io.Serializable;
import java.util.Objects;
>>>>>>> b546b20 (Criacao do perfil de DV)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

<<<<<<< HEAD
@Entity 
public class Livro implements Serializable {
	
=======
@Entity

public class Livro implements Serializable {

>>>>>>> b546b20 (Criacao do perfil de DV)
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texto;
<<<<<<< HEAD
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

=======

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	
	private Categoria categoria;
	
>>>>>>> b546b20 (Criacao do perfil de DV)
	public Livro() {
		super();
	}

	public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria categoria) {
<<<<<<< HEAD
=======

>>>>>>> b546b20 (Criacao do perfil de DV)
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
<<<<<<< HEAD
=======

>>>>>>> b546b20 (Criacao do perfil de DV)
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
<<<<<<< HEAD
=======

>>>>>>> b546b20 (Criacao do perfil de DV)
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
<<<<<<< HEAD
=======

>>>>>>> b546b20 (Criacao do perfil de DV)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
<<<<<<< HEAD
	}

}
=======

	}

}
>>>>>>> b546b20 (Criacao do perfil de DV)
