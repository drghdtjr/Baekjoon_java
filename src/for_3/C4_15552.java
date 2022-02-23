package for_3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i < n; i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int sum=a+b;
            bw.write(sum+"\n");
        }
        bw.flush();

    }
}

