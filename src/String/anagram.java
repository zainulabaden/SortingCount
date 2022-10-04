package String;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class anagram {
     static  boolean aragram(int [] str1,int [] str2){
         int n1=str1.length;
         int n2=str2.length;
         if(n1!=n2){
             return false;
         }
         Arrays.sort(str1);
         Arrays.sort(str2);
         for(int i=0;i<n1;i++){
             if(str1[i]!=str2[i]){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args){
         int str1[]={2,3,4,5,6,7,9};
         int str2[]={9,7,6,1,4,3,2};
         if(aragram(str1,str2)){
             System.out.println("These are anagrams");
         }
         else {
             System.out.println("These are not anagrams");
         }

     }
}
