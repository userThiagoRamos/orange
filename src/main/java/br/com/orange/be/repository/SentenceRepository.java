package br.com.orange.be.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.orange.be.model.Sentence;

@RepositoryRestResource(collectionResourceRel = "sentence",path="sentence")
public interface SentenceRepository extends PagingAndSortingRepository<Sentence, Long> {

}
