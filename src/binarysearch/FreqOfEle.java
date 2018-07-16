public class FreqOfEle {
   
    private int BinarySearch(List<Integer> A,int B,boolean isFirst)
    {
        
        int s=0;
        int e=A.size()-1;
        int result=-1;
        while(s<=e)
        {    
            int mid=(s+e)/2;
        
            if(A.get(mid)==B) 
            {
               result=mid;
               if(isFirst)
               {
                   e=mid-1;
               }
               else
               {
                    s=mid+1;
                  
               }
               
            }
            else if(A.get(mid)<B) 
            {
             s=mid+1;
             
            }
            else if(A.get(mid)>B) 
            {
                e=mid-1;
               
            }
            
        
        }
        return result;
        
    }
    public int findCount(final List<Integer> A, int B) 
    {
       int firstIndex=BinarySearch(A,B,true);
       if(firstIndex==-1)
       {
           
           return 0 ;
       }
       else
       {
            int lastIndex=BinarySearch(A,B,false);    
            return lastIndex-firstIndex+1;
       }
       
        
    }
}
