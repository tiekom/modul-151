public class Recursive {
    public String rotate(String x, int length) {
        if (x.length() / 2 < length) {
            char[] chars = new char[x.length()];
            for (int i = 0; i < x.length(); i++) {
                chars[i] = x.charAt(i);
            }
            int abs = Math.abs((length) - x.length());
            chars[length - 1] = x.charAt(abs);
            chars[abs] = x.charAt(length - 1);
            length--;
            return rotate(String.valueOf(chars), length);
        }
        return x;
    }

    public boolean palindrome(String x, int length, boolean isPolindrome) {
        if (x.length() / 2 < length) {
            char[] chars = new char[x.length()];
            for (int i = 0; i < x.length(); i++) {
                chars[i] = x.charAt(i);
            }
            if (chars[length - 1] != x.charAt(Math.abs((length) - x.length()))) {
                isPolindrome = false;
            }
            length--;
            return palindrome(String.valueOf(chars), length, isPolindrome);
        }
        return isPolindrome;
    }

    public int[] fibonacci(int anzahl, int[] array) {
        if (anzahl > 0) {
            if (array.length == 0) {
                return fibonacci(anzahl - 1, new int[]{1});
            } else if (array.length == 1) {
                return fibonacci(anzahl - 1, new int[]{1, 1});
            }
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (i == array.length) {
                    newArray[array.length] = array[newArray.length - 2] + array[newArray.length - 3];
                } else {
                    newArray[i] = array[i];
                }
            }
            return fibonacci(anzahl - 1, newArray);
        }
        return array;
    }

    public int findBiggestDivider(int x, int y){
        int rest = x % y;
        if(rest==0) return y;
        else return findBiggestDivider(y, rest);
    }


        public String solve(int n, char first, char mid, char last) {
            if(n ==1){
                System.out.print(" |" + first + "->" + last + "| ");
            }else{
                solve(n-1, first, last, mid);
                solve(1, first, mid, last);
                solve(n-1, mid, first, last);
            }

            return "";
        }

}
