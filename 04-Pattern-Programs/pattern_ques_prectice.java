
// =================================================
// QUES-1:      WAP TO PRINT SOLID RECTANGLE
// =================================================

// import java.util.*;

// public class pattern_ques_prectice{
//     public static void main(String[] args) {
        
//         // INPUT LENE KE LIYE(method-1)
//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter your value m: ");
//         int m = Sc.nextInt();

//         System.out.print("Enter your value n: ");
//         int n = Sc.nextInt();
        
//         // INPUT GIVEN(method-2)
//         // int m = 4;
//         // int n = 5;

//         // OUTER LOOP
//         for( int i=1; i<=m; i++){
//             // INNER LOOP
//             for( int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
        
//             System.out.println();

//         }
//     }
// }
// NOTE: YAHA OUTER LOOP ROWS KE LIYE HAI JO ROWS KO PRINT KRKE INCREMENT KREGI,
// AUR OUTER LOOP KE PRINTLN WALA SYOS BLANK HAI QKI HUME BUS NEXT LINE ME JUMP KRNA HAI,
//  QKI (*****) YE PATTERN TO INNER LOOP BNA H RAHI HAI.



// =======================================================================================
// QUES:                          WAP TO PRINT HOLLOW RECTANGLE
// =======================================================================================

// public class pattern_ques_prectice{
//     public static void main(String[] args) {
        
//         int m = 4;
//         int n = 5;

//         for(int i=1; i<=m; i++){
//             for(int j=1; j<=n; j++){

//                 if(i==1 || j==1 || i==4 || j==5){
//                     System.out.print("*");}
//                 else{
//                      System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// esme if statement esliye use ki gyi hai ki jis jis cell me ya to i =1 ya j=1 
// aur i=4 ya j=5 sirf vo hi cell print ho 
// || = OR
 


// ============================================================================
// QUES-3:                   WAP TO PRINT HALF PYRAMIND
// ============================================================================

// public class pattern_ques_prectice{
//      public static void main(String[] args) {
        
//         int n = 4;

//         for(int i=1; i<=n; i++){
//              for( int j=1; j<=i; j++){
//                  System.out.print("*");    
//              } 
        
//              System.out.println();
//          }
//      }
//  }


// ============================================================================
// QUES-4:                 WAP TO PRINT INVERTED HALF PYRAMIND
// ============================================================================
//  public class pattern_ques_prectice{
//      public static void main(String[] args) {
        
//         int n = 4;

//         for(int i=n; i>=1; i--){
//              for( int j=1; j<=i; j++){
//                  System.out.print("*");    
//              } 
        
//              System.out.println();
//          }
//      }
//  }