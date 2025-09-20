package com.TNF.Abstarct;
public class Calculator {
 public static void main(String[] args) {
     Square sq = new Square(5);
     sq.calArea();
     sq.show();

     Rectangle rec = new Rectangle(4, 6);
     rec.calArea();
     rec.show();
 }
}


