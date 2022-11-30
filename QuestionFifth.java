public class QuestionFifth {

     public void display(){

         System.out.println();
    int n = 10;
     // to print the first long number of stars
     for (int i = 0; i < n; i++) {
         System.out.print("*");
     }
     // to print the first half of the triangle
     for (int i = n; i > 0; i--) {
         for (int j = 1; j < i; j++) {

             System.out.print("*");
         }
         System.out.println();
     }
     // to print the lower half triangle
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print("*");
         }
         System.out.println();
     }
     // to print the last long star
     for (int i = 0; i < 2 * n; i++) {
         System.out.print("*");
     }


       }

}
