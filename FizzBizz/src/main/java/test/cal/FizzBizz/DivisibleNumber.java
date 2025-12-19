package test.cal.FizzBizz;

public class DivisibleNumber {

    static String checkNumber(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBizz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Bizz";
        }
        return String.valueOf(num);
    }
}
