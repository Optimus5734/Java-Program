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
        // code here
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
