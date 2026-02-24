abstract class Product {
    int id;
    String name;
    int count;
    String category;
    int price;
    
    Product(int id, String name, int count, String category) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.category = category;
    }
    abstract void display();
}
class A extends Product{
    A(int id, String name, int count, String category){
        super(id, name, count, category);
        this.price = 30;
    }
    void display() {
        int totalPrice = count * price;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("-------------------------");
    }
}
class B extends Product{
    B(int id, String name, int count, String category){
        super(id, name, count, category);
        this.price = 10;
    }
    void display() {
        int totalPrice = count * price;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("-------------------------");
    }
}
class C extends Product{
    C(int id, String name, int count, String category){
        super(id, name, count, category);
        this.price = 20;
    }
    void display() {
        int totalPrice = count * price;
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("-------------------------");
    }
}
public class hero{
    public static void main(String[] args){
        Product p1 = new A(78, "Butter", 30, "Milk");
        Product p2 = new A(88, "curd", 10, "Dairy");
        Product p3 = new A(68, "chocolate", 5, "Choco");
        
        p1.display();
        p2.display();
        p3.display();
    }
    
}
