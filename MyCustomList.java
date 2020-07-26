package collections;
import java.util.Arrays;


public class MyCustomList<T>{
	 
	private int sizeOfList=0; 
	 
	 private static final int defaultCapacity = 10;
	 
	 private Object list[];
	 
	 MyCustomList()
	 {
		 list = new Object[defaultCapacity];
	 }
	 
	 public int size()
	 {
		 return this.sizeOfList; 
	 }
	 
	 public void add(T t)
	 {
		 if(sizeOfList ==list.length)
		 {
			 increaseCapacity();
		 }
		 list[sizeOfList++]=t;
	 }
	 @SuppressWarnings("unchecked")
	public T get(int i)
	 { 
		 if(i>=sizeOfList || i<0)
		 {
			 throw new IndexOutOfBoundsException("Index out of bounds at index "+i);
		 }
		 return (T) list[i]; 
	 }
	 
	 @SuppressWarnings("unchecked")
	public T delete(int i)
	 {
		 if(i>=sizeOfList || i<0)
		 {
			 throw new IndexOutOfBoundsException("Index out of bounds at index "+i);
		 }
		
			 Object item = list[i];
			 int remElements = list.length-(i+1);
			 System.arraycopy(list, i+1, list, i, remElements);
			 sizeOfList--;
			 return (T) item;
	 }
	 @Override
	 public String toString()
	 {
		 StringBuffer stringBuffer = new StringBuffer();
		 stringBuffer.append("[");
		 for(int i=0;i<sizeOfList;i++)
		 {
			 stringBuffer.append(list[i].toString());
			 if(i!=sizeOfList-1)
				 stringBuffer.append(",");
			 
		 }
		 stringBuffer.append("]");
		 return stringBuffer.toString();
	 }
	 
	 public void increaseCapacity()
	 {
		 int increasedSize=2*list.length;
		 list = Arrays.copyOf(list,increasedSize);
	 }
	 
}