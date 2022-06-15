
public class AnotherJavaFile {
	String name = "Michael";
	int age = 23;
	
	public void howOld() {
		System.out.println(name + " is " + age + " years old" );
	}
	
	public void sayHello( String name) {
		System.out.println("Hello " + name);
	}
	
	public int howLongRetirement(int age) {
		System.out.println("You can retire at " + (65-age) + " years");
		return (65-age);
		
	}
	
	public String giveHelloBack() {
		return "Hello";
	}
}
