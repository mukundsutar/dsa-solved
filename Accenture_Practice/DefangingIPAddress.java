package Accenture_Practice;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
        String str = "";

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str = str + "[.]";
                continue;
            }
            str = str + address.charAt(i);
        }

        return str;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
}
