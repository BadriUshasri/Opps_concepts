package com.constructor;

public class Constructor {

	
	
      private String name;
	private int id;


	Constructor() {
	}
    {
   	 System.out.println("enter any value" );
//   	 System.out.println("employee id:" +id);
//   	 System.out.println("employee name:" +name);
//    	 
     }
			
		
	private void Constructor(int id,String name) {
			// TODO Auto-generated method stub
			
		System.out.println("Employee id: " +id);
		System.out.println("Employee name:" +name);
		
				
		}
		public static void main(String[] args) {
			Constructor Employee= new Constructor();
    			Employee.id=302;
                 Employee.name="Teena";
			
		Employee.Constructor(2, "Reena");
			
		}


//		private void Constructor(int i, String string) {
//			// TODO Auto-generated method stub
//			
		}
	

     


