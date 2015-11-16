
public class driver {

	public static void main(String[] args) {
		String [] newarr = new String[10];
		Hashtable a = new Hashtable();
		String ab ="dwqdwqdqwwdwqdqwdqwdsaddw33dzssa";
		String ab1 ="dwqdwqdqwwdwqdqwdqwdsaddw33dzssavew";
		int r = Math.abs((a.gethashcode(ab)));
		int r1 = Math.abs((a.gethashcode(ab1)));

		System.out.println(r);
		System.out.println( Math.abs((r*5)%10));
		newarr[Math.abs((r*5)%10)]=ab;
		
		if(newarr[Math.abs((r1*5)%10)]!=null)
			newarr[Math.abs((r1*5)%10) + 1]=ab1;
		else
		newarr[Math.abs((r1*5)%10)]=ab1;
		
		for(int i=0;i<newarr.length;i++)
		{
			
			System.out.println(newarr[i]);
			
			
		}

	}

}
