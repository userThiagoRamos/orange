package br.com.orange.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import br.com.orange.be.model.Sentence;
import br.com.orange.be.repository.SentenceRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SentenceInitializer {
	
	
	@Autowired
	private SentenceRepository sr;
	
	@EventListener
	public void init(ApplicationReadyEvent event){
		Sentence s = new Sentence();
		s.setContent("This is the first sentece on the system.");
		sr.save(s);
		log.info("======================== Initial database load done!!");
		
	}

}
