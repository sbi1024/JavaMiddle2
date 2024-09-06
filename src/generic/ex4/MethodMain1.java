package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        Integer integer = GenericMethod.<Integer>numberMethod(10);
        System.out.println("integer = " + integer);
        Double aDouble = GenericMethod.<Double>numberMethod(10.0);
        System.out.println("aDouble = " + aDouble);

        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        System.out.println("result = " + result);
        Integer integer1 = GenericMethod.numberMethod(10);
        System.out.println("integer = " + integer);
        Double aDouble1 = GenericMethod.numberMethod(10.0);
        System.out.println("aDouble = " + aDouble);
    }
}
