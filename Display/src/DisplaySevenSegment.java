import java.util.Scanner;
public class DisplaySevenSegment {
    public void create() {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of repetitions and the number separated by a comma. Finish the program with 0,0");
            String number = userInput.next(); //Saves the iterations and show them in the print
            if (number.equals("0,0")) break; //Stops the program when the input specified is declared
            int numberOfRepetitions = Integer.parseInt(number.split(",")[0]); //Split: number of repetitions
            String decimals = number.split(",")[1]; // Split: number in display
            int i;
            String[][] displayArray = new String[decimals.length()][7]; //Array size of the display
            int[] arrayOfCiphers = new int[decimals.length()];  //Creation of ciphers
            for (i = 0; i < decimals.length(); i++) {
                arrayOfCiphers[i] = Integer.parseInt(String.valueOf(decimals.charAt(i))); //Converting ciphers to char
            }

            //Drawing figures for creating the numbers
            for (i = 0; i < decimals.length(); i++) {
                displayArray[i][0] = "---";
                displayArray[i][1] = "|";
                displayArray[i][2] = "|";
                displayArray[i][3] = "---";
                displayArray[i][4] = "|";
                displayArray[i][5] = "|";
                displayArray[i][6] = "---";
                switch (arrayOfCiphers[i]) {
                    case 0: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 1: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 2: {
                        displayArray[i][1] = " ";
                        displayArray[i][5] = " ";
                        break;
                    }
                    case 3: {
                        displayArray[i][1] = " ";
                        displayArray[i][4] = " ";
                        break;
                    }
                    case 4: {
                        displayArray[i][0] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 5: {
                        displayArray[i][2] = " ";
                        displayArray[i][4] = " ";
                        break;
                    }
                    case 6: {
                        displayArray[i][2] = " ";
                        break;
                    }
                    case 7: {
                        displayArray[i][1] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 8: {
                        break;
                    }
                    case 9: {
                        displayArray[i][4] = " ";
                        break;
                    }
                    default:
                        break;
                }
            }

            //Allowing the display's array to be repeated
            for (int j = 0; j < numberOfRepetitions; j++) {
                for (i=0;i<decimals.length();i++){
                    System.out.printf(" %s  ", displayArray[i][0]);
                }
                System.out.println("");
                for (i=0;i<decimals.length();i++){
                    System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
                }
                System.out.println("");
                for (i=0;i<decimals.length();i++){
                    System.out.printf(" %s  ", displayArray[i][3]);
                }
                System.out.println("");
                for (i=0;i<decimals.length();i++){
                    System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
                }
                System.out.println("");
                for (i=0;i<decimals.length();i++){
                    System.out.printf(" %s  ", displayArray[i][6]);
                }
                System.out.println("");
            }
        }
    }
}
