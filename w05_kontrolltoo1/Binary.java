public class Binary {
    /**
    * Kahendsüsteem
    * Teata, kas sisestatud neljakohaline arv koosneb vaid ühtedest ja nullidest.
    * Kui tingimus on tõene, väljasta selle kahendsüsteemi arvu väärtus kümnendsüsteemis.
    * Võrreldes eelmisega võib sisestatud kahendsüsteemi arv olla kuni kümnekohaline. 
    * Eraldi kuvatase välja, millisele väärtusele iga "üks" selles arvus vastab.  
    */
    
    public boolean bin(int number) {
        int decimal = 0;
        int power = 1;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0 ) {
                number /= 10;
            } else if (lastDigit == 1) {
                System.out.print(lastDigit * power);
                System.out.print(" ");
                decimal += lastDigit * power;
                number /= 10;
            } else {
                return false;
            }
            power *= 2;
        }
        System.out.println("Antud arv on kahendsüsteemis");
        System.out.print(" =>  ");
        System.out.print(decimal);
        System.out.println(" ");
        return true;
    }
}
