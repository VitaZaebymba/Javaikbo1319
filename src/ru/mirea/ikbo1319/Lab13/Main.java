package Lab13;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.println("Быстрая сортировка.\nВведите колличество студентов");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Введите баллы студентов");
        Student [] students = new Student[k];
        for (int i = 0;i < students.length;i++){
            int m = scanner.nextInt();
            students[i]= new Student(m);
        }
        sort.quicksort(students,0,students.length-1);
        System.out.println("Отсортированный массив по убыванию");
        for(int i = 0;i < students.length;i++){
            System.out.print(students[i].getSrBall()+" ");
        }
        System.out.println();
        System.out.println("Сортировка слиянием\nВведите баллы студентов");
        for (int i = 0;i < students.length;i++){
            int m = scanner.nextInt();
            students[i]= new Student(m);
        }
        sort.mergeSort(students,0,students.length-1);
        System.out.println("Отсортированный массив по убыванию");
        for(int i = 0;i < students.length;i++){
            System.out.print(students[i].getSrBall()+" ");
        }
    }
}
