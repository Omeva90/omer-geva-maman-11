import java.util.Scanner;
public class Triangle1{
    public static void main(String[]args){
    Scanner scan = new Scanner (System.in);
    System.out.println("This program calculates the area" + "and the perimeter of a triangle");
    System.out.println("please enter the three lenghts" + "of the triange sides");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    
    
    System.out.println("the lenghts of the triangle sides are: " + (a)+ ","+(b)+","+(c)+"."); //prints the lenghts that the user chose
    int perimeter = (a + b + c);
    System.out.println("the perimeter of the triangle is: " + perimeter);// prints the perimiter of the triangle
    double area = (a + b + c)/2;
    System.out.println("the area of the triangle is: " + area); //prints the area of the triangle by using the heron formula
    //end of method main
    //end of class triangle1
    }
}