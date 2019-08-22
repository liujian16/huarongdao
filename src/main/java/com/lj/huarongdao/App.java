package com.lj.huarongdao;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jumian jumian = Jumian.first();
    		System.out.println( " first Jumain: \n" + jumian );
    		List<Jumian> children = jumian.childrenJumian();
    		children.stream().forEach(System.out::println);
    }
}
