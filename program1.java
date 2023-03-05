// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;
import java.util.*;
public class program1{
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(program1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler ch = new FileHandler("log.xml");
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        logger.info("Sort Array");
       
       
        int [] array = {6, 14, -11, -7, 3, 135, 0, 17, 88};
        System.out.println(Arrays.toString(array));
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}