import java.util.* ; 
public class q3{
    
    public static int bs(int arr[], int num, int ind) {
        int low = ind+1 ; 
        int high = arr.length-1 ; 
        int count = 0 ; 
        while(low<=high) {
            int mid = (low+high)/2 ; 
            
            if(arr[mid]<num) {
                low = mid+1 ; 
            }
            
            else {
                count = count + high-mid+1 ; 
                high = mid-1 ; 
            }
        }
        //System.out.println(count) ; 
        return count ; 
    }
    
    public static int first(int arr[], int num, int ind) {
    
    	int low = ind+1 ; 
    	int high = arr.length-1 ; 
    	
    	while(low<=high) {
    		int mid = (low+high)/2 ; 
    		if((mid==ind+1 || arr[mid-1]<num) && arr[mid]==num) {
    			return mid;  
    		}
    		
    		else if(arr[mid] < num) {
    			low = mid+1 ; 
    		}

    		
    		else {
    			high = mid-1 ; 
    		}
    	
    	}
    	
    	return -1 ; 
    
    }
    
    public static int last(int arr[], int num, int ind) {
    
    	int low = ind+1; 
    	int high = arr.length-1 ; 
    	
    	while(low<=high) {
    		int mid = (low+high)/2 ;
    		
    		if((mid==arr.length-1 || arr[mid+1] > num) && arr[mid]==num) {
    			return mid ; 
    		}
    		
    		else if(arr[mid] > num) {
    			high = mid-1 ; 
    		}
    		
    		else {
    			low = mid+1 ; 
    		} 
    		
    	
    	}
    
    	return -1 ; 
    }
    
    public static int bs2(int arr[], int num, int ind) {
    	int p1 = first(arr, num, ind) ; 
    	int p2 = 0 ; 
    	if(p1==-1) {
    	   return 0 ; 
    	}
    	
    	else {
    	  p2 = last(arr, num, ind) ;  
    	}
    	//System.out.println(p1 + " " + p2) ;
    	return p2-p1+1 ; 
    }

     public static void main(String []args){
        Scanner sc1 = new Scanner(System.in) ; 
        int t = sc1.nextInt() ; 
        
        for(int k=0; k<t; k++) {
            int n = sc1.nextInt() ; 
            int l = sc1.nextInt() ; 
            int r = sc1.nextInt() ; 
            
            int arr[] = new int[n] ; 
            for(int i=0; i<n; i++) {
                arr[i] = sc1.nextInt() ; 
            }
            long ans = 0 ; 
            Arrays.sort(arr) ; 
            for(int i=0; i<n; i++) {
                int t1 = bs(arr, l-arr[i], i) ; 
                int t2 = bs(arr, r-arr[i], i) ; 
                int cnt = bs2(arr, r-arr[i], i) ; 
                ans = ans + t1-t2 + cnt ; 
                //System.out.println(t1 + " " + t2 + " " + cnt) ; 

            }
            
            System.out.println(ans) ; 
        }
     }
}
