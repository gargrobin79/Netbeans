package StackDemo;

public class Stack 
{
    
    int top=0;
    int capacity=10;
    int stack[]=new int[capacity];
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("stack full");
        }
        else
        stack[top++]=data;
            
    }
    
//    public void expand()
//    {
//        int size=this.size();
//        int newStack[]=new int[capacity*2];
//        System.arraycopy(stack, 0, newStack, 0, size);
//        stack=newStack;
//        capacity*=2;
//    }
    public int pop()
    {
        if(isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        int data;
        data=stack[top-1];
        top--;
        stack[top]=-1;
        return data;
    }
    public int size()
    {
        return top;
    }
    public boolean isFull()
    {
        if(top==10)
            return true;
        else
            return false;
    }
    
     public boolean isEmpty()
    {
        if(top==0)
            return true;
        else
            return false;
    }
    public int peek()
    {
        return stack[top-1];
    }
    
    public void show()
    {
        if(isEmpty())
            System.out.println("empty");
        for(int i=top-1;i>=0;i--)
            System.out.print(stack[i]+" ");
    }
    
    
}
