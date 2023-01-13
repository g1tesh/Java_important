package Imp_Re;

interface first
{
	void hello();
	
	
	
}



 public class INterface_Practice implements first {
	
	public  void hello()
	{
		System.out.println("hello from implemented class");
	}
		
	


	public static void main(String[] args) {
		
			first ip = new INterface_Practice();
			ip.hello();
		
		

	}

}
