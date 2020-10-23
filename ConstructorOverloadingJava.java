public class HelloWorld{
    HelloWorld(){
         System.out.println("Inside Parent class");
    }
    
    HelloWorld(String userName){
        System.out.println("Constructor overloading is working for user: "+userName);
    }

    
    public static void main(String []args){
        System.out.println("Starting Execution");
        HelloWorld obj=new HelloWorld();
        HelloWorld obj1=new HelloWorld("Preeti");
     }

     
}


