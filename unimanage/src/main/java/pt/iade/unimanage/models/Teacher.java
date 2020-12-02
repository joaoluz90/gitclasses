package pt.iade.unimanage.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Person {
    private static int nextNumber = 1;
    private int mecNumber;
    private ArrayList<Unit> units;
    private ArrayList<EnrolmentTeacher> enrolmentsteacher;
    private String email;

    public Teacher(String name, char gender, LocalDate birthDay){
        super(name, gender,birthDay);
        this.mecNumber = nextNumber;
        nextNumber++;
        units = new ArrayList<>();
    }
    public int getMecNumber(){
        return mecNumber;
    }
    public ArrayList<Unit> getUnits() {
        return units;
    }

    @Override
    public String getName(){
        return "Profesor" + name;
    }

    public EnrolmentTeacher getEnrolmentByUnitId(int unitId) {
        for(EnrolmentTeacher enr: enrolmentsteacher)
            if (enr.getUnit().getId()==unitId) return enr;
        return null;
    }
    public ArrayList<EnrolmentTeacher> getEnrolmentsTeacher(){
        return enrolmentsteacher; 
    }

    @Override
    public String getReference() {
      return "T" + mecNumber;
    }
	public void setEmail(String string) {
        string = this.email;
	}
  
}
