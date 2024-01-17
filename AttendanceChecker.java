
import java.util.Scanner;

public class Main {
     
     static Scanner scanner = new Scanner(System.in);
     static final int MAX_USERS = 100;
     static String[] firstNames = new String[MAX_USERS];
     static String[] middleNames = new String[MAX_USERS];
     static String[] lastNames = new String[MAX_USERS];
     static int userCount = 0;
     static boolean[] attendance = new boolean[MAX_USERS];
     
     public static void main(String[] args) {
         
         System.out.println("=================================");
         System.out.println("ATTENDANCE CHECKER");
         System.out.println();
         System.out.println("1.Register User\n2.Mark Attendance\n3.Generate Attendance Report\n4.List of Students\n5.Exit");
         System.out.print("Choose: ");
         int option = scanner.nextInt();
         
         switch (option) {
             case 1:
             newUser();
             break;
             
             case 2:
             markAttendance();
             break;
             
             case 3:
             attendanceReport();
             break;
             
             case 4:
             listOfStudents();
             break;
             
             case 5:
         }
         
     }
     static void attendanceMenu() {
         System.out.println("\n\n");
         System.out.println("=================================");
         System.out.println("ATTENDANCE CHECKER");
         System.out.println();
         System.out.println("1.Register User\n2.Mark Attendance\n3.Generate Attendance Report\n4.List of Students\n5.Exit");
         System.out.print("Choose: ");
         int option = scanner.nextInt();
         
         switch (option) {
             case 1:
             newUser();
             break;
             
             case 2:
             markAttendance();
             break;
             
             case 3:
             attendanceReport();
             break;
             
             case 4:
             listOfStudents();
             break;
             
             case 5:
         }
         
     }
     static void newUser() {
         
         String firstName, middleName, lastName;
         
         
         System.out.println("\n\n");
         System.out.println("=================================");
         System.out.println("REGISTER USER");
         System.out.println();
         
         
         System.out.print("First Name: ");
         firstName = scanner.next();
         scanner.nextLine();
         
         System.out.print("Middle Name: ");
         middleName = scanner.nextLine();
         
         System.out.print("Last Name: ");
         lastName = scanner.nextLine();
         
         firstNames[userCount] = firstName;
         middleNames[userCount] = middleName;
         lastNames[userCount] = lastName;
         
         userCount++;
         
         System.out.println();
         System.out.println("--USER SUCCESSFULLY REGISTERED--");
         
         attendanceMenu();
     }
     static void markAttendance() {
         System.out.println("\n\n");
         System.out.println("=================================");
         System.out.println("MARK ATTENDANCE");
         System.out.println();
         
         System.out.println("Enter user index to mark attendance (1 to " + userCount + "): ");
         
        int userIndex = scanner.nextInt();

        if (userIndex >= 1 && userIndex <= userCount) {
            attendance[userIndex - 1] = true;
            String userName = firstNames[userIndex - 1] + " " + middleNames[userIndex - 1] + " " + lastNames[userIndex - 1];
            System.out.println("--ATTENDANCE MARKED SUCCESSFULLY FOR " + userName + "--");
            
            
            
        } else {
            System.out.println("Invalid user index");
        }
         
         attendanceMenu();
     }
     static void attendanceReport() {
         System.out.println("\n\n");
         System.out.println("=================================");
         System.out.println("ATTENDANCE REPORT");
         System.out.println();
         for (int i = 0; i < userCount; i++) {
             String username = firstNames[i] + " " + middleNames[i] + " " + lastNames[i];
             String attendanceStatus = attendance[i] ? "PRESENT" : "ABSENT";
             System.out.println(username + "[" + (i + 1) + "]" + ": " + attendanceStatus);
             
             
             
         }
         attendanceMenu();
     }
     static void listOfStudents() {
         System.out.println("\n\n");
         System.out.println("=================================");
         System.out.println("LIST OF STUDENTS");
         System.out.println();
         
         for (int i = 0; i < userCount; i++) {
             String studentList = firstNames[i] + " " + middleNames[i] + " " + lastNames[i] + "[" + (i + 1) + "]";
             System.out.println(studentList);
             
             }
         attendanceMenu();
     }
 }