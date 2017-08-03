package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	// private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1,
	// "Java", "Java Description"),
	// new Topic(2, "Db", "Db Description"), new Topic(3, "SE", "SE Description")));

	public List<Course> getCourses(String tname) {
		// return topics;

		List<Course> courses = new ArrayList<>();
		repository.findByTopicTopicName(tname).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String tname) {

		// return topics.stream().filter(t ->
		// t.getTopicName().equals(tname)).findFirst().get();

		return repository.findOne(tname);

	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		// topics.add(topic);

		repository.save(course);

	}

	public void updatecourse(Course course) {
		// TODO Auto-generated method stub
		// for (int i = 0; i < topics.size(); i++) {
		// Topic topic2 = topics.get(i);
		// if (topic2.getTopicName().equals(tname)) {
		// topics.set(i, topic);
		// return;
		// }
		// }

		repository.save(course);

	}

	public void deleteTopic(String cname) {

		repository.delete(cname);

		// topics.removeIf(t -> t.getTopicName().equals(tname));
	}

}
