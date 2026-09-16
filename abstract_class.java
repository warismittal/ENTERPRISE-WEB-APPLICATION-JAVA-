/* Abstract class:if a class contains abstract methods ,then the class itself must be declared abstract.
*abstract in english means existing only as an idea, not as a physical thing.
*abstract method: declared without an implementation.
* abstract class cant have objects, just a way for other classes.
* we can also assign reference of an abstract class to the object of a concrete subclass.
 */
abstract class polynomial{ // standard class for other classes to be made
    public polynomial(){
        System.out.println("Constructor of polynomial called");
    }
    abstract public void display_area();
}

class S_quare extends polynomial{
    int side;
    public S_quare(){
        System.out.println("Constructor of square called");
    }

    public S_quare(int s) {
        this.side = s;
        System.out.println("Constructor of Square called");
    }

    @Override
    public void display_area(){
        System.out.println("Area of square: " + (side*side));
    }
}

class triangle extends polynomial{

    int base;
    int height;
    public triangle(){
        System.out.println("Constructor of triangle called");
    }
    public triangle(int b, int h) {
        this.base = b;
        this.height = h;
        System.out.println("Constructor of Triangle called");
    }

    @Override
    public void display_area(){
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }

}
public class abstract_class{
    public static void main(String[] args){
     // polynomial p=new polynomial(); // abstract class
        S_quare sq=new S_quare(2);
        sq.display_area();
        triangle tri=new triangle(3,4);
        tri.display_area();

    }
}