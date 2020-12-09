package Lab22_2;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator  {
    private int ID;
    private String name;
    public Student(String name){
        this.name=name;
    }
    public Student(int ID,String name){
        this.ID = ID;
        this.name = name;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;

        return this.name.equals(student.getName());
    }

    public int getID() {
        return ID;
    }
}