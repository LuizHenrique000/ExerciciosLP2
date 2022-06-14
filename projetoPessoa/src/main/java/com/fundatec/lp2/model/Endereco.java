package com.fundatec.lp2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fundatec.lp2.enums.TipoLogradouro;
import com.fundatec.lp2.enums.UnidadeFederativa;

import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, name="TIPO_LOGRADOURO")
	@Enumerated(EnumType.STRING)
	private TipoLogradouro tipoLogradouro;
	
	@Column(nullable = false, name="NOME_LOGRADOURO")
	private String nomeLogradouro;
	
	@Column(nullable = false, name="NUMERO")
	private Integer numero;
	
	@Column(nullable = false, name="COMPLEMENTO")
	private String complemento;
	
	@Column(nullable = false, name="CEP")
	private String cep;
	
	@Column(nullable = false, name="CIDADE")
	private String cidade;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UnidadeFederativa uf;

}
