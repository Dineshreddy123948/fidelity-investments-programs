class shape{
	void area() {
		System.out.println("Calculating area of shape");
	}
}
class rectangle extends shape{
	int length, breadth;
	
	rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	void area() {
		System.out.println("Area of rectangle:" + (length * breadth));
	}
}
class triangle extends shape {
	int base, height;
	
	triangle(int b, int h){
		base = b;
		height = h;
	}
	void area() {
		System.out.println("Area of triangle:" + (0.5 * base * height));
	}
}
class square extends shape{
	int side;
	square(int s) {
		side = s;
	}
	void area() {
		System.out.println("Area of square:" + (side * side));
	}
}
class rhombus extends shape{
	int d1, d2;
	rhombus(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	void area() {
		System.out.println("Area of rhombus:"+(0.5 * d1 * d2));
	}
}
public class dymain {
	public static void main(String[] args) {
		shape s;
		s = new rectangle(10, 5);
		s.area();
		s = new triangle(8, 4);
		s.area();
		s = new square(6);
		s.area();
		s = new rhombus(5, 7);
		s.area();
	}
}
