/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author AHUJA
 */
public class Trie 
{
    private class Node{
        char data;
        
        
        HashMap<Character, Node> hm;
        boolean isTerminal;
        
        Node(char data,boolean isTerminal)
        {
            this.data=data;
            this.hm=new HashMap<>();
            this.isTerminal=isTerminal;
        }
        
        
    }
    
    
    private int numWords;
    private Node root;
    
    Trie()
    {
        this.root=new Node('\0',false);
        this.numWords=0;
    
    }
    
    public int numWords()
    {
        return this.numWords;
    }
    
    public void addWord(String word)
    {
        this.addWord(this.root,word);
            
    }
    private void addWord(Node parent,String word)
    {
        
        //base case
        if(word.length()==0)
        {
        
            if(parent.isTerminal)
            {
                //word already exists
                //do nothing
            }else
            {
                parent.isTerminal=true;
                numWords++;
            }
            
           return;
        }
        
        //extract firt char
        char cc=word.charAt(0);
        //rest of the word
        String ros=word.substring(1);
        
        //check that node in hashmap of parent
        Node child=parent.hm.get(cc);
        
        //not present then add
        if(child==null)
        {
            child=new Node(cc,false);
            
            //add this node to hashmap of parent
            parent.hm.put(cc, child);
            
        }
        
        //do this recursively for current child 
        // ab wohi child age bhejega ros to add
        this.addWord(child, ros); 
        
    }
    
    public void display()
    {
        this.display(this.root,"");
    }
    private void display(Node node,String osf)
    {
        if(node.isTerminal)
        {
            String ss=osf.substring(1)+node.data;
            System.out.println(ss);
            
        }
        
        
        Set<Map.Entry<Character,Node> > entries=node.hm.entrySet();
        for(Map.Entry<Character,Node> entry:entries)
        {
            this.display(entry.getValue(), osf+node.data);
        }
        
    }
    
    public boolean search(String word)
    {
        return this.search(this.root,word);
    }
    
    private boolean search(Node parent,String word)
    {
        if(word.length()==0)
        {
            if(parent.isTerminal)
            {
                return true;
            }else
                return false;
        }
        char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.hm.get(cc);
        
        //not present then add
        if(child==null)
        {
            return false;
        }
        return this.search(child, ros);
        
        
    }
    
    public void remove(String word)
    {
        this.remove(this.root,word);
    }
    
    private void remove(Node parent,String word)
    {
        if(word.length()==0)
        {
            if(parent.isTerminal)
            {
                parent.isTerminal=false;
                numWords--;
            }else
            {
                //word is par to some other word
            }
            return;
        }
        
         char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.hm.get(cc);
        
        //not present then add
        if(child==null)
        {
            return ;
        }
        
        this.remove(child, ros);
        
        //remove the word
        if(!child.isTerminal && child.hm.size()==0)
            parent.hm.remove(cc);
    }
    
}
