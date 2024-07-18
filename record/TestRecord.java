public class TestRecord {

public static void main(String[] args){

Rectangle rectangle = new Rectangle(9,10);
System.out.println("Rectangle length() "+rectangle.length());
System.out.println("Rectangle length() "+rectangle.width());

Rectangle rectangle1 = new Rectangle(3,5);
Rectangle rectangle2 = new Rectangle(3,5);
System.out.println(rectangle1.equals(rectangle2));
System.out.println(rectangle1.hashCode() +" "+rectangle2.hashCode());
}

}