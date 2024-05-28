package Task1001;

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double[] al = new double[131072];
        int i = 0;
        while(in.hasNextDouble()){
            al[i++] = in.nextDouble();
        }

        for(;i>0;i--){
            long i1 = (long)Math.round(Math.sqrt(al[i-1])*10000);
            out.format("%.4f%n",(double)i1/10000);
        }
        out.flush();
        in.close();

    }

}
