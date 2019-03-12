package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("topics")
	public List<Topics> getTopics(){
		return Arrays.asList(
			new Topics(1,"Study based on UFOs", "Ufology"),
			new Topics(2, "Study based of UROs", "Urology")
		);
	}
}
