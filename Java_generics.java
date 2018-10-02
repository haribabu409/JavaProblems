/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;

/**
 *
 * @author hpadarth
 */
//generic class
public class Java_generics <T> {

    /**
     * @param args the command line arguments
     */
    
    private T obj1;
    
    public Java_generics(T o)
    {
        obj1 = o;        
    }
    public T getObj()
    {
        return obj1;
    }
    public static void main(String[] args) {
       Java_generics<Integer> i1 = new Java_generics<Integer>(12);
       System.out.println(i1.getObj());
       display(12);
       Java_generics<String> str1 = new Java_generics<String>("My name is Hari");
       System.out.println(str1.getObj());
       display("Hari");
    }
    
    //generic method
    public  static <K> void  display(K obj)
    {
        System.out.println(obj.getClass() + " = "+obj);
    }
}
