package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Java", "Java Description"),
//			new Topic(2, "Db", "Db Description"), new Topic(3, "SE", "SE Description")));

	public List<Topic> getTopics() {
		// return topics;

		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String tname) {

		// return topics.stream().filter(t ->
		// t.getTopicName().equals(tname)).findFirst().get();

		return repository.findOne(tname);

	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		// topics.add(topic);

		repository.save(topic);

	}

	public void updatetopic(String tname, Topic topic) {
		// TODO Auto-generated method stub
		// for (int i = 0; i < topics.size(); i++) {
		// Topic topic2 = topics.get(i);
		// if (topic2.getTopicName().equals(tname)) {
		// topics.set(i, topic);
		// return;
		// }
		// }

		repository.save(topic);

	}

	public void deleteTopic(String tname) {

		repository.delete(tname);

		// topics.removeIf(t -> t.getTopicName().equals(tname));
	}

}
