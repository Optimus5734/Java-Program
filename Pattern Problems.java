#Must do Pattern Problems before starting DSA

1. class Solution1 {

    void printSquare(int n) {
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ;j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
2.class Solution2 {

    void printTriangle(int n) {
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<=i ; j++){
                System.out.print("* ");
        }
        System.out.println();
        }
        
    }
}
3.class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}

4.class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}

5.class Solution5 {

    void printTriangle(int n) {
        // code here
        for(int i = n; i>0 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print("* ");
        }
        System.out.println();
        }
    }
}
6.class Solution6 {

    void printTriangle(int n) {
        // code here
        for(int i = n; i>0 ; i--){
            for(int j = 1; j<=i ; j++){
                System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}
7.class Solution7 {

    void printTriangle(int n) {
        // code here
        for(int i  = 0 ; i < (2*n) - 1  ; i++){
            if(i < n){
                for(int j = 0 ; j <= i ; j++)
                System.out.print("* ");
            }
            else{
                for(int j = n-1 ; j >i-n ; j--)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
8.class Solution8 {

    void printTriangle(int n) {
       
        for(int i = 0; i<=n ; i++){
         int m = n-i;
           for(int j = 0; j< i;j++  ){
            System.out.print(" ");
        }
            for(int j = 0; j < m ; j++){
                System.out.print("*");
        }
      
        for(int j = 1; j<n-i;j++  ){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

9.
class Solution9 {

    void printTriangle(int n) {
        
        for(int i = 1 ; i <= n ; i++){
            for(int j = i ; j >= 1 ; j-- ){
                    System.out.print(j%2+" ");
                    
                }
                System.out.println();
                
            }
        }
    }

10.
    class Solution10 {

    void printTriangle(int n) {
     
        for(int i = 0 ; i < n ; i++){
                char value = 'A';
            for(int j = 0 ; j <=i;j++){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
11.
class Solution11 {

    void printTriangle(int n) {
        // code here
        for(int i = n ; i > 0 ; i--){
                char value = 'A';
            for(int j = i ; j >0;j--){
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
12.
   class Solution {

    void printTriangle(int n) {
        // code here
             for(int i = 1 ; i <= n ; i++){
                  for(int j = 0 ; j <n-i;j++)
                    System.out.print(" ");
                    
                    
                  char value = 'A';
                  
                  for(int j = 1 ; j<=i ; j++){
                        System.out.print(value);
                        value++;
                  }
                  
                  value--;
                  for(int j = 1 ; j<i ; j++){
                        value--;
                        System.out.print(value);
                  }
            System.out.println();
        }
    }
}
13. class Solution13 {

    void printTriangle(int n) {
        // code here
        for(int i = 0 ; i<n ; i ++){
        int value=65;
        value = value+n-1;
        char pat = (char)value;
        for(int j = 0 ; j <= i ; j++){
            System.out.print(pat+" ");
            pat--;
        }
        System.out.println();
    }
        
    }
}
14.
class Solution14 {

    void printTriangle(int n) {
        // code here
        for(int i = 0 ; i<n ; i++){
            for(int j = n ; j >  i ; j--)
                System.out.print("*");
            
            for(int j = 0 ; j<i ; j++)
               System.out.print("  ");
               
            for(int j = n ; j >  i ; j--)
                System.out.print("*");
            
            System.out.println();
        }
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j <=  i ; j++)
                System.out.print("*");
            
            for(int j = n-1 ; j>i ; j--)
               System.out.print("  ");
               
            for(int j = 0 ; j <=  i ; j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}

15.class Solution15 {

    void printTriangle(int n) {
        // code here
        for(int i = 0 ; i<n ; i++){
            
            for(int j = 0 ; j <=  i ; j++)
                System.out.print("*");
                
            
            for(int j = n-1 ; j>i ; j--)
               System.out.print("  ");
               
            for(int j = 0 ; j <=  i ; j++)
                System.out.print("*");
                
            
            
            System.out.println();
        }
        
        for(int i = 0 ; i<n-1 ; i++){
            
            for(int j = n-1 ; j >  i ; j--)
                System.out.print("*");
                
            for(int j = 0 ; j<=i ; j++)
               System.out.print("  ");
               
            for(int j = n-1 ; j >  i ; j--)
                System.out.print("*");
            
            System.out.println();
        }
    }
}

16.class Solution16 {

    void printSquare(int n) {
        // code here
        for(int i = 0 ; i < n ; i ++){
            if(i==0 || i==n-1){
                for(int j = 0 ; j<n ; j++)
                   System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int k = 0 ; k<n-2 ; k++)
                    System.out.print(" ");
                System.out.print("*");   
            }
             
              System.out.println();
        }
            
        
    }
}
