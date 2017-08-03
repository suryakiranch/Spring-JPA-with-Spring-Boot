package com.example.demo.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{tname}/courses")
	public List<Course> getCourses(@PathVariable String tname) {
		return courseService.getCourses(tname);

	}

	@RequestMapping("/topics/{tname}/courses/{courseName}")
	public Course getCourse(@PathVariable("tname") String cname) {

		return courseService.getCourse(cname);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{tname}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable("tname") String tname) {
		course.setTopic(new Topic(0, tname, ""));
		courseService.addCourse(course);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{tname}/courses/{courseName}")
	public void updateCourse(@RequestBody Course course, @PathVariable("tname") String tname) {
		course.setTopic(new Topic(0, tname, ""));
		courseService.updatecourse(course);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{tname}/courses/{courseName}")
	public void deleteTopic(@PathVariable("tname") String tname) {

		courseService.deleteTopic(tname);

	}
}
