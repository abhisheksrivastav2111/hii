import java.util.*;

public class Reverse {
     public static int revserseNum(int num ){
        int ans = 0;
        while (num > 0){
          int anss = num % 10;
            ans = ans * 10 + anss;
            num /= 10;

        }
        return ans;
     }
     public static String revseString(String str){
         String rev = new StringBuilder(str).reverse().toString();
         return rev;

     }
     public static boolean checkPalindrome(int num ){
        int ans = num;
        int anss = 0;
        while(ans > 0){
            int sum = ans%10;
            anss = anss*10+sum;
            ans/= 10;

        }
        return anss == num;
     }
     public static boolean checkpalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--))return false;
        }
        return true;
     }

     public static int gcd(int num1 , int num2){
        // int gcd = 0;
        // for(int i = 0; i < Math.min( num1 , num2); i++){
        //     if(i % num1 == 0 && i % num2 == 0 ) gcd = i;
        // }
        // return gcd;

        while (num1 != 0 || num2 != 0) {
            if(num1 > num2){ 
                num1 = num1%num2;
            }else{
                num2  = num2 % num1;
            }

        }
        if(num1 == 0)return num2;
        return num1;
     }

     public static boolean armStrong( int num){
        int arm = num;
        int summm = 0;
         while( arm  >0){
           int sum = arm %10;
           summm += Math.pow(sum, 3);
           arm /= 10;
         }
         return summm == num;
     }
     public static boolean CheckPrime(int num){
        if(num <= 1) return false;
        int cnt = 1;
        for(int i =2 ; i<=Math.sqrt(num); i++){
        
            if(num % i == 0){
                System.out.println(i);
                cnt++;
            }
           
        }
        return cnt == 1;
     }
     static ArrayList<Integer> primenumber(int start , int end){
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(start <= end){
         if(CheckPrime(start)){
            arr.add(start);
         }
         start++;
        }
        return arr;
     }
     static int factoral(int num ){
        int mul = 1;
        for(int i = 1; i<=num; i++){
           mul *= i;
        }
        return mul;
     }

public static void primefactor(int num) {
    for (int i = 2; i * i <= num; i++) {
        while (num % i == 0) {
            System.out.println(i);
            num = num / i;
        }
    }
    if (num > 1) {
        System.out.println(num);
    }
}







     public static String reversstr(String str ){
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right){
            char chr = ch[left];
            ch[left] = ch[right];
            ch[right] = chr;
            left++;
            right--;

        }
        return  ch.toString();
     }

     static void countfreq(int[] arr){
        
        Map<Integer , Integer> mp  = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0) +1);
        }
        for(Map.Entry<Integer , Integer> mps : mp.entrySet()){
            System.out.println(mps.getKey() +   " : " +  mps.getValue());
        }

     }

     static int[] selectionsort(int[] arr){
       for(int i = 0; i<arr.length; i++){
        int minidx = i;
        for(int j = i; j<arr.length; j++){
            if(arr[j] < arr[minidx]){
                minidx = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minidx];
        arr[minidx] = temp;
       }return arr;
     }

     static void bubblezSort(int[] a){
        for(int i = a.length-1; i >= 0; i--){
            for(int j  = 1; j< i-1;  j++){
               if(a[j-1]> a[j]){
                int temp = a[j];
                 a[j] = a[j-1];
                 a[j-1] = temp;
               }
            }
        }
         System.out.println("After Using Bubble Sort:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
     }

     static void mergeSort(int[] arr , int low , int high){
        if(low >= high)return;
        int mid = (low +high) /2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);

       
        
     }
     static void merge(int[] arr , int low ,int mid ,  int high){
         List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        while(left <= mid){
            temp.add(arr[left++]);
        }
        while (right <= high) {
            temp.add(arr[right++]);
        }

        for(int i = low; i <=high; i++){
            arr[i] = temp.get(i-low);
        }
     }

     static void quickSort(int[] arr , int low ,int high){
        if (low >= high) return;

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot +1, high);
     }
     static int partition(int[] arr , int low ,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<= high ; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

     }




    public static void main(String[] args) {
        // System.out.println(revserseNum(23456));
        // System.out.println(checkPalindrome(121));
        // System.err.println(checkpalindrome("madam"));
        // System.out.println(armStrong(153));
        // System.out.println(CheckPrime(1483));
        primefactor(10000);
    //    System.out.println( primenumber(1, 30));
    //    System.out.println(factoral(3));
        int[] arr = {10, 5, 10,-1, 15, 10, 5};
    //     countfreq(arr);

    //     int[] ans = selectionsort(arr);

    //   for(int i = 0; i<ans.length; i++){
    //     System.out.print(ans[i] + " ");
    //   }
    //   bubblezSort(arr);
    //    mergeSort(arr, 0, arr.length -1);
    quickSort(arr, 0, arr.length -1);
        for(int i = 0; i<arr.length; i++){
        System.out.print(3/2);
      }
      
      

    }
}
