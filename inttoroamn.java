package Integers;

class intToRoman {
    public String intToRoman(int num) {
        int[] storeint = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] storeroman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String romannumeral = "";
        for (int i = 0; i < storeint.length; i++) {
            while (num >= storeint[i]) {
                romannumeral += storeroman[i];
                num -= storeint[i];
            }
        }
        return romannumeral;
    }

    public static void main(String[] args) {
        int num = 58;
        intToRoman converter = new intToRoman();
        String result = converter.intToRoman(num);
        System.out.println(result); // Should print "LVIII"
    }
}
