package sumIntegers;

public class sum {
	
	public static int sumOfInt(String n){
		char c='a';
		String r="";
		int sum=0;
		for (int i = 0; i < n.length(); i++) {
			c=n.charAt(i);
			if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'){
				r+=c;
			}
			else if(c==' '){
				sum+=Integer.parseInt(r);
				r="";
			}
			else{
				try {
					throw new Exception("Wrong arguments");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		c=n.charAt(n.length()-1);
		sum+=(int)c-48;
		return sum;
	}
	
}
