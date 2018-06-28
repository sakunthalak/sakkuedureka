

public class AddingDigits {
	
	int Number=150;
	
	void Dsum(){
		int sum=0;
		String n=Integer.toString(Number);
		for(int i=0;i<n.length();i++)
		{
			String Str=String.valueOf(n.charAt(i));
			
			sum +=Integer.parseInt(Str);
		}
		System.out.println("the string"+n);
		System.out.println(sum);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddingDigits a=new AddingDigits();
		a.Dsum();
		

	}

}
