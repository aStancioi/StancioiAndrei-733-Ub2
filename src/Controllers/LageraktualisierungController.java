package Controllers;

import Repositories.LageraktualisierungRepository;

import java.util.Scanner;

public class LageraktualisierungController {

    private LageraktualisierungRepository lageraktualisierungRepository;

    public LageraktualisierungController(LageraktualisierungRepository lageraktualisierungRepository) {
        this.lageraktualisierungRepository = lageraktualisierungRepository;
    }

    public LageraktualisierungRepository getLageraktualisierungRepository() {
        return lageraktualisierungRepository;
    }

    public void setLageraktualisierungRepository(LageraktualisierungRepository lageraktualisierungRepository) {
        this.lageraktualisierungRepository = lageraktualisierungRepository;
    }

    @Override
    public String toString() {
        return "LageraktualisierungController{" +
                "lageraktualisierungRepository=" + lageraktualisierungRepository +
                '}';
    }

    public void lagerMenu(){
        System.out.println("Type 1 to add a Product");
        System.out.println("Typing any other character will bring you back to the main menu");

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        while ("1".contains(s)) {
            switch (s){
                case "1":
                    System.out.println("Type each member separated by space ()");
                    String[] line = s.split(" ");
                    break;

                default:
                    return;

            }
            s = in.nextLine();
        }

    }

}
