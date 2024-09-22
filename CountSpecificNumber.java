package AccentureCodingProblem;
/*
You are required to implement the following function:

int CountSpecificNumbers(int m, int n);

The function CountSpecificNumbers accepts two integer arguments m and n.
Your task is to calculate the count of numbers having only the digits 1, 4, and 9 in their decimal representation,
among the numbers lying in the range from m to n (both inclusive). If the value of m is greater than n,
the function should return -1.
 */
public class CountSpecificNumber {
    public static boolean check149(int num){
        while(num != 0){
            int rem = num%10;
            if(rem == 1 || rem == 4 || rem == 9){
                num = num /10;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static int CountSpecificNumbers(int m, int n) {
        if(m > n){
            return -1;
        }
        int count =0;
        for(int j = m; j<= n; j++){
            if(check149(j)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountSpecificNumbers(10, 100));
        System.out.println(CountSpecificNumbers(100, 200));
    }
}
