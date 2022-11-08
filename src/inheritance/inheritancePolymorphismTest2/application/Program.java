package inheritance.inheritancePolymorphismTest2.application;

import inheritance.inheritancePolymorphismTest.entities.Employee;
import inheritance.inheritancePolymorphismTest2.entities.ImportedProduct;
import inheritance.inheritancePolymorphismTest2.entities.Product;
import inheritance.inheritancePolymorphismTest2.entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        for(int i = 1; i <= numberOfProducts; i++){
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(ch == 'c'){
                list.add(new Product(name,price));
            } else if (ch == 'u') {
                System.out.println("Manufacture date: ");
                Date data = formatter.parse(sc.next());
                list.add(new UsedProduct(name,price,data));
            } else if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
        }

        System.out.println();
        System.out.println("PRODUCTS: ");

        for(Product emp: list){
            System.out.println(emp.getName() + " - $ " + emp.priceTag());
        }
        sc.close();
    }
}
