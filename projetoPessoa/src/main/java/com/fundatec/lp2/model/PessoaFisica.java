package com.fundatec.lp2.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "PESSOA_FISICA")
@DiscriminatorValue("PF")
@Data
@EqualsAndHashCode(callSuper = true)
public class PessoaFisica extends Pessoa {

	@Column(nullable = false, name="CPF", length=11)
	private String cpf;
	
	@Column(nullable = false, name="NOME", length=100)
	private String nome;
	
	@Column(nullable = false, name="DATA_NASCIMENTO")
	private LocalDate datanascimento;
	
	
}
