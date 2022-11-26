import java.util.*;
public class removedup2 {
    public static ArrayList<Integer> removedup2(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {10,10,20,20,20,30,30,40,10};
        ArrayList<Integer> results = removedup2(arr);
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
    }
}
