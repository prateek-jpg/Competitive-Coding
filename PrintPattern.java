public class HelloWorld{
    HelloWorld(){
         System.out.println("Inside Parent class");
    
    }  
    public void printStar(){
        for (int i=0;i<=5;i++){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String []args){
        System.out.println("Starting Execution");
        HelloWorld obj=new HelloWorld();
       obj.printStar();
     }

     
}


