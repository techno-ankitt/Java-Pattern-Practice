// =========================================================
// QUES-5     HALF PYRAMIND (180 DEGREE ROTATED)
// ==========================================================
import java.util.*;
public class javapatternprectice{
    public static void main(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = Sc.nextInt();

        // outter loop
        for(int i=1; i<=n; i++){

            // inner loop -> print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");}

            // inner loop -> print star
            for(int j=1; j<=i; j++){
                System.out.print("*");}         
        
            System.out.println();
        }

    }
}


// =========================================================
// QUES-6          HALF PYRAMIND WITH NUMBERS
// // ==========================================================
// import java.util.*;

// public class javapatternprectice{
//     public static void main(String[] args) {
        
//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = Sc.nextInt();
    
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");

//             }
//             System.out.println();
//         }
//     }
// }

// =========================================================
// QUES-7     HALF NUMBER PYRAMIND (180 DEGREE ROTATED)
// ==========================================================

// public class javapatternprectice{
//     public static void main(String[] args) {
        
//         // Scanner Sc = new Scanner(System.in);
//         // System.out.print("Enter your number: ");
//         // int n = Sc.nextInt();
//         int n = 5;
        
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop -> print space
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // inner loop -> print j
//             for (int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// ============================================================================
// QUES-8:                 INVERTED HALF NUMBERS PYRAMIND
// ============================================================================
// public class javapatternprectice{
//     public static void main(String[] args) {
        
//         int n = 5;

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++)
//                 System.out.print(j);
        
//         System.out.println();
//         }
//     }
// }

// ============================================================================
// QUES-9:                       FLOYD'S TRIANGLE
// ============================================================================
// public class javapatternprectice{
//     public static void main(String[] args) {
        
//         int n = 5;
//         int number = 1;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number);
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// ============================================================================
// QUES-10:                       0-1 TRIANGLE
// // ============================================================================
// public class javapatternprectice{
//     public static void main(String[] args) {
        
//         int n = 5;
        
//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=i; j++){
//                  int sum = i+j;
//                 if(sum % 2 == 0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }