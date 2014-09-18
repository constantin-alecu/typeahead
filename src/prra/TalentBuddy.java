package prra;

import java.util.Stack;
class MyClass {

    public static void typeahead(String[] usernames, String[] queries) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        Stack<String> st = new Stack<String>();
        boolean test = false;
        String min = "ZZZZZZZZZZZZZZZZZZZZZZZ";
        for(String qu : queries){
            test = false;
            min = "ZZ";
            for(String name : usernames){
                
                if(name.toLowerCase().startsWith(qu.toLowerCase())){
                    if(min.compareToIgnoreCase(name)>=0)
                        min=name;
                   //System.out.println(name);
                    test = true;
                   
                }            
            }
                            
            if(!test)
                System.out.println("-1"); 
            else
                System.out.println(min);
        }
        
    }
}
