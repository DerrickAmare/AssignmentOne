public class QuestionThird {

    public void display() {
        int n = 10;

        for (int i = n; i >1; i--) {
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
        // for the lower part U SHAPE
        for(int i=0;i<n;i++){
          // for the first half of the L shape
            for(int j=1; j<n;j++){
                if (j==1|| i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // for the second of _| shape
            for(int j=1; j<n;j++){
                if (j==n-1|| i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }
    }

}