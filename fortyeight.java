package fiftyprog.java;
class Box {
    double width, height, depth;

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor
    Box() {
        width = height = depth = 0;
    }

    // Constructor with one parameter (for cube)
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
public class fortyeight {

	public static void main(String[] args)
	{
		 Box box1 = new Box(10, 20, 15);  
		 Box box2 = new Box();            
		 Box cube = new Box(7);           
         System.out.println("Volume of box1: " + box1.volume());
		 System.out.println("Volume of box2: " + box2.volume());
		 System.out.println("Volume of cube: " + cube.volume());		
	}

}
