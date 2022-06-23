package org.phone;

public class PhoneInfo {
	private void phone() {
		System.out.println("phone");	
		}
	private void phone(String name) {
		System.out.println("phone Name:"+name);
	}
	private void phone(long imei,long phno) {
System.out.println("IMEI:"+imei);
System.out.println("phone number:"+phno);
	}
	private void phone(String frontcamera,String backcamera ) {
System.out.println("Back camera:"+backcamera);
System.out.println("Front camera:"+frontcamera);
	}
	private void phone(int internal,String ram) {
System.out.println("internal storage:"+internal);
System.out.println("ram:"+ram);
	}
	private void phone(String android,int version) {
System.out.println("OS Name: "+android);
System.out.println("Android version:"+version);
	}
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phone();
		p.phone("vivo");
		p.phone(194010202020204l, 9941108249l);
		p.phone("16mp", "32mp");
		p.phone(128,"6GB");
		p.phone("android", 11);

	}
}
