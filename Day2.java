import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows you want to print: ");
        int n = sc.nextInt();

//1. STAR BASED PATTERN

        // // Pattern 1
        // int rows = 1;
        // int stars = n;
        // while(rows <= n){
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }
        //     rows++;
        //     System.out.println();
        // }


        // // Pattern 2
        // int rows = 1;
        // int stars = 1;
        // while(rows <= n){
        //     int i=1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }
        //     rows++;
        //     stars++;
        //     System.out.println();
        // }


        // Pattern 3
        // int rows = 1;
        // int stars = n;
        // while(rows <= n){
        //     int i=1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }
        //     rows++;
        //     stars--;
        //     System.out.println();
        // }



        // // Pattern 4
        // int rows = 1;
        // int stars = 1;
        // int spaces = n - 1;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("  ");
        //         i++;
        //     }
        //     // stars
        //     int j = 1;
        //     while(j <= stars){
        //         System.out.print("* ");
        //         j++;
        //     }
        //     // next row preparation
        //     rows++;
        //     stars++;
        //     spaces--;
        //     System.out.println();
        // }



        // // Pattern 5
        // int rows = 1;
        // int stars = n;
        // int spaces = 0;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("  ");
        //         i++;
        //     }
        //     // stars
        //     int j = 1;
        //     while(j <= stars){
        //         System.out.print("* ");
        //         j++;
        //     }
        //     // next row preparation
        //     rows++;
        //     stars--;
        //     spaces++;
        //     System.out.println();
        // }


        // // Pattern 6
        // int rows = 1;
        // int stars = n;
        // int spaces = 0;
        // while(rows <= n){
        //     // spaces_1
        //     int i=1;
        //     while(i <= spaces*2){
        //         System.out.print("   ");
        //         i++;
        //     }
        //     // stars
        //     int k = 1;
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }
        //     // next row preparation
        //     rows++;
        //     stars--;
        //     spaces++;
        //     System.out.println();
        // }



        // // Pattern 7
        // int rows = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces*2){
        //         System.out.print("   ");
        //         i++;
        //     }
        //     // stars
        //     int k = 1;
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }
        //     // next row preparation
        //     rows++;
        //     stars++;
        //     spaces--;
        //     System.out.println();
        // }



        // // Pattern 8
        // int rows = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }

        //     // stars
        //     int k = 1;
        //     while(k <= 2*stars-1){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // next row preparation
        //     rows++;
        //     stars++;
        //     spaces--;
        //     System.out.println();
        // }



        // // Pattern 9
        // int rows = 1;
        // int stars = n;
        // int spaces = 0;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }

        //     // stars
        //     int k = 1;
        //     while(k <= 2*stars-1){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // next row preparation
        //     rows++;
        //     stars--;
        //     spaces++;
        //     System.out.println();
        // }



        // // Pattern 10
        // int rows = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }

        //     // stars
        //     int k = 1;
        //     while(k <= stars){
                    // if(k%2 != 0){
                    //     System.out.print("*  ");
                    // }else{
                    //     System.out.print("   ");
                    // }  
        //      k++;
        //     }

        //     // next row preparation
        //     rows++;
        //     stars+=2;
        //     spaces--;
        //     System.out.println();
        // }



        // // Pattern 11
        // int rows = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(rows <= n){
        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }


        //     // slash_ star
        //     int k = 1;
        //     while(k <= stars){
        //         if(k%2 != 0){
        //             System.out.print("*  ");
        //         }else{
        //             System.out.print("|  ");
        //         }
        //         k++;
        //     }


        //     // next row preparation
        //     rows++;
        //     stars+=2;
        //     spaces--;
        //     System.out.println();
        // }


        // // Pattern 12
        // int rows = 1;
        // int stars = 1;
        // int spaces = 2*n-3;
        // while(rows <= n){
        //     // star_1
        //     int j = 1;
        //     while(j <= stars){
        //         System.out.print("*  ");
        //         j++;
        //     }

        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }

        //     // star_2
        //     int k = 1;
        //     if(rows == n){
        //         k=2;
        //     }
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // next row preparation
        //     rows++;
        //     stars++;
        //     spaces-=2;
        //     System.out.println();
        // }


        // // Pattern 13
        // int rows = 1;
        // int stars = n;
        // int spaces = 2*rows-3;
        // while(rows <= n){
        //     // star_1
        //     int j = 1;
        //     while(j <= stars){
        //         System.out.print("*  ");
        //         j++;
        //     }

        //     // spaces
        //     int i=1;
        //     while(i <= spaces){
        //         System.out.print("   ");
        //         i++;
        //     }

        //     // star_2
        //     int k = 1;
        //     if(rows == 1){
        //         k=2;
        //     }
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // next row preparation
        //     rows++;
        //     stars--;
        //     spaces+=2;
        //     System.out.println();
        // }


//2. MIRROR AND NUMBER PATTERNS


        // // Pattern 14
        // int row = 1;
        // int stars = 1;
        // while(row <= 2*n-1){
        //     //stars
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < n){
        //         stars++;
        //     }else{
        //         stars--;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 15
        // int row = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(row <= 2*n-1){
        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("  ");
        //         j++;
        //     }

        //     //stars
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < n){
        //         spaces--;
        //         stars++;
        //     }else{
        //         spaces++;
        //         stars--;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 16
        // int row = 1;
        // int stars = 1;
        // int spaces = n-1;
        // while(row <= 2*n-1){
        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("  ");
        //         j++;
        //     }

        //     //stars
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < n){
        //         spaces--;
        //         stars++;
        //     }else{
        //         spaces++;
        //         stars--;
        //     }
        //     row++;
        //     System.out.println();
        // }


        
        // // Pattern 17
        // int row = 1;
        // int stars = n;
        // int spaces = 2*row-2;
        // while(row <= 2*n-1){
        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("  ");
        //         j++;
        //     }

        //     //stars
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("* ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < n){
        //         spaces+=2;
        //         stars--;
        //     }else{
        //         spaces-=2;
        //         stars++;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 18
        // int row = 1;
        // int stars = n;
        // int spaces = n-1;
        // while(row <= 2*n-1){
        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("   ");
        //         j++;
        //     }

        //     //stars
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("*  ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < n){
        //         spaces--;
        //         stars--;
        //     }else{
        //         spaces++;
        //         stars++;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 19
        // int row = 1;
        // int stars = n/2;
        // int spaces = 2*row-1;
        // while(row <= n){
        //     //stars_1
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("*  ");
        //         i++;
        //     }

        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("   ");
        //         j++;
        //     }

        //     //stars_2
        //     int k = 1;
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < (n/2+1)){
        //         spaces+=2;
        //         stars--;
        //     }else{
        //         spaces-=2;
        //         stars++;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 20
        // int row = 1;
        // int stars = n/2 + 1;
        // int spaces = 2*row-3;
        // while(row <= n){
        //     //stars_1
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("*  ");
        //         i++;
        //     }

        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("   ");
        //         j++;
        //     }

        //     //stars_2
        //     int k = 1;
        //     if(row == 1  || row == n){
        //         k=2;
        //     }
        //     while(k <= stars){
        //         System.out.print("*  ");
        //         k++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < (n/2+1)){
        //         spaces+=2;
        //         stars--;
        //     }else{
        //         spaces-=2;
        //         stars++;
        //     }
        //     row++;
        //     System.out.println();
        // }



        // // Pattern 21
        // int row = 1;
        // int stars = 2*row-1;
        // int spaces = n/2 + 1;
        // while(row <= n){
        //     // Spaces
        //     int j = 1;
        //     while(j <= spaces){
        //         System.out.print("   ");
        //         j++;
        //     }

        //     //stars_1
        //     int i = 1;
        //     while(i <= stars){
        //         System.out.print("*  ");
        //         i++;
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < (n/2+1)){
        //         spaces--;
        //         stars+=2;
        //     }else{
        //         spaces++;
        //         stars-=2;
        //     }
        //     row++;
        //     System.out.println();
        // }



        // // Pattern 22
        // int row = 1;
        // int outer_spaces = n/2 + 1;
        // int inner_spaces = 2*row-3;
        // while(row <= n){
        //     // Outer_ Spaces
        //     int j = 1;
        //     while(j <= outer_spaces){
        //         System.out.print("   ");
        //         j++;
        //     }

        //     //stars_1
        //     System.out.print("*  ");

        //      // Inner_Spaces
        //     int k = 1;
        //     while(k <= inner_spaces){
        //         System.out.print("   ");
        //         k++;
        //     }

        //     //stars_2
        //     if((row == 1 || row == n)){
        //         System.out.print("");
        //     }else{
        //         System.out.print("*  ");
        //     }
            

        //     // Next row preparation
        //     // Mirror image
        //     if(row < (n/2+1)){
        //         outer_spaces--;
        //         inner_spaces+=2;
        //     }else{
        //         outer_spaces++;
        //         inner_spaces-=2;
        //     }
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 23
        // int row = 1;
        // while(row <= n){
        //     //stars
        //     int i = 1;
        //     while( i <= n){
        //         if((row == 1 || row == n || i == 1 || i == n)){
        //             System.out.print("*  ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //         i++;
        //     }
            
        //     row++;
        //     System.out.println();
        // }


        // // Pattern 24
        // int row = 1;
        // int outer_spaces = 2*row-3;
        // int inner_spaces = 2*row+1;
        // while(row <= n){
        //     // Outer_ Spaces
        //     int j = 1;
        //     while(j <= outer_spaces){
        //         System.out.print("  ");
        //         j++;
        //     }

        //     //stars_1
        //     System.out.print("* ");

        //      // Inner_Spaces
        //     int k = 1;
        //     while(k <= inner_spaces){
        //         System.out.print("  ");
        //         k++;
        //     }

        //     //stars_2
        //     if(row == n/2+1){
        //         System.out.print("");
        //     }else{
        //         System.out.print("* ");
        //     }

        //     // Next row preparation
        //     // Mirror image
        //     if(row < (n/2+1)){
        //         outer_spaces+=2;
        //         inner_spaces-=2;
        //     }else{
        //         outer_spaces-=2;
        //         inner_spaces+=2;
        //     }
        //     row++;
        //     System.out.println();
        // }



        // // Pattern 25
        // int row = 1;
        // int count = 2*row-1;
        // int spaces = n-1;
        // while(row <= n){
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("  ");
        //         i++;
        //     }

        //     int j = 1;
        //     while(j<=count){
        //         System.out.print("1 ");
        //         j++;
        //     }

        //     row++;
        //     count+=2;
        //     spaces--;
        //     System.out.println();
        // }


        // // Pattern 26
        // int row = 1;
        // int count = 2*row-1;
        // int spaces = n-1;
        // while(row <= n){
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("  ");
        //         i++;
        //     }

        //     int j = 1;
        //     while(j<=count){
        //         System.out.print(row + " ");
        //         j++;
        //     }

        //     row++;
        //     count+=2;
        //     spaces--;
        //     System.out.println();
        // }


        // // Pattern 27
        // int row = 1;
        // int count = 2*row-1;
        // int spaces = n-1;
        // int counter = 1;
        // while(row <= n){
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("\t");
        //         i++;
        //     }

        //     int j = 1;
        //     while(j<=count){
        //         System.out.print(counter + "\t");
        //         j++;
        //         counter++;
        //     }

        //     row++;
        //     count+=2;
        //     spaces--;
        //     System.out.println();
        // }



        // // Pattern 28
        // int row = 1;
        // int count = 2*row-1;
        // int spaces = n-1;
        // while(row <= n){
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("\t");
        //         i++;
        //     }

        //     int j = 1;
        //     int counter = 1;
        //     while(j<=count){
        //         System.out.print(counter + "\t");
        //         j++;
        //         counter++;
        //     }

        //     row++;
        //     count+=2;
        //     spaces--;
        //     System.out.println();
        // }


        // // Pattern 29
        // int row = 1;
        // int star = 1;
        // int spaces = n-1;
        // while(row <= n){
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("\t");
        //         i++;
        //     }

        //     int j = 1;
        //     int counter = 1;
        //     while(j<=star){
        //         System.out.print(counter + "\t");
        //         if(j <= star/2){
        //             counter++;
        //         }else{
        //             counter--;
        //         }
        //         j++;  
        //     }

        //     row++;
        //     star+=2;
        //     spaces--;
        //     System.out.println();
        // }


        // // Pattern 30
        // int row = 1;
        // int star = 1;
        // int spaces = n-1;
        // int val = 1;
        // while(row <=2*n-1){
        //     // space
        //     int i = 1;
        //     while(i <= spaces){
        //         System.out.print("  ");
        //         i++;
        //     }

        //     // pattern
        //     int j = 1;
        //     int p = val; 
        //     while(j<=star){
        //         System.out.print(p + " "); 
        //         // for half pattern  
        //         if(j <= star/2){
        //             p++;  //increment in a row
        //         }else{
        //             p--;  //decrement in a row
        //         }
        //         j++;
        //     }


        //     // mirroring
        //     if(row < n){
        //         star+=2;
        //         spaces--;
        //         val++;  //increment in a next row
        //     }else{
        //         star-=2;
        //         spaces++;
        //         val--;  //decrement in a next row
        //     }
        //     row++;
        //     System.out.println();
        // }


        sc.close();
    }
}
