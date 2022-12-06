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


        void EditPet() {
                System.out.println("Введите имя питомца: ");
                String editPetName = sr.nextLine();
                if (editPetName.length() > 0) {
                    petName = editPetName;
                        System.out.println("Имя изменено");
                } else {
                        System.out.println("Имя не изменено");
                }
                System.out.println("Введите вид: ");
                String editPetKind = sr.nextLine();
                if (editPetName.length() > 0) {
                        Kind = editPetKind;
                } else {
                        System.out.println("Вид не изменен");
                }
                System.out.println("Введите пол: ");
                String editPetSex = sr.nextLine();
                if (editPetName.length() > 0) {
                        Sex = editPetSex;
                } else {
                        System.out.println("Пол не изменен");
                }

        }

        @Override
        public String toString() {
                return "Имя питомца: " + petName + " Тип: " + Kind + " Пол " + Sex + " / ";
        }



}



