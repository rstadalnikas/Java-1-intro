//Telephone number word generator given seven digit number
package TelephoneNumberWordGenerator157;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TelephoneNumberWordGenerator {
    private static final String[] letters = {null, null, "A B C", "D E F",
        "G H I", "J K L", "M N O", "P R S", "T U V", "W X Y"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type phone number excluding area code: ");
        String phoneNumberInput = input.nextLine();

        write(separator(phoneNumberInput));
    }

    public static int[] separator(String phoneString) {
        int[] phoneNumbers = new int[phoneString.length()];

        for (int i = 0; i < phoneNumbers.length; i++)
            phoneNumbers[i] = Integer.parseInt(phoneString.substring(i, i + 1));

        return phoneNumbers;

    }

    public static void write(int[] phoneNumber) {
        String combinations = "";
        PrintStream printStream = null;
        
        try {
            printStream = new PrintStream(Files.newOutputStream(Paths.get("combinations.txt")));
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;

        for (int a = 0; a < 3; a++) {
            String[] token2 = letters[phoneNumber[0]].split(" ");
            for (int b = 0; b < 3; b++) {
                String[] token3 = letters[phoneNumber[1]].split(" ");
                for (int c = 0; c < 3; c++) {
                    String[] token4 = letters[phoneNumber[2]].split(" ");
                    for (int d = 0; d < 3; d++) {
                        String[] token5 = letters[phoneNumber[3]].split(" ");
                        for (int e = 0; e < 3; e++) {
                            String[] token6 = letters[phoneNumber[4]].split(" ");
                            for (int f = 0; f < 3; f++) {
                                String[] token7 = letters[phoneNumber[5]].split(" ");
                                for (int g = 0; g < 3; g++) {
                                    String[] token8 = letters[phoneNumber[6]].split(" ");

                                    combinations = String.format("%04d : %s%s%s%s%s%s%s%n",
                                            ++count, token2[a], token3[b], 
                                            token4[c], token5[d], token6[e], 
                                            token7[f], token8[g]);

                                    System.out.print(combinations);
                                    printStream.format("%s", combinations);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

