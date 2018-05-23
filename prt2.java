/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Адильбек
 */
public class prt2 {
    
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adik nur
 */
public class prt2 { 
   public static List < String > stringList = new ArrayList < String >();
    public static void main(String[] args) {
       smartIter(5,3,"",0);
       System.out.println(stringList.size());
       System.out.println(stringList);

IterationHelper iteration=new IterationHelper(stringList);
iteration.smartIter(6, 2, "", 0);

System.out.println(iteration.getList().size());
System.out.println(iteration.getList());
    }
    
    public static void smartIter(int N, int M, String str, int index) {
        
        if(M>N) {
            return;
        }
        if(index==0) {
            str=" ( ";
        }
        String sample=str;
        int p=N-M;
        while(p+1!=index) {
            for(int j=index; j<=p; j++) {
                str=str+Integer.toString(j);
                index++;
                if(M==1) {
                    str=str+" ) ";
                    stringList.add(str);
                } else {
                    str=str+" , ";
                    
                smartIter(N,M-1,str,index); }
                str=sample;
                
            }
        }
       
    }
    public static void test1() {
        smartIter(2,3,"",0);
        if (stringList.isEmpty()==false) {
        throw new IllegalStateException("Error encountered!");
		}
    }
    public static void test2() {
      
        smartIter(22,3,"",0);
        if (stringList.size() != 1540) {
        throw new IllegalStateException("Error encountered!");
		}
    }
    
    public static void test3() {
        smartIter(5,3,"",0);
        if (stringList.size() != 6) {
    throw new IllegalStateException("Error encountered!");
		}
    }
    
    public static void test4() {
        smartIter(5,3,"",0);
        List < String > ll = new ArrayList < String >();
int N = 5;
String str ;
for ( int a = 0; a < N ; a ++) {
for ( int b = a +1; b < N ; b ++) {
for ( int c = b +1; c < N ; c ++) {
str = " ( " + Integer . toString ( a ) +
" , " + Integer . toString ( b ) +
" , " + Integer . toString ( c ) + " ) " ;
ll . add ( str );
}
}
}
if (stringList.equals(ll)==false) {
   throw new IllegalStateException("Error encountered!");
		}
    }
    public static void test5() {
        smartIter(12,1,"",0);
        if (stringList.size() != 12) {
throw new IllegalStateException("Error encountered!");
		}
    }
      
    
}
}

