class Solution {
    int binarysearch(int arr[], int n, int k) {
        
        int l= 0, r = n-1, mid;
        
        mid= (l+r)/2;
        
        // while(l<=mid){
        while(l<= r){
            if(arr[mid] == k)
                return mid;
            else if(arr[mid]< k)
                l = mid +1;
            else
                r = mid -1;
                
            mid= (l+r)/2;
        }
        
        return -1;
        
       // return bsearch( arr,  l,  r,  k,n);
    }
 /*  
    int bsearch(int arr[], int l, int r, int k, int n) {
        int mid = (l+r)/2;
        
        if(arr[mid] == k)
            return mid;
        else if(mid == 0 || mid == n-1)
            return -1;
        else if(arr[mid]< k){
            l = mid +1;
            return bsearch( arr,  l,  r,  k,n);
        }
        else{
            r = mid -1;
            return bsearch( arr,  l,  r,  k,n);
        }
            
    }
    */
}