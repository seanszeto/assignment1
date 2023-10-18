public class Animal {
    public void eat(){
        System.out.println("The animal is eating.");
    }

    public void sleep(){
        System.out.println("The animal is sleeping.");
    }

    Animal snowbol = new Animal();

    public class Dog extends Animal {
        @Override public void eat() {
            System.out.println("The dog is eating.");
        }
        @Override public void sleep() {
            System.out.println("The dog is sleeping.");
        }

        Dog snowbol = new Dog();
    }

    public class Cat extends Animal {

        Cat fatCat = new Cat();
        @Override public void eat(){
            System.out.println("The cat is eating.");
        }
        @Override public void sleep() {
            System.out.println("The cat is sleeping.");
        }
    }
}
