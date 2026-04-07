package lab1;

public class Test01 {
    public static void main (String[] args) {
        byte b = 'a'; //A
        int n  =100;
        char c = 65;  //B
        b = b;        //C
        b = (byte) (b+1);      //D
    }
}
