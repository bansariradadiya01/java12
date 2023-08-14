import java.util.LinkedList;
import java.util.Queue;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 76523;
        Queue<Integer>queue = new LinkedList<>();
        while(n>0){
            int mod = n % 10;
            queue.add(mod);
            n=n/10;
        }
        int res = 0;
        while(!queue.isEmpty()){
            res=(res*10)+queue.poll();
        }
        System.out.println(res);
    }
}
