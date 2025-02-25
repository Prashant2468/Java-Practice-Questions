
class Patterns {

    public static void main(String args[]) {
        //    1. Simple square Pattern
        // int n=5,m=5;
        // for (int i = 1; i<=5; i++) {
        //     for (int j = 1; j<=5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
// _______________________________________________________________
        //   2. Hollow square Pattern
        // int n = 5, m = 5;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if (i == 1 || i == n || j == 1 || j == m) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
// _______________________________________________________________

        // 3. Right triangle pattern
        // int n=5,m=5;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if (j<=i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
// OR
        // int n = 5, m = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //       System.out.print("* ");
        //     }
        //     System.out.println();
        // }
// _______________________________________________________________
        // 4. Inverted right triangle pattern
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
// _______________________________________________________________
        //  5. Inverted half pyramid
        // int n=5,m=5;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=m;j++){
        //         if (j>=i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
// OR
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int k = 1; k < i; k++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = n; j >= i; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
// _______________________________________________________________
        // 6. Half pyramid using numbers
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// _______________________________________________________________
// 7. Full pyramid using numbers
        // int n = 4; // Number of rows in the upper half (excluding the center)

        // for (int i = 1; i <= 2 * n - 1; i++) {
        //     int num = (i <= n) ? i : (2 * n - i); // Determine the row number for symmetry

        //     // Print leading spaces
        //     for (int j = 1; j <= n - num; j++) {
        //         System.out.print("  ");
        //     }

        //     // Print ascending numbers
        //     for (int j = 1; j <= num; j++) {
        //         System.out.print(j + " ");
        //     }

        //     // Print descending numbers
        //     for (int j = num - 1; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }

        //     System.out.println(); // Move to the next line
        // }
// _______________________________________________________________
// 7. Full pyramid using numbers
  
int n=5;
for(int i=1;i<n;i++){
    for(int j=1;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    for(int j=i-1;j>=1;j--){
        System.out.print(j);
    }
    System.out.println();
}
for (int i = n - 2; i >=1; i--) {
    // Print leading spaces
    for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
    }
    
    // Print increasing numbers
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    
    // Print decreasing numbers
    for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }
    
    System.out.println();
}
    }
}
