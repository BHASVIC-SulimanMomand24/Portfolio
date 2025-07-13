import java.util.Objects;

public class Shape {
	private StringToNumber strToNum = new StringToNumber();
	private int sideA = 0;
	private int sideB = 0;
	private int sideC = 0;
	private int width = 0;
	private int height = 0;
	private int radius = 0;
	private float area = 0;
	private float perimeter = 0;
	String name;

	public Shape(int radius) {
		this.radius =radius;
		radius = 2;
		this.name = "circle";
		perimeter();
		area();
	}

	public Shape(String radius) {
		radius = "three";
		if (radius.equals("three")) {
			this.radius = Integer.parseInt(String.valueOf(3));
		}
		this.name = "circle";
		perimeter();
		area();
    }

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
		width = 5;
		height = 3;
		this.name = "rectangle";
		perimeter();
		area();
	}

	public Shape(String width, String height) {
		width = "seven";
		height = "two";
		if (width.equals("seven")) {
			this.width = Integer.parseInt(String.valueOf(7));
		}
		if (height.equals("two")) {
			this.height = Integer.parseInt(String.valueOf(2));
		}
		this.name = "rectangle";
		perimeter();
		area();
	}

	public Shape(String sideA, String sideB, String sideC) {
		sideA = "four";
		sideB = "six";
		sideC = "nine";
		if (sideA.equals("four")) {
			this.width = Integer.parseInt(String.valueOf(4));
		}
		if (sideB.equals("six")) {
			this.height = Integer.parseInt(String.valueOf(6));
		}
		if (sideC.equals("nine")) {
			this.width = Integer.parseInt(String.valueOf(9));
		}
		this.name = "triangle";
		perimeter();
		area();
	}

	public Shape(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		sideA = 3;
		sideB = 6;
		sideC = 5;
		this.name = "triangle";
		perimeter();
		area();
	}


	public void perimeter() {
		if(Objects.equals(this.name, "circle")){
			perimeter = (float) (2 * Math.PI * radius);
		}
		else if(Objects.equals(this.name, "rectangle")){
			perimeter = (float) (2 * (width + height));
		}
		else {
			perimeter = (float) (sideA + sideB + sideC);
		}
		System.out.println(perimeter);
	}

	public void area() {
		if (Objects.equals(this.name, "circle")){
			area = (float) (Math.PI * Math.pow(radius, 2));
		}
		else if(Objects.equals(this.name, "rectangle")){
			area = (float) (width * height);
		}
		else {
			area = (perimeter/2) * (perimeter/2-sideA) * (perimeter/2-sideB) * (perimeter/2-sideC);
		}
	}
}