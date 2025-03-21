package _8_java8_features;

public class Demo19 {
    public static void main(String[] args) {
        interface NumberProcessor {
            int add(int number1, int number2);
        }

        //1. traditional way
        class NumberProcessorImpl implements NumberProcessor {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        }
        NumberProcessor numberProcessor = new NumberProcessorImpl();
        System.out.println("traditional way " + numberProcessor.add(100, 200));//300;

        //2. anonymous way
        NumberProcessor anonymous = new NumberProcessor() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println("anonymous way " + anonymous.add(100, 200));//300;


        //3. lambda expression way
        NumberProcessor lambda = (number1, number2) -> number1 + number2;
        System.out.println("lambda way " + lambda.add(100, 200));//300;


        //4. Method reference way
        NumberProcessor ref = Demo19::sumOfTwoNumbers;
        System.out.println("Method reference way " + ref.add(100, 200));//300;

        NumberProcessor ref2 = Integer::sum;
        System.out.println("Method reference way " + ref2.add(100, 200));//300;

    }

    public static int sumOfTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
