import java.util.* ; 
public class q2{

     public static void main(String []args){
        Scanner sc1 = new Scanner(System.in) ;
        int t = sc1.nextInt() ; 
        
        for(int k=0; k<t; k++) {
            int n = sc1.nextInt() ; 
            int arr[] = new int[n] ; 
            
            for(int i=0; i<n; i++) {
                arr[i] = sc1.nextInt() ; 
            }
            
            int sum = 0 ; 
            
            for(int i=0; i<n; i++) {
                sum = sum + arr[i] ; 
            }
            
            if(sum%n!=0) {
                System.out.println("-1") ; 
            }
            
            else {
            
                sum = sum/n ; 
                
                int res = 0 ; 
                int extra = 0 ; 
                for(int i=0; i<n; i++) {
                    if(arr[i]==sum) {
                        continue ; 
                    }
                    
                    else if(arr[i] > sum) {
                        res++ ; 
                    }
                    
                }
                
                System.out.println(res) ; 
            
            }
            
        }
     }
}
