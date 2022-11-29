import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<Pets>();


        while (true) {
            String st = sr.nextLine();
            if (st.equals("EXIT")) {
                System.out.println("Вы вышли из программы.");
                break;

            } else if (st.equals("LIST")){
                
                System.out.println("No pets found");

            } else if (st.equals("ADD")){
                Pets newPet = new Pets();
                newPet.AddPet(System.in);
                pets.add(newPet);
                System.out.println(newPet.petName + " добавлен в базу");



            }
        }
    }
}
