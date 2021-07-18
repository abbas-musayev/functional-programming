package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and produced 1 result

        System.out.println(increment(1)); // result : 2

        Integer increment = incrementByOneFunction.apply(1);
        System.out.println(increment); // result : 2

        Integer multiply = multiplyByOneFunction.apply(increment); // result : 20

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyByOneFunction);

        addBy1AndThenMultiplyBy10.apply(2); // result : 20


        // BiFunction takes 2 argument and produced 1 result

        incrementByOneAndMultiply(1,2); // result : 3

        Integer incrementBiFucnrion = incrementByOneAndMultiplyBiFunction.apply(1, 2);// result : 3
        System.out.println(incrementBiFucnrion);

        BiFunction<Integer, Integer, Integer> biFunction =
                incrementByOneAndMultiplyBiFunction.andThen(incrementByOneFunction);

        System.out.println("BiFunction"+biFunction.apply(5, 6)); // result : 12

    }

    static Function<Integer, Integer> incrementByOneFunction = index -> index + 1;

    static Function<Integer, Integer> multiplyByOneFunction = index -> index * 10;

    static int increment(int index){
        return index+1;
    }


    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = (number1,number2) -> number1+number2;


    static int incrementByOneAndMultiply(int number1, int number2){
        return number1 + number2;
    }



}
