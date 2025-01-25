package module;

public class testDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {0,4,5,-1,2,1,0};
		int a[]= new int[b.length];
		int x=0;		
		System.out.println(a.length);
		
		for(int i=0;i<b.length;i++)
	      {
			if(b[i]==0)
			{
				x=b[i+1]+b[i+2];
			}
			System.out.println(b[i]);
	      }
	}

}
