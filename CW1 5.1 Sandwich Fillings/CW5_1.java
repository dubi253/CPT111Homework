public class CW5_1 {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("breadtunabread"));
        System.out.println(sandwichFillings("chipsbreadtunasalad"));
        System.out.println(sandwichFillings("breadbread"));

    }

    public static String sandwichFillings(String input) {
        int firstBreadIndex = input.indexOf("bread") + 5, secondBreadIndex = input.lastIndexOf("bread");
        return 0 <= firstBreadIndex && firstBreadIndex <= secondBreadIndex ? input.substring(firstBreadIndex, secondBreadIndex) : "none";
    }
}
