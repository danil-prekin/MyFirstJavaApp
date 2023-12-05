package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int task = in.nextInt();
        int task_ost = 12 - task;
        int time = task_ost * 45;
        if (time <=240){
           System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
