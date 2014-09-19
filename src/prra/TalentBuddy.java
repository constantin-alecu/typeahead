package prra;
/**
 * 
 * @author alexandru.alecu
 *
 */
class MyClass {

    public static void typeahead(String[] usernames, String[] queries) {
        // Write your code here
        // To print results to the standard output please use System.out.println
        // Example: System.out.println("Hello world!");
        boolean test = false;
        String min = "ZZZZZZZZZZZZZZZZZZZZZZZ";
        for(String qu : queries){
            test = false;
            min = "zzzzz" ;
            String queriesToLower = qu.toLowerCase();
            for(String name : usernames){
                String nameToLower = name.toLowerCase();
                if(nameToLower.toLowerCase().startsWith(queriesToLower)){
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
