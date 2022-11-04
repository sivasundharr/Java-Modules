package com.service;

import com.lti.HelloService;

class HelloClient{
    public static void main(String args[]){
        HelloService service = new HelloService();

        System.out.println(service.getValue());
    }
}