package com.fundatec.lp2.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "PESSOA_JURIDICA")
@DiscriminatorValue("PJ")
@Data
@EqualsAndHashCode(callSuper = true)
public class PessoaJuridica extends Pessoa {
	
	@Column(nullable = false, name="CNPJ", length=14)
	private String cnpj;
	
	@Column(nullable = false, name="RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(nullable = false, name="DATA_CRIACAO")
	private LocalDate dataCriacao;

}
