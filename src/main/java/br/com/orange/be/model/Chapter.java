package br.com.orange.be.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString(exclude={"lessons"})
@EqualsAndHashCode(exclude={"lessons"},callSuper=false)
@AllArgsConstructor
public class Chapter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@NotBlank
	private String description;
	
	@NotNull
	@OneToMany
	private Set<Lesson> lessons;
	
	@NotNull
	private int sequence;

	public Chapter() {
		super();
	}

	public Chapter(String description, Set<Lesson> lessons, int sequence) {
		super();
		this.description = description;
		this.lessons = lessons;
		this.sequence = sequence;
	}


}
