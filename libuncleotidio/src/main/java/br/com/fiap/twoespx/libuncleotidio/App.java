package br.com.fiap.twoespx.libuncleotidio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String s1 = "ctggtctgac";
        int contA = 0;
        int contC = 0;
        int contT = 0;
        int contG = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh == 'c' || lowerCh == 'a' || lowerCh == 't' || lowerCh == 'g'){
                switch(lowerCh){
                    case 'c':
                        contC++;
                        break;
                    case 'a':
                        contA++;
                        break;
                    case 't':
                        contT++;
                        break;
                    case 'g':
                        contG++;
                        break;
                }
            }
        }

        System.out.println("Sequencia: " + s1);
        System.out.println("A: " + contA);
        System.out.println("C: " + contC);
        System.out.println("T: " + contT);
        System.out.println("G: " + contG);

    }
}
