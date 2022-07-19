import java.util.ArrayList;

public class Quiz {

    public static void main(String[] args) {
        Zoo sfZoo = new Zoo();

        sfZoo.addAnimal(new Bear());
        sfZoo.addAnimal(new Mouse());

        sfZoo.allTalking();
    }


    interface Animal {
        void talk();
    }

    static class Bear implements Animal {
        public void talk() {
            System.out.println("Growl");
        }
    }

    static class Mouse implements Animal {
        public void talk() {
            System.out.println("Squeak");
        }
    }


    static class Zoo {
        ArrayList<Animal> animals;

        public Zoo() {
            animals = new ArrayList<>();
        }

        public void addAnimal(Animal a) {
            animals.add(a);
        }

        public void allTalking() {
            for (Animal animal : animals) {
                animal.talk();
            }
        }
    }
}
