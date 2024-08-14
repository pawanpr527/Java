// import java.util.Arrays;

// public class mainn{
//     public static void main(String[] args){
      // System.out.println("hello this is my first program");
      // int a,b;
      // a  = 20;
      // b = 10;
    //  float c = 34.50f;
    //  float d =(a/b)*c;
    //  int randomm = (int)(Math.random()*20);
    //  System.out.println(randomm);
    //  String yello = (b<=randomm) ? "B is small"  : "B is large";
    //  System.out.println(yello);
    //  switch(b){
    //   case 2:
    //    System.out.println("this is wrong");
    //    break;
    //   case 11:
    //    System.out.println("this  wrong");
    //    break;
    //   case 5:
    //    System.out.println("this is ");
    //    break;
    //   case 8:
    //    System.out.println(" is wrong");
    //    break;
    //   default:
    //    System.out.println("this is right");

    //  }

    //  while(b<20){
    //   System.out.println("hello\t" + b);
    //   b++;
    //  }

    //  do{
    //  System.out.println("Hello Bachhoo ! " + a);
    //   --a;
    //  } while(a>10);

    // int x = 0;
    // while(x<=6){
    //   if(x<6){
    //     System.out.println("X is small "+ x);
    //   } else {
    //     System.out.println("X is large "+ x);
    //   }
    //   x++;
    // }
    // for(int i = 0; i<6;i++){
    //   for(int k = 6; k>i;k--){
    //     System.out.println("");  
    //   }
    //   for(int j = 0; j<i;j++){
    //     System.out.print("*");
    //   }
    //   for(int l = 0; l<6;l++){
    //     System.out.println("");  
    //   }
    //   System.out.println();
    // }
    // int i[] = {2,3,4,2,3,1,2,3};
    // float x=0.0f,y=0;
    // for(int j  : i){
    //     x += j;
    // }
    // y = x/i.length;
    // System.out.println("Average : " + y);
    // int newArr[][] = {{2,4,5},{6,4,5,2},{0,8,9,2}};
    // for(int i=0; i<newArr.length; i++){
    //   System.out.println(Arrays.toString(newArr[i]));  //for printing only single index
    //  for(int j=0; j<newArr[i].length; j++){
    //    System.out.println(newArr[i][j] + "\t");
 
//     // }
//     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//   for (int[] row : myNumbers) {
//     for (int i : row) {
//     System.out.println(i);
//   }
// }

// Function in java
// int k = hero(10);
// System.out.println("Sum of x is " + k );

// }
// static int hero(int x){
//   if(x==0) {
//    return 1;
//   } else{
//     return x*hero(x-1);
//   }
// }
// }
// public class mainn{
  // static void myname(){
  //   System.out.println("Hey there I'm here ");
  // }

  // static void test(){
  //   System.out.println("Tell me about your self ");
  // }

  // public static void mainn(String[] args){
  //   myname();
  //   test();
  // }
  // int x = 56;
  // String k = "My score is ";

  // public static void main(String[] args) {
  //   mainn p1 = new mainn();
  //   mainn p2 = new mainn();
  //   System.out.println(p2.k + p1.x);
  // }
// }
// public class mainn {
//   static void myname() {
//     System.out.println("Hey there I'm here ");
//   }

//   static void test() {
//     System.out.println("Tell me about your self ");
//   }

//   public static void main(String[] args) {
//     myname();
//     test();
//   }
// }
// public class main{
  // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // main method
//   public static void main(String[] args) {
//     myStaticMethod(); // Call the static method

//    main myObj = new main(); // Create an object of MyClass
//     myObj.myPublicMethod(); // Call the public method
//   }
// }
// public class Main {
//   int age;
//   int height;

//   public Main(int x, int y) {
//       age = x;
//       height = y;
//   }

//   public static void main(String[] args) {
//       Main obj1 = new Main(18, 6);
//       System.out.println("Age is " + obj1.age + " height is " + obj1.height);
//   }
// }

// class Main{
//   public static void main(String[] args){
//     person p1 = new person();
//     System.out.println("The age of " + p1.name + " is "+ p1.ag);
//   }
// }
// import java.util.*;
// class student{
//   public int age = 45;

//   public void honk(){
//     System.out.println("Age of student is "+ age);
//   }
// }

// class boy extends student{
//   public void getName(){
//   Scanner x = new Scanner(System.in);
//   String name = x.nextLine();
//   System.out.println("The name of student is "+ name);
//   }
// }

// public class Main{
// public static void main(String[] args){
//   boy bu = new boy();
//   bu.honk();
//   bu.getName();
// }
// }

// class Vehicle {
//   protected String brand = "Ford";        // Vehicle attribute
//   public void honk() {                    // Vehicle method
//     System.out.println("Tuut, tuut!");
//   }
// }

// class Car extends Vehicle {
//   private String modelName = "Mustang";    // Car attribute
//   public static void main(String[] args) {

//     // Create a myCar object
//     Car myCar = new Car();

//     // Call the honk() method (from the Vehicle class) on the myCar object
//     myCar.honk();

//     // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
//     System.out.println(myCar.brand + " " + myCar.modelName);
//   }
// }
//

//            Polymorphism

// class animal {
//   public void animalName(){
//   System.out.println("The animals are ... ");
//   }
// }

// class dog extends animal{
// public void animalName(){
//   System.out.println("the dog is jack ");
// }
// }

// class fox extends animal{
//   public void animalName(){
//     System.out.println("The fox is graceful");
//   }
// }

// class Main{
//   public static void main(String[] args){
//     animal name = new animal();
//     animal dname = new dog();
//     animal fame = new fox();
//     name.animalName();
//     dname.animalName();
//     fame.animalName();
    
//   }
// }

//  inner class


// class outer{
//   int x = 5;
//   class inner{
//     int y = 10;
//   }
// }

// class Main{
//   public static void main(String[] args){
//     outer o1 = new outer();
//     outer.inner o2 = o1.new inner();
//     System.out.println(o1.x+o2.y);
//   }
// }

// Abstract Class (Method to access class, it is used to hide details)


// abstract class animal{
//   public abstract void animalsound();
//   public void animalname(){
//     System.out.println("the name of animal is Lion");
//   }
// }

// class pig extends animal{
//   public void animalsound(){
//     System.out.println("the name of sound is weeen weee !");
//   }
// }

// class Main{
//   public static void main(String[] args){
//     animal a1 = new pig();
//     a1.animalname();
//     a1.animalsound();
//   }
// }


// interFace class is used when group of method is hide and don't have body, same like abstract class

// interface bird{
//   public void birdname(int x);
//   public int birdage();
//   public String birdsound(String sound);

// }

// class parrot implements bird{
//   public void birdname(int x ){
//     System.out.println("the bird name is Parrot"+ x );
//   }
//   public int birdage(){
//     System.out.println("the bird age is 18");
//     return 0;
//   }

//   public String birdsound(String sound){
//     System.out.println("the bird sound is "+ sound);

//   return null;
// }
// }
// class Main{
//   public static void main(String[] args) {
//     bird b1 = new parrot();
//     b1.birdname(7);
//     b1.birdage();
//     b1.birdsound("Pikok");

//   }
// }

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int B;
    public static int H;
    public static boolean flag;

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }

    public static void main(String[] args) {
        // No need to print flag here
      
    }
}