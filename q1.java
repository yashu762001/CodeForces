import java.util.* ; 
public class q1{

     public static void main(String []args){
        Scanner sc1 = new Scanner(System.in) ;
        int t = sc1.nextInt() ; 
        
        for(int k=0; k<t; k++) {
            int n = sc1.nextInt() ; 
            int arr[] = new int[n] ; 
            
            for(int i=0; i<n; i++) {
                arr[i] = sc1.nextInt() ; 
            }
            
            int min_ind = -1 ; 
            int max_ind = -1 ; 
            int min = Integer.MAX_VALUE ; 
            int max = Integer.MIN_VALUE ; 
            
            for(int i=0; i<n; i++) {
                if(arr[i] > max) {
                    max = arr[i] ; 
                    max_ind = i ; 
                }
                
                if(arr[i] < min) {
                    min = arr[i] ; 
                    min_ind = i ; 
                }
            }
            
            int ans1 = Math.max(min_ind, max_ind)+1 ; 
            int ans2 = Math.max(n-min_ind, n-max_ind) ; 
            int ans3 = min_ind+1 + n-max_ind ; 
            int ans4 = max_ind+1 + n-min_ind;
            int ans = Math.min(Math.min(ans1,ans2), Math.min(ans3,ans4)) ; 
            
            System.out.println(ans) ; 
            
        }
     }
}
