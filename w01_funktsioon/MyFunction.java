public class MyFunction {
    
    public static StringBuilder decimalToBinary(int num) {
        // function will convert a given decimal number to its binary number
        StringBuilder binary = new StringBuilder();
        
        // divide given number by 2 until number equals to 1
        while (num != 1) {
            if (num % 2 == 0) {
                binary.append(0);
            } else {
                binary.append(1);
            }
            num = Math.floorDiv(num, 2);
        }
        binary.append(1);

        return binary.reverse();

    }

    public static double binaryToDecimal(String binary) {
        // function will convert a given binary number to its decimal number

        StringBuilder bin = new StringBuilder(binary);

        // flip the binary number
        bin.reverse();

        double decimal = 0;
        double power = 0;

        // iterate through flipped binary number
        for (int i = 0; i < bin.length(); i++) {
            double value = Math.pow(2.0, power);

            if (bin.charAt(i) == '1') {
                decimal += value;
            }
            power += 1;
        }
        return decimal;
    }

    public static void main(String[] args) {
        //call some functions
        System.out.println(decimalToBinary(201));
        System.out.println(binaryToDecimal("101100101100101"));
    }
}