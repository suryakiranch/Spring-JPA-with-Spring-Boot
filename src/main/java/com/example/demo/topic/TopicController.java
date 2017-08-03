package com.example.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {

		return topicService.getTopics();

	}

	@RequestMapping("/topics/{tname}")
	public Topic getTopic(@PathVariable("tname") String tname) {

		return topicService.getTopic(tname);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{tname}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("tname") String tname) {
		topicService.updatetopic(tname,topic);
 
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{tname}")
	public void deleteTopic(@PathVariable("tname") String tname) {

		 topicService.deleteTopic(tname);

	}
}
