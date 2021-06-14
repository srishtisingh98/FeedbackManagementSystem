package com.cg.fms.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.fms.entites.Course;
import com.cg.fms.exception.CourseIdNotFoundException;
import com.cg.fms.service.ICourseService;
import io.swagger.annotations.Api;

//@CrossOrigin(origins = "http://localhost:4200")
//@Api(value = "Swagger2DemoResrController")
@RestController
@RequestMapping("/v1")
public class CourseController {
	@Autowired
	ICourseService Icourseservice;

	@PostMapping("/addcourse")
	public Course additionofCourse(@RequestBody Course course) throws CourseIdNotFoundException {
		{
			return Icourseservice.addCourse(course);
		}
	}

	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course course) throws CourseIdNotFoundException {
		return Icourseservice.updateCourse(course);
	}

	@DeleteMapping("/course/remove")
	public Course removeCourse(@PathVariable int courseId) throws CourseIdNotFoundException {
		return Icourseservice.removeCourse(courseId);
	}

	@GetMapping("/viewcourse/{id}")
	public Course viewCourseIn(@PathVariable int id) throws CourseIdNotFoundException {
		return Icourseservice.viewCourse(id);
	}

	@GetMapping("/viewallcourses")
	public List<Course> listallappointments() {
		return Icourseservice.viewAllCourses();
	}
}
