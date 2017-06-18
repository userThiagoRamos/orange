package br.com.orange.be.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.hateoas.Identifiable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Base class for all entities
 *
 * @author thiago
 */
@MappedSuperclass
@ToString
@EqualsAndHashCode
public class BaseEntity implements Identifiable<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;

	protected BaseEntity() {
		this.id = null;
	}

	public Long getId() {
		return id;
	}

}
