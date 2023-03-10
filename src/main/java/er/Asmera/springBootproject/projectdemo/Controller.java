package er.Asmera.springBootproject.projectdemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	@RequestMapping("/Students")
	public  List <Students> retrieveAllStudents(){
		
		return Arrays.asList(
				new Students (1, "Bob Nilson", "bob@gmail.com"),
				new Students (2, "Nuna Alem", "nuna@gmail.com"),
				new Students (3, "Tesfaldet Weldemicheal", "wlte@gmail.com"),
				new Students (4, "Abel Alem", "abel@gmail.com")
				);
		
	}

}
