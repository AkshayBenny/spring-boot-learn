package com.akshay.example;


public class MyFirstClass {
   private String myVar;

   public MyFirstClass(String myVar) {
      this.myVar = myVar;
   }

   public String sayHello() {
      return "Hello there from my first class. myVar ===>" + myVar;
   }
}
