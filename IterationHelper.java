/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;


/**
 *
 * @author Адильбек
 */

import java.util.ArrayList;

import java.util.List;

/**
 *
 * adik nur
 */
public class IterationHelper {
    public  List < String > sl = new ArrayList < String >();
    
    public IterationHelper(List<String> stringl) {
        sl=stringl;
    }
    
    public void smartIter(int N, int M, String str, int index) {
        
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
                    sl.add(str);
                } else {
                    str=str+" , ";
                    
                smartIter(N,M-1,str,index); }
                str=sample;
                
            }
        }
       
    }
    public List<String> getList() {
        return sl;
    }
}
