package com.TNF.Abstarct;
abstract class Shape {
 double area;
 abstract void calArea();
 void show() {
     System.out.println("Area = " + area);
 }
}

