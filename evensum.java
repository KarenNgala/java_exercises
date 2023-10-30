class EvenSum {
    public void getSum(int num){
        int original = num;
        int digit, sum = 0;
        while (num != 0){
            digit = num%10;
            if (digit%2 == 0){
                sum = sum + digit;
            }
            num = num / 10;
        }
        System.out.println("Sum of even digits in " + original + " is: " + sum);
    }

    public static void main(String args[]){
        EvenSum ob = new EvenSum();
        ob.getSum(1234);
    }
}
