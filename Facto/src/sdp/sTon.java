package sdp;

public class sTon {
	public static void main(String[] args) {
		
		StringBuffer sb;
		long t = System.currentTimeMillis();
		for(int i=1;i<=10000000;i++)
		{
			sb = new StringBuffer();
			sb.append("A");
			sb.append("A");
			sb.append("A");
		}
		long t1 = System.currentTimeMillis();
		System.out.println("StringBuffer "+(t1-t));
		
		
		
		StringBuilder sb1;
		long t2 = System.currentTimeMillis();
		for(int i=1;i<=10000000;i++)
		{
			sb1 = new StringBuilder();
			sb1.append("A");
			sb1.append("A");
			sb1.append("A");
		}
		long t3 = System.currentTimeMillis();
		System.out.println("StringBuilder "+(t3-t2));
		
		
		
		
	}

}
