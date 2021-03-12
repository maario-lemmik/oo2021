import java.util.HashMap;

public class Converter {

    /**
    * Teisendamine
    * Luua klass, kus oleksid funktsioonid teisendada arv kümnendsüsteemist kahendsüsteemi, kaheksandsüsteemi, kuueteistkümnendsüsteemi
    * Samuti tagasi nendest
    * Omavahel ka nt kümnendsüsteemist kuueteistkümnendsüsteemi, kaheksandsüsteemist kümnendsüsteemi jne (kõik seosed)
    *
    */
    HashMap<Character, Integer> hexSymbols;
    HashMap<Integer, Character> hexNumbers;
    public Converter() {
        hexSymbols = new HashMap<>();
        hexNumbers = new HashMap<>();
        Character[] symbols = {'A', 'B', 'C', 'D', 'E', 'F'};
        int n = 10;

        for (char ch : symbols) {
            hexSymbols.put(ch, n);
            hexNumbers.put(n, ch);
            n++;
        }    

    }

    
    public int binToDec(int bin) {
        int decimal = 0;
        int power = 1;
        while (bin != 0) {
            int lastDigit = bin % 10;
            decimal += lastDigit * power;
            bin /= 10;
            power *= 2;
        }
        return decimal;
    }


    public int octToDec(int oct) {
        int decimal = 0;
        int power = 0;
        while (oct != 0) {
            int lastDigit = oct % 10;
            decimal += lastDigit * Math.pow(8, power);
            oct /= 10;
            power += 1;
        }
        return decimal;
    }
    
    public int hexToDec(String hex) {

        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1 ; i >= 0 ; i--) {
            char symbol = hex.charAt(i);
            if (getHexSymbols().keySet().contains(symbol)) {
                decimal += getHexSymbols().get(symbol) * Math.pow(16, power);

            } else {
                decimal += Character.getNumericValue(symbol) * Math.pow(16, power);
            }
            power++;
        }

        return decimal;
    }

    public StringBuilder decToBin(int dec) {
        StringBuilder binary = new StringBuilder();
        
        while (dec != 1) {
            binary.append(dec % 2);
            dec = Math.floorDiv(dec, 2);
        }
        binary.append(1);

        return binary.reverse();
    }

    public StringBuilder decToOct(int dec) {
        StringBuilder octal = new StringBuilder();
        
        while (dec >= 8) {
            octal.append(dec % 8);
            dec = Math.floorDiv(dec, 8);
        }
        octal.append(dec);

        return octal.reverse();
    }

    public StringBuilder decToHex(int dec) {
        StringBuilder heximal = new StringBuilder();
        
        while (dec >= 16) {
            if (dec % 16 >= 10) {
                heximal.append(getHexNumbers().get(dec % 16));
            } else {
                heximal.append(dec % 16);
            }
            
            dec = Math.floorDiv(dec, 16);
        }

        heximal.append(dec);
        
        return heximal.reverse();
    }

    public StringBuilder binToOct(int bin) {
        int num = binToDec(bin);
        return decToOct(num);
    }
    public StringBuilder binToHex(int bin) {
        int num = binToDec(bin);
        return decToHex(num);
    }
    public StringBuilder octToBin(int oct) {
        int num = octToDec(oct);
        return decToBin(num);
    }
    public StringBuilder octToHex(int oct) {
        int num = octToDec(oct);
        return decToHex(num);
    }
    public StringBuilder hexToBin(String hex) {
        int num = hexToDec(hex);
        return decToBin(num);
    }
    public StringBuilder hexToOct(String hex) {
        int num = hexToDec(hex);
        return decToOct(num);
    }



    public HashMap<Character, Integer> getHexSymbols() {
        return hexSymbols;
    }

    public HashMap<Integer, Character> getHexNumbers() {
        return hexNumbers;
    }
}
