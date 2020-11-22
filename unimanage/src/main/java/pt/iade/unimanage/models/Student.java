package pt.iade.unimanage.models;

import java.time.LocalDate;
import java.util.ArrayList;

    public class Student {
        private static int nextNumber = 0;
        private String name;
        private LocalDate birthDate;
        private String email;
        private char gender;
        private int number;
        private ArrayList<Unit> units;

    private ArrayList<Enrolment> enrolments;
    public Student(String name, LocalDate birthDate, char gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.number = nextNumber;
        nextNumber++;
        email = "";
        enrolments = new ArrayList<Enrolment>();
        units = new ArrayList<Unit>();
    }

    public ArrayList<Unit> getUnits(){
        return units;
    }

    public Enrolment getEnrolmentByUnitId(int unitId){
        for(Enrolment enr: enrolments)
            if(enr.getUnit().getId()==unitId) return enr;
        return null;
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }

    public void enroll(Enrolment enrolment) {
        enrolments.add(enrolment);
        enrolment.getUnit().getEnrolments().add(enrolment);    
    }

    public static int getNextNumber() { 
        return nextNumber; 
    }

    public String getName() {
         return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(LocalDate date) {
        this.birthDate = date;
    }
    
    public char getGender(){
        return this.gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
