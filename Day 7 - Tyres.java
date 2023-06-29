import java.util.*;
class Tyres {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        int i=0;
        while(i<n){
            int b=obj.nextInt();
            int c=obj.nextInt();
            System.out.println(b*2+c*4);
            i++;
        }
    }
}