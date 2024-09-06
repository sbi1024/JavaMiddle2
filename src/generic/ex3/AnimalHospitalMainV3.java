package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // dogHospital.set(cat); // 디른 타입 입력시, 컴파일 오류 발생

        dogHospital.set(dog);
        Dog animal = dogHospital.bigger(new Dog("멍멈이2", 200));
        System.out.println("biggerDog = " + animal);
    }
}
