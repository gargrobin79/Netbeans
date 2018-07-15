/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackDemo;

/**
 *
 * @author AHUJA
 */
public class Stack_Demo 
{
     private static void transfer1(Stack a ,Stack b,int n)
    {
        for(int i=0;i<n;i++)
        {
            b.push(a.peek());
            a.pop();
        }
    
    }
    public static void reverseStackUsingOneStack(Stack s,Stack helper)
    {
       
        for(int i=0;i<s.size();i++)
        {
          
            int top=s.peek();
            s.pop();
            System.out.println("size is "+s.size());
            transfer1(s,helper,s.size()-i);
            System.out.println("\nhelper is ");
            helper.show();
                   
            s.push(top);
            transfer1(helper,s,s.size()-i -1);
            System.out.println("s is ");
            s.show();
        }
        
    }
    
    private static void transfer(Stack a ,Stack b)
    {
        while(!a.isEmpty())
        {
            b.push(a.peek());
            a.pop();
        }
    
    }
    public static void reverseStackUsingTwoStacks(Stack s1,Stack s2,Stack s3)
    {
        transfer(s1,s2);
        
        transfer(s2,s3);
        transfer(s3,s1);
        
    }
    public static void main(String[] args) {
        
        
        Stack s1=new Stack();
        s1.push(15);
        s1.push(20);
        s1.push(25);
        s1.push(30);
        s1.push(32);
        s1.push(33);
       // s1.show();

        //System.out.println("");

        //using 2 stacks
        Stack s2=new Stack();
        Stack s3=new Stack();
        reverseStackUsingTwoStacks(s1,s2,s3);
        //s1.show();
        System.out.println("************************");
//        //using one stack
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       // s.show();
        System.out.println("");
        
        Stack helper=new Stack();
        reverseStackUsingOneStack(s, helper);
        //s.show();
        
        
    }
    
}
