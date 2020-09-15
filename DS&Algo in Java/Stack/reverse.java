/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class stack
{
    int top;
    int size;
    char[] a;
    
    stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }
    
    boolean isEmpty()
    {
        return (top<0);
    }
   boolean push(char x)
    {
        if(top>=size)
        {
        System.out.println("Stack Overflow");
        return false;
        }
        a[++top] = x;
        return true;
    }
    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        char x = a[top--];
        return x;
    }
}

public class Main
{
    public static void reverse(StringBuffer s)
    {
        //create new empty stack with size string length
        int n = s.length();
        stack obj = new stack(n);
        
        //push all the Character to Stack
        int i;
        for(i=0;i<n;i++)
        {
            obj.push(s.charAt(i));
        }
        
        //pop all the element from Stack
        for(i=0;i<n;i++)
        {
            char x = obj.pop();
            s.setCharAt(i,x);
        }
    }
	public static void main(String[] args) {
	  StringBuffer str = new StringBuffer("TanishJain");
	  
	  // call reverse function 
	  reverse(str);
	  
	  System.out.println(str);
	  
	  
	}
}
