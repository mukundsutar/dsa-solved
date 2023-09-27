package Bit_Manipulation;

public class get_set_clear {
    public static int getIthBit(int num, int i) {
        int bitmask = 1 << i;

        if ((num & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int num, int i) {
        int bitmask = 1 << i;

        return num | bitmask;
    }

    public static int clearIthBit(int num, int i) {
        int bitmask = ~(1 << i);

        return num & bitmask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(num, i);
        // } else {
        // return setIthBit(num, i);
        // }

        num = clearIthBit(num, i);
        int bitmask = newBit << i;
        return num | bitmask;
    }

    public static int clearLastIthBit(int num, int i) {
        int bitmask = (~0) << i;

        return num & bitmask;
    }

    public static int clearBitsRange(int num, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return num & bitmask;
    }

    public static boolean powerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }

    public static int countSetBits(int num) {
        int count = 0;

        while (num > 0) {
            // check LSB
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println("Get the ith bit= " + getIthBit(11, 3));
        // System.out.println("Set the ith bit= " + setIthBit(11, 3));
        // System.out.println("Clear the ith bit= " + clearIthBit(11, 3));
        // System.out.println();
        // System.out.println("Update the ith bit= " + updateIthBit(10, 2, 1));
        // System.out.println();
        // System.out.println("Clear the last ith bits= " + clearLastIthBit(15, 2));
        // System.out.println();
        // System.out.println("Is the number in the power of 2= " + powerOfTwo(8));

        System.out.println("Count of Set Bits= " + countSetBits(10));
    }
}
