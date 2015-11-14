
public class Hashtable {
	
	public node head;
	public node position;
	
	public class node
	{
		
		public node link;
		public node prev;
		public int hashcode;
		public boolean available;
		
		
		public node(node link,node prev,int hashcode)
		{
			
			
			
			this.link=link;
			this.prev=prev;
			this.hashcode=hashcode;
			available=false;
			
			
		}
		
		
		public int gethashcode(String a)
		{
			
			
			return a.hashCode();
			
		}
		
		
		
	}
	
	
	
	
	public void setEmptyMarkerScheme(char a)
	{
		
		
		
	}
	
	public void setCollisionHandling(char a)
	{
		
		
		
	}
	
	
	
	
	

}
