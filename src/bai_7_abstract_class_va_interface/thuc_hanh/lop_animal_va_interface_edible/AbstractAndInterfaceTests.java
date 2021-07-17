package bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible;

import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Animal;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Chicken;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.animal.Tiger;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Apple;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Fruit;
import bai_7_abstract_class_va_interface.thuc_hanh.lop_animal_va_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

//        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals.makeSound);
//
//        }
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {//instanceof kiểm tra xem Chicken có thuộc animal không. Sau instancerof có thể là class hoặc interface
                Edible edibler = (Chicken) animal;//ép Chicken thành animal
                System.out.println(edibler.howToEat());
            }
        }
//            if (animal instanceof Edible) {//instanceof kiểm tra xem Chicken có thuộc animal không. Sau instancerof có thể là class hoặc interface
//                Edible edibler = (Chicken) animal;//ép Chicken thành animal
//                System.out.println(edibler.howToEat());
//            }


        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
