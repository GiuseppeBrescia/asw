package asw.sentence.sentenceservice.wordservice;

import asw.sentence.sentenceservice.domain.WordService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger; 

@Service 
public class SubjectService implements WordService {

	private final Logger logger = Logger.getLogger(SubjectService.class.toString()); 

	@Autowired 
	private WordClient wordClient;
	
	public String getWord() {
		return wordClient.getWord("subject"); 
	}
	
}
