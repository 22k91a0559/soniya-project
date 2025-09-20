package com.TNF.Abstarct;
class Rectangle extends Shape {
 double length, breadth;
 Rectangle(double length, double breadth) {
     this.length = length;
     this.breadth = breadth;
 }
 void calArea() {
     area = length * breadth;
 }
}
