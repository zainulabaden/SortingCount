package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class permutArray {
   static boolean ispossible(Integer a[],int b[],int n,int p){
       Arrays.sort(a,Collections.reverseOrder());
       Arrays.sort(b);
       for(int i=0;i<n;i++)
           if(a[i]+b[i]>=p)
               return false;
       return true;
   }
   public static void main(String[] args){
       Integer a[]={8,6,9,4};
       int b[]={5,2,9,1};
       int p=10;
       int n=a.length;
       if(ispossible(a,b,n,p)){
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }


    }
}