
public class driver {

	public static void main(String[] args) {
		String [] newarr = new String[10];
		Hashtable a = new Hashtable();
		String ab ="dwqdwqdqwwdwqdqwdqwdsaddw33ssa";
		int r = Math.abs((a.gethashcode(ab)));
		System.out.println(r);
		System.out.println( Math.abs((r*5)%10));
		newarr[Math.abs((r*5)%10)]=ab;
		
		
		for(int i=0;i<newarr.length;i++)
		{
			
			System.out.println(newarr[i]);
			
			
		}

	}

}
