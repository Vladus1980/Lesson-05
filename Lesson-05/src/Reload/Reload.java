package Reload;

public class Reload {
	
	int a;
	int b;
	int c;
	
	public Reload(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Reload(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}

}
