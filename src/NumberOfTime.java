import java.util.Arrays;
import java.util.Scanner;

public class NumberOfTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100:");
        String[] str = input.nextLine().split(" ");
        int[] number = new int[str.length];
        for (int i = 0;i < str.length;i++)
            number[i] = Integer.parseInt(str[i]);
        print(number);
    }
    public static void print(int[] number){
        Arrays.sort(number);
        int count = 0;
        for (int i = 0;i < number.length;i++){
            for (int j = i;j < number.length;j++){
                if (number[j] == number[i])
                    count++;
            }
            if (count > 1)
                System.out.println(number[i]+" occurs "+count+" times");
            else
                System.out.println(number[i]+" occurs "+count+" time");
            count = 0;
            if (i < number.length - 1)
                if (number[i + 1] == number[i])
                    i = i + 1;
        }
    }
}