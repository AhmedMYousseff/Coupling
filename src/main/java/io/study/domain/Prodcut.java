package io.study.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class Prodcut {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Getter
	private String prdcutName;
	
	@Getter
	private LocalDate expireDate;
	
	public Prodcut() {
		// for hibernate
	}

	
	public Prodcut(String prdcutName, LocalDate expireDate) {
		super();
		this.prdcutName = prdcutName;
		this.expireDate = expireDate;
	}
}
