import java.awt.print.Pageable;
import java.util.Scanner;
void main(){
//    ============================================================

//    Q1) check even or odd number
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the number : ");
//    int num = sc.nextInt();
//
//    if ( num % 2 == 0 ){
//        System.out.println("Even");
//    }else {
//        System.out.println("Odd");
//    }

//    ==============================================================

//    Q2) check chhutti kitne din bad hai
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Monday =    1");
//    System.out.println("Tuesday =   2");
//    System.out.println("Wednesday = 3");
//    System.out.println("Thursday =  4");
//    System.out.println("Friday =    5");
//    System.out.println("Saturday =  6");
//    System.out.println("Sunday =    7");
//    System.out.print("enter your day number : ");
//    int num = sc.nextInt();
//    if (num==1){
//        System.out.println("5 din bad chhutti hai");
//    } else if (num == 2) {
//        System.out.println("4 din bad chhutti hai");
//    } else if (num==3) {
//        System.out.println("3 din bad chhutti hai");
//    } else if (num==4) {
//        System.out.println("2 din bad chhutti hai");
//    } else if (num==5) {
//        System.out.println("1 din bad chhutti hai");
//
//    } else {
//        System.out.println("Aaj hi chhutti h");
//    }

//    ============================================================

//    Q3 Java mein program likho jo 3 numbers mein se sabse bada number print kare.
//     Scanner sc = new Scanner(System.in);
//    System.out.println("enter your first number");
//    int num1 = sc.nextInt();
//    System.out.println("enter your second number");
//    int num2 = sc.nextInt();
//    System.out.println("enter your third number");
//    int num3 = sc.nextInt();
//
//    if (num1 > num2 && num1> num3){
//        System.out.println(num1 +" Is Greater");
//
//    } else if (num2 > num1 && num2 > num3) {
//        System.out.println(num2 +" Is Greater");
//
//    } else if (num3 > num1 && num3 > num2) {
//        System.out.println(num3 +" Is Greater");
//
//    } else {
//        System.out.println("all numbers are equal");
//    }

//    ==================================================================
//    Q4 Ek Java program banao jo check kare ki koi number 5 aur 10 dono se divisible hai ya nahi
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your number : ");
//    int num = sc.nextInt();
//     if( num%5==0 && num%10==0){
//         System.out.println("Yes");
//     }else {
//         System.out.println("No");
//     }

//    ================================================================
//    Q5 Java mein program likho jo user se ek number input le
//    Conditions:
//   - Number 1 se 10 ke beech (inclusive) hai → In Range
//   - Otherwise → Out of Range

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number : ");
//    int num = sc.nextInt();
//
//    if (num>=1 && num<=10){
//        System.out.println("In Range");
//    }else {
//        System.out.println("Out Of Range");
//    }

//    ===============================================
//    Q6 Java mein program likho jo user se electricity units input le.
//    Units 100 ya usse kam hain → Low Usage
//    Units 101 se 300 tak hain → Medium Usage
//    Units 300 se zyada hain → High Usage

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your usage in units");
//    int units = sc.nextInt();
//
//    if (units <=100){
//        System.out.println("Low Usage");
//    } else if (units>=101 && units<=300) {
//        System.out.println("Medium Usage");
//    } else if (units > 300) {
//        System.out.println("High Usage");
//
//    }else {
//        System.out.println("Result not found");
//    }

//    ====================================================================================
//    Q7 Java program likho jo user se username aur password input le.
//    Username "admin" aur password "1234" hai → Login Successful
//    Otherwise → Invalid Credentials

//    Scanner sc = new Scanner(System.in);
////    long adminuserid = 36427;
////    long adminuserpass = 1234;
//    System.out.print("Enter User ID : ");
//    long userid = sc.nextLong();
//    System.out.print("Enter Password : ");
//    long password = sc.nextLong();
//
//    if (userid == 36427 && password == 1234) {
//        System.out.println("Correct! Login Successful");
//    } else {
//        System.out.println("Invalid Credentials");
//    }

//    ============================================================================
//    Q8 User se ek integer input lo aur output do:
//     - Number 0 hai → Zero
//     - Number 0 se bada hai → Positive
//     - Number 0 se chhota hai → Negative

//    Scanner sc =new Scanner(System.in);
//    System.out.println("Enter number : ");
//    long num = sc.nextLong();
//
//    if (num == 0){
//        System.out.println("Zero");
//    } else if (num > 0) {
//        System.out.println("Positive");
//
//    }else {
//        System.out.println("Negative");
//    }

//    ====================================================================
//    Q9 Java mein program likho jo user se year input le aur check kare ki year leap year hai ya nahi.
//      - Leap year hai → Leap Year
//      - Leap year nahi hai → Not a Leap Year

//    Scanner sc =new Scanner(System.in);
//    System.out.println("Enter the year : ");
//    int year = sc.nextInt();
//    if (year % 400 == 0 ){
//        System.out.println("Leap Year");
//    } else if (  year % 4 == 0 && year % 100!=0 ) {
//        System.out.println(" Leap Year");
//
//    }else {
//        System.out.println("Not a Leap Year");
//    }

//    ======================================================================

//    Q10 Java mein program likho jo user se 3 subjects ke marks input le.
//  Conditions:
//  - Kisi bhi subject mein marks 0–100 ke bahar hain → Invalid Marks
//  - Kisi bhi subject mein marks 33 se kam hain → Fail
//  - Teeno subjects mein pass hain, aur average marks 75 ya zyada hain → Distinction
//  - Average marks 60 ya zyada hain → First Division
//  - Average marks 45 ya zyada hain → Second Division
//  - Otherwise → Third Division

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the Marks of  Sub 1 :  ");
//    int marks1 = sc.nextInt();
//    System.out.println("Enter the Marks of Sub 2 :  ");
//    int marks2 = sc.nextInt();
//    System.out.println("Enter the Marks of Sub 3 :  ");
//    int marks3 = sc.nextInt();
//
//    int avg = (marks1+marks2+marks3)/3;
//    System.out.println(avg);
//
//
//
//    if (marks1<0 || marks1>100) {
//        System.out.println("invalid marks");
//
//    } else if (marks2<0 || marks2>100) {
//        System.out.println("invalid marks");
//
//    } else if (marks3<0 || marks3>100) {
//        System.out.println("invalid marks");
//
//    } else if (marks1<33 ) {
//        System.out.println("Failed in Sub1");
//
//    } else if (marks2<33) {
//        System.out.println("Failed in Sub2");
//
//    } else if (marks3<33) {
//        System.out.println("Failed in Sub3");
//
//    } else if (avg>60) {
//        System.out.println("First Division");
//
//    } else if (avg>45 && avg<60) {
//        System.out.println("Second Division");
//
//    } else if (avg<45 && avg>33) {
//        System.out.println("Third Division");
//
//
//    } else if (marks1>=33 && marks2 >=33 && marks3 >=33 && avg >= 75){
//        System.out.println("Distinction");
//
//
//    }

//    ===========================================================================================

//    Q11 User se age aur student status (yes/no) input lena hai, phir rules ke according output print karna hai:
//     Age negative → Invalid Age
//     Age 5 se kam → Free Entry
//     Age 5–17 → 30% Discount
//     Age 18 ya zyada aur student hai → 20% Discount
//     Age 18 ya zyada aur student nahi hai → No Discount

//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter your Age : ");
//    int age = sc.nextInt();
//    System.out.print("Enter Student Status : ");
//    String student = sc.next();
//
//    if(age<0){
//        System.out.println("Invalid Age");
//
//    } else if ( age<5) {
//        System.out.println("Free Entry");
//
//    } else if (age>5 && age<=17) {
//        System.out.println("30% Discount");
//
//    }else if (age >= 18) {
//        if (student.equals("yes")) {
//            System.out.println("20% Discount");
//        } else {
//            System.out.println("No Discount");
//        }
//    }

//    ====================================================================================

//    Q12 Java mein ek program likho jo student ki details input lekar check kare ki woh scholarship ke liye eligible
//    hai ya nahi.
//    Conditions
//1. Age 0 ya negative hai → Invalid Age
//2. Family income ₹2,50,000 se zyada hai → Not Eligible: Income Too High
//3. Marks 60% se kam hain → Not Eligible: Low Marks
//4. Income ₹2,50,000 ya usse kam aur marks 60% ya usse zyada hain → Eligible for Scholarship
//5. Category sc ya st hai aur baaki eligibility conditions bhi satisfy hoti hain → Eligible for Special Scholarship
    
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your Age : ");
//    int age = sc.nextInt();
//    System.out.println("Enter Your Cast");
//    String cast = sc.next();
//    System.out.println("Enter Your family Annual Income : ");
//    int income = sc.nextInt();
//    System.out.println("Enter your 12 marks in percentage : ");
//    int marks = sc.nextInt();
//
//    if(age<=0){
//        System.out.println("Invalid Age");
//
//    } else if (income>250000 ) {
//        System.out.println("Not eligible: Income too High");
//
//    } else if (marks<60) {
//        System.out.println("Not eligible:Marks too low");
//
//    } else if (cast.equals("sc") || cast.equals("st")) {
//        System.out.println("Eligible for special  scholarship");
//
//    } else if (income<=250000 && marks>=60) {
//        System.out.println("Eligible for scholarship");
//
//
//    } else {
//        System.out.println("Eligible for scholarship");
//
//
//    }

//    ===================================================================================

//    Q13 Java program bana jo customer ki shopping amount aur membership status ke according discount category bataye.
//Conditions:
//1. Amount ₹0 se kam hai → Invalid Amount
//2. Amount ₹0 se ₹999 tak hai → No Discount
//3. Amount ₹1000 se ₹4999 tak hai:
//   - Member yes hai → 10% Discount
//   - Member no hai → 5% Discount
//4. Amount ₹5000 ya usse zyada hai:
//   - Member yes hai → 20% Discount
//   - Member no hai → 15% Discount

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Shopping amount : ");
//    int amount = sc.nextInt();
//    System.out.println("Member : ");
//    String member = sc.next();
//
//    if (amount<0){
//        System.out.println("Invalid Amount");
//
//    } else if (amount>=0 && amount<=999) {
//        System.out.println("No Discount");
//
//    } else if (amount>=1000 && amount<=4999  && member.equalsIgnoreCase("Yes")) {
//        System.out.println("10% Discount");
//
//    } else if (amount>=1000 && amount<=4999 && member.equalsIgnoreCase("No")) {
//        System.out.println("5% Discount");
//
//    } else if (amount>=5000 && member.equalsIgnoreCase("Yes")) {
//        System.out.println("20% Discount");
//
//    }else {
//        System.out.println("15% Discount");
//    }

//    ======================================================================================

//    Q14 Java program banao jo student ki attendance aur marks ke basis par eligibility check kare.
//     - Attendance 0 se kam ya 100 se zyada → Invalid Attendance
//     - Attendance 75% se kam → Not Eligible: Low Attendance
//     - Attendance 75% ya zyada aur marks 40 se kam → Not Eligible: Low Marks
//     - Attendance 75% ya zyada aur marks 40 ya zyada → Eligible for Exam

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Attendance : ");
//    int attendance = sc.nextInt();
//    System.out.println("Marks : ");
//    int marks = sc.nextInt();
//
//    if (attendance<0 || attendance>100){
//        System.out.println("Invalid Attendance");
//
//    } else if (attendance<75) {
//        System.out.println("Not Eligible: Low Attendance");
//
//    } else if (attendance>=75 && marks<40) {
//        System.out.println("Not Eligible: Low Marks");
//
//    }else {
//        System.out.println("Eligible For Exam");
//    }

//    Q15 Java mein ek program bana jo student ki details lekar admission eligibility check kare
//    Conditions
//    1. Age 0 ya negative hai → Invalid Age
//    2. Marks 0 se kam ya 100 se zyada hain → Invalid Marks
//    3. Entrance score 0 se kam ya 100 se zyada hai → Invalid Entrance Score
//    4. Marks 50% se kam hain → Not Eligible: Low Marks
//    5. Marks 50% ya zyada hain, lekin entrance score 40 se kam hai → Not Eligible: Low Entrance Score
//    6. Dono minimum requirements complete hain:
//       - Category sc ya st hai → Eligible for Special Admission
//        - Baaki categories → Eligible for Admission

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Age : ");
//    int age = sc.nextInt();
//    System.out.println("Enter Your 12 Marks in percentage : ");
//    int marks = sc.nextInt();
//    System.out.println("Enter Your Entrance Exam Score : ");
//    int score = sc.nextInt();
//    System.out.println("Enter Your Category : ");
//    String category = sc.next();
//
//    if (age<=0){
//        System.out.println("Invalid Age");
//
//    } else if (marks<0 || marks>100) {
//        System.out.println("Invalid Marks");
//
//
//    } else if (score<0 || score>100) {
//        System.out.println("Invalid Entrance Score");
//
//    } else if (marks<50) {
//        System.out.println("Not Eligible: Low Marks");
//
//    } else if (marks>=50 && score<40) {
//        System.out.println("Not Eligible: Low Entrance Score");
//
//    } else if (category.equalsIgnoreCase("sc") || category.equalsIgnoreCase("st")) {
//        System.out.println("Eligible For Special Admission");
//
//    }else {
//        System.out.println("Eligible for Admission");
//    }

//    ===========================================================================================

//    Q16

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age : ");
    int age = sc.nextInt();
    System.out.println("Enter your income : ");
    int income = sc.nextInt();
    System.out.println("do you make content : ");
    String content = sc.next();

    if (age>20){
        System.out.println("congratulations! you got a iphone");
    } else if (income>100000) {
        System.out.println("that's Great");

    } else if (content.equalsIgnoreCase("yes")) {
        System.out.println("now you are eligible to make good content");

    }else {
        System.out.println(" not eligible");
    }
}