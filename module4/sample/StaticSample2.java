package sef.module4.sample;

public class StaticSample2 {

	// Attributes
	private float distance;
	private static float time;
	private static float speed;

	// Parameterized Constructor
	public StaticSample2(float speed, float time) {
		StaticSample2.speed = speed;
		StaticSample2.time = time;
		this.distance = speed * time; // calculate distance for this instance
	}

	// Default Constructor
	public StaticSample2() {
	}

	// main() method
	public static void main(String[] arg){

		StaticSample2 temp3  = new StaticSample2(50, 4);
		System.out.println(time);
		System.out.println(speed);
		System.out.println(temp3.distance);  // Now this will work
	}

	static {
		System.out.println("Static code blocks are executed only once during the first time that the class is loaded by the JVM");
	}
}
