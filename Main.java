package collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             MyCustomList<String> myList = new MyCustomList<String>();
             
             myList.add("EPAM");
             myList.add("Collections");
             myList.add("Custom");
             myList.add("Placement");
             
             
             System.out.println("My List: "+myList.toString());
             
             
             myList.delete(0);
             
             System.out.println("After Deleting "+myList.toString());

             
            	 
             
	}

}