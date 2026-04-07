package lab2;

public class Practice2_2 {
    public static void main(String[] args) {
        int k = 50;
        int cnt = 0;
        while(k>0){
            cnt++;
            System.out.print(k+" ");
            k--;
            if(cnt%5==0)System.out.println("\n");
        }
    }
}
