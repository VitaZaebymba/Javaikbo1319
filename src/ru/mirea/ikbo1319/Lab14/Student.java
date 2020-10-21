package Lab14;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator  {
    private int ID;
    public Student(int ID){
        this.ID = ID;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;

        return this.ID == student.getID();
    }

    public int getID() {
        return ID;
    }
}
