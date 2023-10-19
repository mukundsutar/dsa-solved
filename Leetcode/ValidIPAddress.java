package Leetcode;

public class ValidIPAddress {
    public static String checkIP(String queryIP) {
        int ipv4Arr[] = new int[4];
        int start = 0;
        int index = 0;
        int count = 0;

        // check for IPv4
        if (queryIP.contains(".")) {
            for (int i = 0; i < queryIP.length(); i++) {
                // check for other characters
                if (queryIP.charAt(i) > 58) {
                    break;
                }

                // find '.', add to array and check the element 
                if (queryIP.charAt(i) == '.' && count <= 3) {
                    boolean checkZero= false;
                    checkZero= queryIP.substring(start, i).startsWith("0");

                    if(queryIP.substring(start, i)!="" && checkZero==false){
                        ipv4Arr[index] = Integer.parseInt(queryIP.substring(start, i));
                    } else{
                        break;
                    }   

                    if (ipv4Arr[index] > 255) {
                        break;
                    }

                    start = i + 1;
                    index++;
                    count++;

                } else if (i == queryIP.length() - 1 && count <= 3) {
                    ipv4Arr[index] = Integer.parseInt(queryIP.substring(start, i + 1));

                    if (ipv4Arr[index] > 255 && count > 3 ) {
                        break;
                    }
                    return "IPv4";
                }
            }

        }

        // check for IPv6
        else if (queryIP.contains(":")) {
            for (int i = 0; i < queryIP.length(); i++) {
                if ((queryIP.charAt(i) >= 48 && queryIP.charAt(i) <= 57
                        || queryIP.charAt(i) >= 65 && queryIP.charAt(i) <= 70
                        || queryIP.charAt(i) >= 97 && queryIP.charAt(i) <= 102) && count <= 7) {
                    continue;
                }

                count++;
            }

            if (count == 7) {
                return "IPv6";
            }
        }

        return "Neither";
    }

    public static void printArray(int ipv4Arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < ipv4Arr.length; i++) {

            System.out.print(ipv4Arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        String queryIP = "1.1.1.01";

        System.out.println(checkIP(queryIP));
    }
}
