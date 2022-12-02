import java.util.Scanner;
public class Pets {

        String Sex;
        static String Kind;
        String petName;
        int birthDate;
        String descr;
        Scanner sr = new Scanner(System.in);


        void AddPet() { // idea сама создала
                System.out.println("Введите тип:");
                Kind = sr.nextLine();
                System.out.println("Ваш вид: " + Kind);
                System.out.println("Ввидите пол ");
                Sex = sr.nextLine();
                System.out.println("Ваш пол: " + Sex);
                System.out.println("Введите имя питомца ");
                petName = sr.nextLine();
                System.out.println("Имя питомца: " + petName);
        }

        @Override
        public String toString() {
                return "Имя питомца: " + petName + " Тип: " + Kind + " Пол " + Sex + " / ";
        }

}



