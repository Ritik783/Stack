package Stack;
import java.util.*;

public class FndNEXTgrater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtgrater[] = new int[arr.length];

            for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgrater[i] = -1;
            }
            else{
                nxtgrater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        System.out.print("[");
    
        for(int i=0; i<nxtgrater.length; i++){
            System.out.print(nxtgrater[i]+ " ");
        }
        System.out.println("]");
        System.out.println();
    }
}
