import java.util.*;
class hello_world{
	public static void main(String [] args){
	while(true){
		System.out.println("Hello World");
		try{
		Thread.sleep(60000);
		}
		catch(InterruptedException e){
			System.out.println("Interrupted:" + e.getMessage());
			}
		}
	}
}
