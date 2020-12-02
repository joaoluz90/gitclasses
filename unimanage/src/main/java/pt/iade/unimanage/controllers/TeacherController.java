package pt.iade.unimanage.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.naming.NoPermissionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pt.iade.unimanage.models.Teacher;
import pt.iade.unimanage.models.TeacherRepository;
import pt.iade.unimanage.models.exceptions.NotFoundException;

@RestController
@RequestMapping(path = "/api/teachers")
public class TeacherController {
    private Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> getTeachers() {
        logger.info("Sending all teachers");
        return TeacherRepository.getTeachers();
    }

    @GetMapping(path = "{mecNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Teacher getTeacher(@PathVariable("number") int mecNumber) throws NoPermissionException {
        logger.info("Sending teacher with number"+mecNumber);
        Teacher teacher=TeacherRepository.getTeacher(mecNumber);
        if(teacher!=null)return teacher;
        else throw new NotFoundException(""+mecNumber,"Teacher","number");
    }
    public class Response {
        private String message;
        private Object object;
        public Response(String message, Object object) {
            this.message = message;
            this.object = object;
        }
        public String getMessage() { return message; }
        public Object getObject() { return object; }
    }
}
    