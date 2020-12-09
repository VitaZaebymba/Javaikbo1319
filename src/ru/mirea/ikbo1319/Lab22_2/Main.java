package Lab22_2;

import java.util.Scanner;

public class Main {
    public static void main(String []args) throws SortStudent.StudentException {
        SortStudent sort = new SortStudent();
        Student found;
        Student[] students = new Student[4];
        students[0]= new Student(57,"Ривз");
        students[1]= new Student(42,"Кузнецов");
        students[2]= new Student(7237,"Малютина");
        students[3]= new Student(1212,"Кударенко");
        sort.quicksort(students,0,students.length-1);
        System.out.println("Отсортированный массив по убыванию");
        for(int i = 0;i < students.length;i++){
            System.out.print(students[i].getID()+" ");
        }
        System.out.println();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите фамилию студента, которого хотите найти ");
        String name = scanner1.nextLine();
        Student a = new Student(name);

        found =(Student)sort.recursialinearSearch(students,a,0);
        System.out.println("Студент "+found.getName() + " нашелся");


    }


}
