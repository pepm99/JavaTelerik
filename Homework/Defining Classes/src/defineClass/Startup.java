package defineClass;

import defineClass.MobilePhoneDevice;

public class Startup {
	public static void main(String[] args){
		MobilePhoneDevice gsm = new MobilePhoneDevice("Sony Ericcson", "Xperia X8");
		System.out.println(gsm.getManufacturer());
		System.out.println(gsm.toString());
	}
}
