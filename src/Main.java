import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<Pets>();
        int petNumber;

        while (true) {
            String st = sr.nextLine();
            if (st.equals("EXIT")) {
                System.out.println("Вы вышли из программы.");
                break;

            } else if (st.equals("LIST")){
                int i = 0;
                if(i < pets.size()) {
                    System.out.println(pets);
                    ++i;
                } else{
                    System.out.println("В базе пока еще нет питомцев");
                }


            } else if (st.equals("ADD")){
                Pets newPet = new Pets();
                newPet.AddPet();
                pets.add(newPet);
                petNumber = pets.size();
                System.out.println(newPet.petName + " добавлен в базу под номером " + petNumber);

            } else if (st.startsWith("REMOVE")){
                st = st.replaceAll("\\D+","");
                int removePetNumber = Integer.parseInt (st);
                pets.remove(removePetNumber - 1);
                System.out.println("Питомец номер " + removePetNumber + " удален");

            } else if (st.startsWith("EDIT")){
                st = st.replaceAll("\\D+","");
                int petEdit = Integer.parseInt (st);
                System.out.println(petEdit);

            }


        }
    }
}
