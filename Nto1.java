public class Nto1 {
    public static int print(int i){
        if(i>0){
            System.out.println(i);
            return (print(i-1));
        }
        else
        return 0;
    }
    public static void main (String args[]){
        print(5);
    }
}
