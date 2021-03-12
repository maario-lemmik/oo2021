import java.io.*;

public class Main {

    

    public static void main(String[] args) throws IOException {
        
        //EXERCISE 1
        Binary b = new Binary();
        System.out.println(b.bin(12345));
        
        System.out.println();
        System.out.println();
        //EXERCISE 2
        Converter c = new Converter();

        System.out.println(c.hexToBin("252"));
        System.out.println(c.hexToOct("252"));
        System.out.println(c.hexToDec("252"));

        System.out.println(c.octToBin(1122));
        System.out.println(c.octToDec(1122));
        System.out.println(c.octToHex(1122));
        
        System.out.println(c.decToBin(594));
        System.out.println(c.decToOct(594));
        System.out.println(c.decToHex(594));

        System.out.println(c.binToOct(1001010010)); //->1122
        System.out.println(c.binToDec(1001010010)); //->594
        System.out.println(c.binToHex(1001010010)); //->252
        
        System.out.println();
        System.out.println();
        //EXERCISE 3
        FileWithA fwa = new FileWithA("text.txt");
    }
}
