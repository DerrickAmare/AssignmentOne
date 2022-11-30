public class QuestionFourth {

   public void display(){
       int n = 10;
       for (int i = 0; i <n; i++) {
           // to print the first half of the triangle
           for (int j = 1; j < i; j++) {

               System.out.print("*");

           }
           // to print the space in between
           for(int j=1;j<2*(n-i);j++) {
               System.out.print(" ");
           }
           //to print the left side of the half triangle
           for(int j=1;j<i;j++){

               System.out.print("*");
           }
           System.out.println();


       }
   }
}

