import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int K = sc.nextInt();
    int array1[] = new int[n];
    for(int a_i=0; a_i < n; a_i++){
        array1[a_i] = sc.nextInt();
    }
    int count=0;
    for(int j=0;j<n;j++){
        for(int k=j;k<n;k++){
            if(j < k){
            	int sum = array1[j] + array1[k];
            	if(sum%K == 0)
            		count++;
            }
            
        }
    }
    System.out.println(count);
    }
}
