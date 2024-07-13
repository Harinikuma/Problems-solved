class SumOfDigits{
    public static int sumDigit (int num){
        if(num>0){
            int r=num%10;
            num = num/10;
            return (r+sumDigit(num));
        }
        else
        return 0;
}
    public static void main(String args[]){

        int sum=sumDigit(46);
        System.out.println(sum);
    }
}