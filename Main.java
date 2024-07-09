import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EX1
//        int largestNumber=0;
//        System.out.println("Enter the first number:");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the third number:");
//        int num3 = sc.nextInt();
//
//        if (num1>num2&&num1>num3){
//            largestNumber=num1;
//        } else if (num2>num3) {
//            largestNumber=num2;
//        }else {
//            largestNumber=num3;
//        }
//        System.out.println("The largest number is: "+largestNumber);

        //EX2
//        System.out.println("Enter a string:");
//        String string = sc.nextLine();
//        System.out.println("Enter the index number from 0 to "+(string.length()-1)+" :");
//        int index = sc.nextInt();
//        while (index>string.length()-1||index<0){
//            System.out.println("Index out of bound. Try again.");
//            index = sc.nextInt();
//        }
//
//        System.out.println("The character at the given index "+index+" is: "+string.charAt(index));

        //EX3
//        int number=0;
//        int sum=0;
//        String answer="";
//        do {
//            System.out.println("Enter a number:");
//            number= sc.nextInt();
//            sum+=number;
//            System.out.println("Input (Y) to continue. Input anything else to exit.");
//            answer=sc.next();
//        }while (answer.equalsIgnoreCase("Y"));
//        System.out.println("The sum is: "+sum);

        //EX4
//        int[] numbers={10, -21 , 30, 31, -25};
//        for (int number:numbers){
//            if (number>0){
//                System.out.println(number+" is a positive number.");
//            } else if (number < 0) {
//                System.out.println(number+" is a negative number.");
//            }
//        }


        //EXTRA - using Arraylist and taking values from user, and including zero
//        ArrayList<Integer> numbers=new ArrayList<>();
//        System.out.println("Enter the array length:");
//        int length = sc.nextInt();
//        System.out.println("Enter "+length+" integers into your array.");
//        int number;
//        for (int i = 0; i < length; i++) {
//            number= sc.nextInt();
//            numbers.add(number);
//        }
//
//        System.out.println("Your array: "+numbers);
//        for (int n:numbers){
//            if (n>0){
//                System.out.println(n+" is a positive number");
//            } else if (n<0) {
//                System.out.println(n+" is a negative number");
//            }else { System.out.println(n+" is zero");}
//        }
        //End of EXTRA

        //EX5

//  //Using Arraylist
//        ArrayList<String> words = new ArrayList<>();
//        words.add("Tuwaiq");
//        words.add("Bootcamp");
//        words.add("Student");
//        words.add("JAVA");
//
//        String shortest = words.getFirst();
//
//        for (String word:words){
//            if (word.length()<shortest.length()){
//                shortest=word;
//            }
//        }
//        System.out.println("The shortest word in the Arraylist is: "+shortest);
//
//  //Using array
//        String[] wordsArray={"Tuwaiq","Bootcamp","Student","JAVA"};
//         String shortest= wordsArray[0];
//        for (String word:wordsArray){
//            if (word.length()<shortest.length()){
//                shortest=word;
//            }
//        }
//        System.out.println("The shortest word in the Array is: "+shortest);



    }
}