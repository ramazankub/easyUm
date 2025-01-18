package lesson7;

import java.util.Objects;

public class Student {
    private String name;
    private final int yearOfBirth;
    private final String country;

    private String faculty;

    public Student(String name, int age, String country) {
        this.name = name;
        this.yearOfBirth = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfBirth == student.yearOfBirth && Objects.equals(name, student.name) &&
                Objects.equals(country, student.country) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, country, faculty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", country='" + country + '\'' +
                '}';
    }


    public String getFaculty() {
        return faculty;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


}

//this - явный указатель на метод/поле данного класса (читай ЭТОТ).
//super - указатель на родительский метод/поле (читай его).