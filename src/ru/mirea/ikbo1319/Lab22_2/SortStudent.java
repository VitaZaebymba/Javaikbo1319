package Lab22_2;

import java.util.Comparator;

public class SortStudent implements Comparator  {



    public Comparator binarySearch(Comparator []student, Comparator elementToSearch){
        int firstIndex = 0;
        int lastIndex = student.length - 1;
        while(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (student[middleIndex].equals(elementToSearch)){
                return student[middleIndex];
            }
            else if (student[middleIndex].compare(student[middleIndex],1) < elementToSearch.compare(elementToSearch,1))
                firstIndex = middleIndex+1;
            else if (student[middleIndex].compare(student[middleIndex],1) > elementToSearch.compare(elementToSearch,1))
                lastIndex = middleIndex -1 ;
        }
        return null;
    }
    public  Comparator recursiveBinarySearch(Comparator []student,int firstElement,int lastElement,Comparator elementToSearch){
        if (lastElement >= firstElement){
            int mid = firstElement + (lastElement - firstElement) /2;
            if (student[mid].equals(elementToSearch)){
                return student[mid];
            }

            if (compare((Student)student[mid],(Student)elementToSearch) >0){
                return recursiveBinarySearch(student,firstElement,mid-1,elementToSearch);

            }
            return recursiveBinarySearch(student,mid+1,lastElement,elementToSearch);
        }
        return null;
    }
    public void quicksort(Student[]students, int low, int high){
        if (students.length == 0){
            return;
        }
        if (low >= high){
            return;
        }
        int middle = low +(high - low)/2;
        Student student = students[middle];
        int i = low, j = high;
        while (i <= j){
            while (compare(students[i],student)>0 ){
                i++;
            }
            while (compare(students[j],student) <0){
                j--;
            }
            if (i <= j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( low < j ){
                quicksort(students,low,j);
            }
            if (high > i ){
                quicksort(students,i,high);
            }
        }

    }
    public Comparator linearSearch(Comparator []students,Comparator elementToSearch){
        for (int index = 0; index <students.length; index ++){
            if (students[index].equals(elementToSearch)){
                return students[index];
            }
        }
        return null;
    }
    public Comparator recursialinearSearch(Comparator []students,Comparator elementToSearch,int index) throws StudentException {

        if (students[index].equals(elementToSearch)){
            return students[index];

        }
        index++;
        if (students.length == index){
            throw new StudentException("Вызвалось исключение.Студент не нашелся.");

        }
        return recursialinearSearch(students,elementToSearch,index);

    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getID() - ((Student)o2).getID();
    }
    class StudentException extends Exception{
        public StudentException(String message){
            super(message);
        }
    }
}
