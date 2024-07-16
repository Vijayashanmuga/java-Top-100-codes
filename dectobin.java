package BitManipulation;

public class dectobin {
    public static void main(String[] args) {
        String str = "13";
        System.out.println(dectobin(str));
    }

    public static String dectobin(String stre) {
        int dec = Integer.parseInt(stre);
        String bin = "";
        while (dec > 0) {
            bin = dec % 2 + bin;
            dec = dec / 2;
        }
        return bin;

    }

}