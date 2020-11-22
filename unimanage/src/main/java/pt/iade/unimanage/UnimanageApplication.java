package pt.iade.unimanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.iade.unimanage.models.StudentRepository;
import pt.iade.unimanage.models.UnitRepository;

@SpringBootApplication
public class UnimanageApplication {

	public static void main(String[] args) {
		UnitRepository.fill();
		StudentRepository.populate();
		SpringApplication.run(UnimanageApplication.class, args);
	}

}
