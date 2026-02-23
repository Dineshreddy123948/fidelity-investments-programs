class product{
    double getPrice(int id){
        if (id == 1) return 10;
        if (id == 2) return 50;
        return -1;
    }
    double calculateTotal(double price, int qty){
        return price*qty;
    }
    void printProduct(int id){
        System.out.println("ID:" + id);
    }
    void printProduct(int id, String name) {
        System.out.println("ID:" + id + ", Name:" + name);
    }
    void printProduct(int id, String name, double price) {
        System.out.println("ID:" + id +", Name:"+name + ",price:" + price);
    }
}
public class main{
    public static void main(String[] args){
        product p = new product();
        double price = p.getPrice(1);
        System.out.println("Total: " + p.calculateTotal(price, 2));
        p.printProduct(1);
        p.printProduct(2, "Book");
        p.printProduct(1, "Pen", 10);
    }
}
