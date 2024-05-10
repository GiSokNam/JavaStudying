package mid2.generic.ex3;


import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

        // 제네릭에 Dog,Cat 말고 Integer,Object 등 모든 타입이 가능한 문제가 발생

    }
}
