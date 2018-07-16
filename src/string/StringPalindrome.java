package string;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHUJA
 */
public class StringPalindrome 
{
    public static boolean isPalindrome(String s)
    {
        char arr[]=s.toLowerCase().toCharArray();
        int i=0;
        int j=s.length()-1;
        
        while(i<=j)
        {
            if(!(arr[i]>='a' && arr[i]<='z') || !(arr[i]>='0' && arr[i]<='9')) 
            {
                i++;
                continue;
            }
            
            if(!(arr[j]>='a' && arr[j]<='z') || !(arr[j]>='0' && arr[j]<='9')) 
            {
                j--;
                continue;
            }
            if((arr[i]!=arr[j]))
                return false;
        }
        
        
        return true;
    }
    public static void main(String[] args) {
        
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
                
    }
    
}
