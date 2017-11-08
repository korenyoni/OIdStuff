import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class AlexsCode
{
    private static final String OPEN = "([{";
    private static final String CLOSE = ")]}";
    private static Stack<Character> precedenceOps;

    public static void main(String[] args)
    {
        PrintStream output = System.out;
        output.println("Enter expression:");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        input.close();
        boolean overlapping = false;
        boolean imbalanced = false;

        precedenceOps=new Stack<Character>();
        String result = "null";
        for (int i = 0; i < expression.length(); i++)
        {
            //Gets character at index
            char c = expression.charAt(i);

            //Adds c to Stack if c is part of OPEN
            if(OPEN.indexOf(c)>=0)
            {
            	System.out.println(c +"push");
                precedenceOps.push(c);
            }

            //Checks if c is part of CLOSE
            if(CLOSE.indexOf(c)>=0)
            {   
                //If the Stack is not empty than we proceed
                if(!precedenceOps.isEmpty())
                {
                    //Remove first value of the Stack which is an open bracket
                    char remove = precedenceOps.pop();
                    System.out.println(remove+"pop");
                    //Find at which index it is at open
                    int indexRemove = OPEN.indexOf(remove);
                    //Finding the CLOSE character at the same index as OPEN [e.g. index 0 is "(" for OPEN and ")" for CLOSE]
                    char remove2 = CLOSE.charAt(indexRemove);

                    //Check if c (current bracket) is the same as remove2
                    //If not the same than it's an overlap
                    //Boolean used to store value without breaking out of the loop
                    if(remove2!=c)
                    {
                        overlapping = true;
                    }

                }
                // If the Stack is empty than it is imbalanced {e.g. (a+(b-[c/d]) }
                else
                {
                    imbalanced = true;
                }
            }
        }   

        if(overlapping==true)
        {
            result = "Overlapping";
        }

        else
        {

            //Checks if it's not empty or there aren't enough brackets
            if (!precedenceOps.isEmpty()||imbalanced==true)
            {
                result = "Imbalanced";
            }

            //Checks if Stack is empty and every bracket has a pair
            if(precedenceOps.empty() && imbalanced==false)
            {
                result = "Balanced";
            }
        }
        output.println(result);


    }
}