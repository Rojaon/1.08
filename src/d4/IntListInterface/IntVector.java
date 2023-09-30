package d4.IntListInterface;

import java.util.ArrayList;
import java.util.List;

public class IntVector implements IntList{

    List<Integer> numbers;
    boolean isFull = true;

    public IntVector() {
        numbers = new ArrayList<Integer>(20);
        for (int i=0; i<20; i++) {
            numbers.add(null);
        }
    }
    @Override
    public void add(int number) {
        isFull=true;
        for (int i = 0;i<numbers.size();i++){
            if (numbers.get(i) == null){
                numbers.set(i,number);
                isFull=false;
                break;
            }
        }
        if(isFull) {
            if (numbers.get(numbers.size() - 1) != null) {
                System.out.println("Array is full.");
                System.out.println(numbers.toString());
                double newSize = (numbers.size() * 2);

                for (int i= numbers.size(); i< newSize; i++) {
                    numbers.add(null);
                }
                for (int i = 0;i<numbers.size();i++){
                    if (numbers.get(i) == null){
                        numbers.set(i,number);
                        isFull=false;
                        break;
                    }
                }
            }
        }
    }

    public void print(){
        System.out.println("\n"+numbers.toString());
    }

    @Override
    public int get(int id) {
        return numbers.get(id);
    }
}
