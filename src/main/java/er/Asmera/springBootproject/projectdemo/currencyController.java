package er.Asmera.springBootproject.projectdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController 
public class currencyController {
	@Autowired
	private currencyServiceConfig configuration;
	@RequestMapping("/currency-configuration")
	public  currencyServiceConfig retrieveAllStudents(){
		return configuration;
		
	}

}
