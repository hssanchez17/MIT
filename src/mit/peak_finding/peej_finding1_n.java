/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mit.peak_finding;

/**
 *
 * @author pc
 */
public class peej_finding1_n {
    
    
     static int findPeak(int arr[], int n){
     //first or last element is peak element 
        if(arr[0] > arr[1]) 
          return 0; 
        if(arr[n-1] > arr[n-2]) 
          return n-1; 
  
    //check for every other element 
        for(int i=1 ; i < n-1 ; i++) { 
          //check if the neighbours are smaller 
          if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) return i; 
        } 
        return -1;
     }
    
    
    
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 8};  
        int n=arr.length;
        
        System.out.println(findPeak(arr,n));
    }
    
}
    