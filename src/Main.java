import Controllers.LageraktualisierungController;
import Controllers.ProductController;
import Repositories.LageraktualisierungRepository;
import Repositories.ProductRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        LageraktualisierungController lageraktualisierungController = new LageraktualisierungController(new LageraktualisierungRepository());



        System.out.println("Type 1 to manipulate Products");
        System.out.println("Type 2 to manipulate Warehouses");
        System.out.println("Typing any other character to stop the application");

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        while ("12".contains(s)) {
            switch (s){
                case "1":
                    break;

                case "2":
                    lageraktualisierungController.lagerMenu();
                    break;

                default:
                    return;

            }
            s = in.nextLine();
        }

    }
}
