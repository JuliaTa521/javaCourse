package lab3.Integer;

public class Integer {
    private int value;

    public Integer() {
        value = 0;
    }

    public Integer(int value) {
        this.value = value;
    }

    public Integer(String s) {

        char[] characters = s.toCharArray();
        int temp = 0;
        int mul = 1;

        for (int i = characters.length - 1; i >= 0; i--) {
            temp += (characters[i] - 48) * mul;
            mul *= 10;
        }
        this.value = temp;
    }

    public boolean compare(Integer first) {
        if (first.value == this.value) {
            return true;
        } else {
            return false;
        }
    }

    public int add(Double d) {
        this.value += d.intValue();
        return this.value;
    }

    public int subtraction(Integer d) {
        this.value -= d.value;
        return this.value;
    }

    public int multiplication(Integer d) {
        this.value *= d.value;
        return this.value;
    }

    public int division(Integer d) {
        this.value /= d.value;
        return this.value;
    }

    public int pow(int exponent) {
        int result = value;
        int temp = value;
        for (int i = 1; i < exponent; i++) {
            result *= temp;
        }
        this.value = result;
        return this.value;
    }

    @Override
    public String toString() {
        return "Integer{" +
                "value=" + value +
                '}';
    }

    public String decimal2hex() {
        String digits = "0123456789ABCDEF";
        if (value <= 0) return "0";
        int base = 16;   // flexible to change in any base under 16
        String hex = "";
        while (value > 0) {
            int digit = value % base;              // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            value = value / base;
        }
        return hex;
    }

    public String decimal28() {
        String digits = "01234567";
        if (this.value <= 8) return "0";
        int base = 8;
        String hex = "";
        while (value > 0) {
            int digit = value % base;
            hex = digits.charAt(digit) + hex;
            value = value / base;
        }
        return hex;
    }
}
