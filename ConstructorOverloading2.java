public class HelloWorld{
    HelloWorld(){
         System.out.println("Inside Parent class");
    }
    
    HelloWorld(String userName){
        System.out.println("Constructor overloading is working for user: "+userName);
    }
 
    HelloWorld(int n){
        System.out.println("Passing integer as argument: "+n);
    }
    
    public static void main(String []args){
        System.out.println("Starting Execution");
        HelloWorld obj=new HelloWorld();
        HelloWorld obj1=new HelloWorld("Preeti");
     }

     
}


