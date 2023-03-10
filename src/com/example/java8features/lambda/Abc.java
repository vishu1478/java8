package com.example.java8features.lambda;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Abc{
   int i=0;

    public static void main(String[] args) {
       /* Xyz x=i ->  i*2;
        System.out.println(x.test(3));*/

        /*Stream<String> st=Stream.iterate("",(s)->s+"1");
        System.out.println(st.limit(2).map(x->x+"2"));*/
       /* Stream<Integer> s =Stream.of(1);
        IntStream is= IntStream.empty();
        is.s();*/
        int[] A= new int[10];
        for(int j=0;j<10;j++){
            A[j]=j;
        }

        ///////////
        int max=0;
        Set s=new HashSet();
        for(int i=0;i<A.length;i++){
            s.add(A[i]);
        }
        A[5]=-8;
        for(int i=0;i<A.length;i++){

       int newMAx=new Abc().max(max,A);
       int neg=-newMAx;
       if(s.contains(neg)){
           System.out.println(newMAx);
       }
       else
           System.out.println(0);

        }


    }

    public int max(int max, int[] s){
        for (int i=0;i<s.length;i++){
            if(max<s[i]){
                max=s[i];
                return max;}
        }
        return max;
    }
}
