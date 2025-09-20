package com.TNF.Abstarct;
class Square extends Shape {
 double side;
 Square(double side) {
     this.side = side;
 }
 void calArea() {
     area = side * side;
 }
}

