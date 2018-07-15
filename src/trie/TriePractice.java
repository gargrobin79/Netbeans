package trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TriePractice
{
    private class Node{
            Character data;
            boolean isTerminal;
            HashMap<Character,Node> hm;
    
            public Node(Character data,boolean isTerminal)
            {
                this.data=data;
                this.isTerminal=isTerminal;
                hm=new HashMap<>();
                
            }
    
    }
    
    
    private int numWords;
    private Node root;
    
    public TriePractice()
    {
        this.numWords=0;
        this.root=new Node('\0',false);
    }
    
    public int Words()
    {
        return this.numWords;
    }
    
    public void addWord(String str)
    {
        this.addWord(this.root, str);
    }
    private void addWord(Node parent,String str)
    {
        if(str.length()==0)
        {
            if(parent.isTerminal)
            {
                //d
                
            }
            else
            {
                parent.isTerminal=true;
                numWords++;
            
            }
            return;
        
        }
        
        Character cc=str.charAt(0);
        String ros=str.substring(1);
        
        Node child=parent.hm.get(cc);
        if(child==null)
        {
             child=new Node(cc,false);
             parent.hm.put(cc, child);
        }
        
        this.addWord(child, ros);
            
    }
    
    public void display()
    {
       display(this.root,"");
    }
    
    private void display(Node node,String sof)
    {
        if(node.isTerminal)
        {
            String ss=sof.substring(1)+node.data;
            System.out.println(ss);
        }
        
        Set<Map.Entry<Character,Node> > entries=node.hm.entrySet();
        for(Map.Entry<Character,Node> entry:entries)
        {
            this.display(entry.getValue(), sof+node.data);
        }
    
    }
    
    
    public boolean search(String word)
    {
        return this.search(this.root,word);
    }
    
    private boolean search(Node node,String str)
    {
        
        if(str.length()==0)
        {
            if(node.isTerminal)
            {
                return true;
            }
            else
                return false;
        
        
        }
        
        Character cc=str.charAt(0);
        String ros=str.substring(1);
        
        Node child=node.hm.get(cc);
        if(child==null)
        {
            return false;
        }
        
      
        return this.search(child, ros);
        
    }
    
    
    
}
