package br.com.orange.be.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.orange.be.model.Lesson;

@RepositoryRestResource(collectionResourceRel = "lessons",path="lessons")
public interface LessonRepository extends PagingAndSortingRepository<Lesson, Long> {

}
