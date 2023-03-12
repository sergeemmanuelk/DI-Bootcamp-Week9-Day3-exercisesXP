public class Main {
    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding"};
        int n = arr.length;
        String temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1].compareTo(arr[j]) > 0){
                    // swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // display sorted array
        System.out.println("Sorted Array:");
        for(String s : arr){
            System.out.println(s);
        }
    }
}