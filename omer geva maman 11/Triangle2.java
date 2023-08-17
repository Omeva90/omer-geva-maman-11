import java.util.Scanner;
public class Triangle2{
    public static void main(String[]args){
    Scanner scan = new Scanner (System.in);
    System.out.println("This program calculates different " + "types of triangles");
    System.out.println("please enter the three lenghts " + "of the triange sides");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    //this is the pythagoras formula to determent if the triangle is a right-angle triangle
    if ((Math.pow(a,2)) +  (Math.pow(b,2)) == (Math.pow(c,2))){
        System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an right-angle triangle"); 
    }
    //if all the sides of the triangle are equal than it is a equilateral triangle
    if((a == b && b == c) && (a > 0) && (b > 0) && (c > 0)){
     System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an equilateral triangle");
    }
    //if two sides of the triangle are equal that it is a isosceles triangle
    if((a == b && b != c ) || (a != b && b == c ) && (a > 0) && (b > 0) && (c > 0)){
     System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents an isosceles triangle");
    }
    //if non of the sides are equal than it is a common triangle
    if((a != b && b != c) && (a > 0) && (b > 0) && (c > 0)){
     System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " represents a common triangle");
    }
    //if the user trys to type - numbers than it will give him the following massege
    if((a < 0) || (b < 0) || (c < 0) ){
     System.out.println("the numbers : " + (a) + " , " + (b) + " and " + (c) + " cannot represent a triangle");   
    }
    //end of method main
    //end of class triangle1    
    }
}