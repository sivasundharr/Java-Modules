package com.client;

import java.util.*;
import com.services.Calculator;

public class CalClient{
   public static void main(String args[]){

    Iterable<Calculator> calcs = ServiceLoader.load(Calculator.class);

    for(Calculator c:calcs){
        System.out.println(c.add(5,10));
    }

   }

}