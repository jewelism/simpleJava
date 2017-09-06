package advJava3_2.finalexam;

import java.util.ArrayList;
import java.util.Arrays;

public class Example03 {
    
    static void insert(int[] a, int index, int value) {
    	int size = a.length;
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for(Integer n : a){
    		for(int i=0; i<size; i++){
    			if(n==index)
        			result.add(value);
        		else
        			result.add(n);
    		}
    	}
    	Integer[] simpleArray = new Integer[ result.size() ];
    	Integer[] list = (Integer[])result.toArray(simpleArray);
    	//a = (int[])list;
    }
    
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 4, 5, 7, 8, 9, 10, 0, 0};
        System.out.println(Arrays.toString(a));
        insert(a, 3, 3);
        System.out.println(Arrays.toString(a));        
        insert(a, 6, 6);
        System.out.println(Arrays.toString(a));        
        insert(a, 0, -1);
        System.out.println(Arrays.toString(a));        
    }

}

