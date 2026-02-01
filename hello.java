

import java.util.Arrays;
import java.util.Comparator;

public class hello {

    // public  class Threads extends Thread {

    //     public void run(){
    //         System.out.println("hii chal rah ahai thred ");
    //     }
    
        
    // }



    




    public static void main(String[] args) {
    //     hello h1 = new hello();
    
    // Threads t1 = h1.new Threads();
    // t1.start();

    String[] arr = {"Banana", "Apple", "Cat"};
    // Comparator comp = new Comparator<String>() {
    //     public int compare(String s1 , String s2){
    //         return s2.compareTo(s1);
    //     }
    // };

    Arrays.sort(arr ,(String s1 , String s2) -> s1.compareTo(s2));
     for (String s : arr) {
            System.out.println(s);
        }


    
        
    }
}