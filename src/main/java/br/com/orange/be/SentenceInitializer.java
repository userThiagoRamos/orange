package br.com.orange.be;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import br.com.orange.be.model.Chapter;
import br.com.orange.be.model.Lesson;
import br.com.orange.be.model.Level;
import br.com.orange.be.model.Sentence;
import br.com.orange.be.repository.ChapterRepository;
import br.com.orange.be.repository.LessonRepository;
import br.com.orange.be.repository.LevelRepository;
import br.com.orange.be.repository.SentenceRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SentenceInitializer {

	@Autowired
	private ChapterRepository cr;
	
	@Autowired	
	private LessonRepository lsr;
	
	@Autowired	
	private SentenceRepository sr;
	
	@Autowired
	private LevelRepository lr;

	@EventListener
	public void init(ApplicationReadyEvent event) {

		Level level = new Level(1, "Our firts level.");
		level = lr.save(level);

		Set<Sentence> ss = new HashSet<Sentence>();
		Sentence s1 = new Sentence("here's is johnny", level, 1);
		ss.add(sr.save(s1));
		Sentence s2 = new Sentence("Frankly, my dear. I don't give a damn.", level, 2);
		ss.add(sr.save(s2));
		Sentence s3 = new Sentence(
				"You see, in this world there's two kinds of people, my friend: Those with loaded guns and those who dig. You dig.",
				level, 3);
		ss.add(sr.save(s3));
		Sentence s4 = new Sentence("Say 'hello' to my little friend!", level, 4);
		ss.add(sr.save(s4));

		Lesson lesson = new Lesson(ss, 1);
		
		for (Sentence sentence : ss) {
			sentence.setLesson(lesson);
		}
lsr.save(lesson);
		Chapter chapter = new Chapter("Chapter 1", Collections.singleton(lesson), 1);
		lesson.setChapter(chapter);
		

		cr.save(chapter);

		log.info("======================== Initial database load done!!");

	}

}
