public class EX5_1 {
    public static void main(String[] args) {
        System.out.println(warAndPeace("there was never a good war, or a bad peace"));
        System.out.println(warAndPeace("war what is it good for"));
        System.out.println(warAndPeace("warwarwarwarpeacepeacepeacepeace"));
    }

    public static boolean warAndPeace(String text) {
        int warIndex = 0, warNum = 0, peaceIndex = 0, peaceNum = 0;
        for (int i = 0, length = text.length(); i < length; ++i) {
            warIndex = text.indexOf("war", warIndex);
            peaceIndex = text.indexOf("peace", peaceIndex);
            if (warIndex >= 0) {
                ++warNum;
                warIndex += 3;
            }
            if (peaceIndex >= 0) {
                ++peaceNum;
                peaceIndex += 5;
            }
        }
        return warNum == peaceNum;
    }
}
