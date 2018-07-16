package arrays;
public class MergeTwoSortedArrays {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        int i=0;
        int j=0;
        
        
        while(i<a.size() && j<b.size())
        {
            
            if(a.get(i)<b.get(j))
            {
                i++;    
            }
            else if(b.get(j)<=a.get(i))
            {
                
                a.add(i,b.get(j));
               //System.out.println(a.get(i));
              
                i++;
                j++;
            }
            
            
        }
        while(j<b.size())
            {
                a.add(b.get(j++));
            }
            
            // a.addAll(b);
            // Collections.sort(a);
        
    }
}
