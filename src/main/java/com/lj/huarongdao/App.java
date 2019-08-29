package com.lj.huarongdao;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Jumian first = Jumian.first();
        Stack<Jumian> stack = new Stack<>();
        Set<Jumian>  all = new HashSet<>();
        stack.push(first);
        all.add(first);
        int step = 0;
        while(true) {
        		Jumian top = stack.peek();
//        		System.out.println("top " + (++step) + ": \n" + top );
        		
        		if(top.isCaocaoCanEscape()) {
        			break;
        		}else {
        			List<Jumian> nextJumians = top.childrenJumian();
        			boolean foundNewJumian = false;
        			for (int i = 0; i < nextJumians.size(); i++) {
        				Jumian next = nextJumians.get(i);
        				if(!all.contains(next)) {
        					all.add(next);
        					stack.push(next);
//        					System.out.println("push : \n" + next );
        					foundNewJumian = true;
        					break;
        				}
				}
        			if(!foundNewJumian) {
        				Jumian pop = stack.pop();
//        				System.out.println("Stack pop: " + pop);
        			}
        			
//        			 System.out.println("Stack  " + stack.size() + ": ");
//        		     stack.stream().forEach(System.out::println);
        		}
        	
        	
        }
        
        System.out.println("Caocao escaped!");
        System.out.println("stack: " + stack.size());
//        BufferedWriter w = Files.newBufferedWriter(new File("/Users/liujian/Downloads/huarongdao").toPath(), StandardOpenOption.CREATE_NEW);
//        
//        stack.stream().forEach(j->{
//	        	try {
//	        		w.write(j.toString());
//	        		w.newLine();
//	        	}catch(Exception e) {
//	        		
//	        	}
//        });
//        w.flush();
//        w.close();
        
        Map<Jumian, Integer> jumain_step = new HashMap<>();
        
        for(int i = 0 ; i < stack.size(); i ++) {
        		jumain_step.put(stack.get(i), i);
        }
        
        for(int i = 0 ; i < stack.size(); i ++) {
        	    Jumian tmp = stack.get(i);
        	    List<Jumian> children = tmp.childrenJumian();
        	    for (Jumian child : children) {
        	    		Integer s = jumain_step.get(child);
        	    		if(s != null && i + 1 < s ) {
        	    			System.out.println("step" + i + "  has child in step " + s);
        	    		}
			}
        }
        
//        stack.stream().forEach(System.out::println);
        
        
        
//    		System.out.println( " first Jumain: \n" + jumian );
//    		List<Jumian> children = jumian.childrenJumian();
//    		children.stream().forEach(System.out::println);
    		
    		
    		
    		
    }
}
