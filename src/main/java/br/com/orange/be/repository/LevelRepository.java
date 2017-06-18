package br.com.orange.be.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.orange.be.model.Level;

@RepositoryRestResource(collectionResourceRel = "levels",path="levels")
public interface LevelRepository extends CrudRepository<Level, Long> {

}
