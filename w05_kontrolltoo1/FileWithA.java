import java.io.*;
import java.util.HashMap;

public class FileWithA {

    /**
    * A-tähed tekstis        
    * Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
    * Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu
    * Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede arv sõnas ning 
    * veergudeks a-tähtede arv. Lahtris näidatakse, mitu vastavat sõna oli tekstis.
    */
    BufferedReader br;
    String filename;

    public FileWithA(String filename) throws IOException {
        this.filename = filename;
        File file = new File(filename);
        br = new BufferedReader(new FileReader(file));
        countA(br);
        close();
    }

    public int countA(BufferedReader br) throws IOException {
        String r;
        int countA = 0;
        int charCount = 0;
        HashMap<String, Integer> aOccurrence = new HashMap<>();
        HashMap<String, Integer> wordOccurrence = new HashMap<>();


        while((r = br.readLine()) != null)
        {
            for (String word : r.split("\\s+")) {
                int wordACount = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                        countA++;
                        wordACount++;
                    }
                    charCount++;
                }
                wordOccurrence.put(word, 1 + wordOccurrence.getOrDefault(word, 0));
                aOccurrence.put(word, wordACount);
            }
        }

        // Sõnades keskmiselt
        double averageAInWord = aOccurrence.size() / (double) countA;
        // Suhtarvuna tähtede üldarvuna
        double averageInAllChars = charCount / (double) countA;

        System.out.println(averageAInWord);
        System.out.println(averageInAllChars);
        constructTable(aOccurrence);
        br.close();
        return countA;
    }

    public static void constructTable(HashMap<String, Integer> hm) {
        for (String s : hm.keySet()) {
            System.out.print(s);
            System.out.print("\t : \t");
            System.out.print(s.length());
            System.out.print(" | ");
            System.out.println(hm.get(s));
        }
    }

    public BufferedReader getBr() {
        return br;
    }

    public void close() throws IOException {
        getBr().close();
    }
 }
