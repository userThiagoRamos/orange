package br.com.orange.be.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.orange.be.model.Chapter;

@RepositoryRestResource(collectionResourceRel = "chapters",path="chapters")
public interface ChapterRepository extends PagingAndSortingRepository<Chapter, Long> {

}
