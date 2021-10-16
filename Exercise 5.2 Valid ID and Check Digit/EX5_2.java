public class EX5_2 {
    public static void main(String[] args) {
        String test = "aAZ12b23568";
        System.out.println(isValidID("THMBB7092WD114221"));
        System.out.println(isValidID("A001-606X-17X"));
        System.out.println(isValidID(test));
    }

    public static boolean isValidID(String id) {
        int length = id.length(), total = 0;
        if (length >= 5) {
            for (int i = 0; i < length - 1; ++i) {
                char temp = id.charAt(i);
                if (Character.isDigit(temp)) {
                    total += Integer.parseInt(String.valueOf(temp));
                } else if (temp != '-' && !Character.isLetter(temp)) {
                    return false;
                }
            }
            return id.charAt(length - 1) == (total % 11 == 10 ? 'X' : total % 11 + 48);
        }
        return false;
    }
}
