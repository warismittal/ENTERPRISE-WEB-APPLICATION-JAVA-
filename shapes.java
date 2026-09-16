import java.util.Scanner;
class Square{
    int side;
    void set(int s){
        side=s;
    }
    int get_area(){
        return side*side;
    }
    int get_perimeter(){
        return 4*side;
    }

}
public class shapes{
    public static void main(String[] args){
        Square sq=new Square();
        System.out.println("Square of side:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sq.set(5);
        int area=sq.get_area();
        int perimeter=sq.get_perimeter();
        System.out.println("Square of side:"+ n +" Area:"+ area+ " Perimeter:"+ perimeter);
    }
}