/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

/**
 *
 * @author AHUJA
 */
public class Client
{
    public static void main(String[] args) {
        Trie t=new Trie();
        t.addWord("arts");
        t.addWord("art");
        t.addWord("bug");
        t.addWord("boy");
        t.addWord("sea");
        t.addWord("seen");
        t.addWord("see");
        t.addWord("amit");
        t.display();
        System.out.println(t.search("arts"));
        System.out.println(t.search("hasds"));
        
        System.out.println("*******************");
        t.remove("art");
        t.remove("arts");
        t.display();
        
    }
    
}
