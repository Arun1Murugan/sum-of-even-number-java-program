public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int answer = sumOfEvenNumber(12345678);
        if(answer == -1){
            System.out.println("Invalid");
        }else{
            System.out.println("Sum of even numbers -->" + answer);
        }
    }
    public static int sumOfEvenNumber(int number){
        int sum;
        if(number <= 1){
            return -1;
        }else{
            /* tips for programming
            1. to find first digit of given number --> number % 100.
            2. to find last digit of given number --> number % 10
            3. to remove last digit of given number --> number / 10.*/
            for(sum = 0; number != 0; number /= 10){
                int lastDigit = number % 10;
                if(lastDigit % 2 == 0){
                    sum += lastDigit;
                }
            }
            return sum;
        }
    }
}