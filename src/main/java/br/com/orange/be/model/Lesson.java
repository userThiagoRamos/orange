package br.com.orange.be.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = { "sentenses" })
@EqualsAndHashCode(exclude = { "sentenses" }, callSuper = false)
@AllArgsConstructor
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@OneToMany
	private Set<Sentence> sentenses;

	@NotNull
	private int sequence;
	
	private String summary;
	
	@ManyToOne
	private Chapter chapter;

	public Lesson() {
		super();
	}

	public Lesson(Set<Sentence> sentenses, int sequence) {
		this.sentenses = sentenses;
		this.sequence = sequence;
	}

}
