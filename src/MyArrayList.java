public class MyArrayList <E>{
    private E[] list;
    private final int capacity = 5;
    private int size;

    public MyArrayList (){
        list = (E[]) new Object[capacity];
    }

    public void add (E element){
        list [size++] = element;
    }

    public void delete (int index){
        for (int i = index; i < size; i++) {
            list[i] = list [i+1];
        }
    }

    public void print(){
        for  (E e : list) {
            System.out.println(e);
        }


    }

}