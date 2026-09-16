
class rectangle{
    int length;
    int breadth;
    public rectangle(){
        System.out.println("Constructor of rectangle called");
    }
    public rectangle(int l,int b){
        System.out.println(" Para Constructor of rectangle called");
        this.length=l;
        this.breadth=b;
    }
    public void display_area(){
        System.out.println("Area of rectangle "+length*breadth);

    }
}
class cuboid extends rectangle{

    int height;
    public cuboid(){
        System.out.println("Constructor of cuboid called");
    }
    public cuboid(int h){
        super(5,7);
        this.height=h;
    }
    public void display_area(){
        System.out.println("Area of cuboid "+(2*(length*breadth+breadth*height+length*height)));
    }
    public void display_volume(){
        System.out.println("Volume of cuboid "+(length*breadth*height));
    }
}
public class rectangle_cuboid{
    public static void main(String[] args){
        rectangle r1=new rectangle(6,7);
        cuboid c1=new cuboid(5);
        c1.display_area();
        c1.display_volume();
    }
}