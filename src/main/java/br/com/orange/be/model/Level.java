package br.com.orange.be.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;

@Entity
@Table(name = "LEVEL")
@AllArgsConstructor
public class Level {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private int code;

	@NotEmpty
	@NotNull
	private String description;

	public Level() {
	}

	public Level(int code, String description) {
		this.code = code;
		this.description = description;
	}

}
