package Lab23;

public class GenArray<E> {
    private E[] arr;

    public void setArr(E [] arr){
        this.arr = arr;
    }

    public E get(int i){
        return arr[i];
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "Arr=" + java.util.Arrays.toString(arr) +
                '}';
    }
}
