package mid2.generic.ex3;


import mid2.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // 제네릭에 Dog,Cat 말고 Integer,Object 등 모든 타입이 가능한 문제 해결
    // 제네릭에 타입 매개변수 상한을 사용해서 타입 안정성을 지키면서 상위타입의 원하는 기능까지 사용할 수 있는 코드 재사용까지 고려됨
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
