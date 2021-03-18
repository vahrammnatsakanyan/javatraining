import java.util.Scanner;

public class Homework1 {
    public Homework1() {
    }

    public static void main(String[] args){
        //Task 1
        int [] myList1;
        myList1 = new int[2];
        myList1[0] = 14;
        myList1[1] = 43;

        //Task 2
        int [] mylist;
        mylist = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            mylist[i - 1] = i;
        }

        //Task 3

        int [] oddNumber;
        oddNumber = new int[26];
        int index = 0;
        for (int x = -19; x <= 20; x += 2, index++){
            oddNumber[index] = x;
        }

        //Task 4
        for (int i : mylist ) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        //Task 6
        int count = 0;
        for (int i : mylist ) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //Task 7
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        for (int y = 1; y <= 10; y++){
            int sum = y * N;
            System.out.println(y + "*" + N + "=" + sum);

        }

    }
}
