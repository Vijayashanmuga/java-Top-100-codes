package Integers;

class integerReplacement {
    public static int integerReplacement(int n) {
        return replaceInteger(n);
    }
    public static int replaceInteger(int n) {
        int cnt = 0;
        long num = n; // Use long to handle edge cases like n = Integer.MAX_VALUE

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if ((num == 3) || ((num & 2) == 0)) {
                    num--;
                } else {
                    num++;
                }
            }
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(integerReplacement(num));
    }
}
