package br.com.orange.be.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name = "SENTENCE")
@Data
public class Sentence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@NotBlank
	private String content;

	@NotNull
	@ManyToOne
	private Level level;

	@NotNull
	private int sequence;
	
	@ManyToOne
	private Lesson lesson;

	public Sentence() {
		
	}

	public Sentence(String content, Level level, int sequence) {
		this.content = content;
		this.level = level;
		this.sequence = sequence;
	}

}
