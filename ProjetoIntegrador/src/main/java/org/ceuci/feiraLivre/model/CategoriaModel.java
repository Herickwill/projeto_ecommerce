package org.ceuci.feiraLivre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "categoria")
public class CategoriaModel {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotNull
	private String tipo;
	
	@Column
	@NotNull
	private boolean organico;
	
	@Column
	@NotNull
	private String unidade_medida_categoria;
	
	//GET E SET
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getUnidade_medida_categoria() {
		return unidade_medida_categoria;
	}

	public void setUnidade_medida_categoria(String unidade_medida_categoria) {
		this.unidade_medida_categoria = unidade_medida_categoria;
	}
}