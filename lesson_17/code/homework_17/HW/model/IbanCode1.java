package homework_17.HW.model;

public class IbanCode1 {
    //fields
    private String iban;

    //constructor
    public IbanCode1(String iban) {
        this.iban = iban;
    }

    //setters and getters
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    //display
    public void display() {
        System.out.println("IBAN" + iban);
    }

    //methods
    //number of characters in IBAN
    public int lengthCode() {
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        return ibanLength.length;
    }

    //sum of first two characters according to ASCII
    public int controlCode() {
        //String[] ibanControl = iban.replaceAll("\\s+", "").split("");
        char firstChar = iban.charAt(0);
        char secondChar = iban.charAt(1);
        return firstChar + secondChar;
    }

    //checking the correct number of characters in IBAN (22)
    public boolean isValid() {
        String[] ibanLength = iban.replaceAll("\\s+", "").split("");
        if (ibanLength.length == 22) {
            return true;
        }
        return false;
    } // end of method
} // end of class
