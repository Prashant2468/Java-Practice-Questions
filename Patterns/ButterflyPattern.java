/*
Difinition : Draw a Butterfly pattern

*                 *
* *             * *
* * *         * * *
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * *
* * * *     * * * * 
* * *         * * *
* *             * *
*                 *

*/

class Main {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(((j<=i || j>=n-i+1) && i<=5) || ((j<=n-i+1 || j>=i) && i>5)){
                    System.out.print("*");            
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
