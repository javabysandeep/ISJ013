package _12_string_handling;

public class Demo15Reverse {
    public static void main(String[] args) {
        String str = "Good morning";
        System.out.println("way 01 : printing from length-1 to 0 index---> wrong");
        for (int index = str.length() - 1; index >= 0; index--) {
            System.out.print(str.charAt(index));
        }

        System.out.println("\n way 02 : traverse from length-1 to 0 and put it in another string expensive and not optimal");
        String reverse = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            reverse = reverse + str.charAt(index);
        }
        System.out.println(reverse);

        System.out.println("\n way 03 : traverse from length-1 to 0 and put it in another array and convert array into string");
        char[] reverseArray = new char[str.length()];
        for (int index = str.length() - 1, arrayIndex = 0; index >= 0; index--, arrayIndex++) {
            reverseArray[arrayIndex] = str.charAt(index);
        }
        String reverseArrayString = new String(reverseArray);
        System.out.println(reverseArrayString);


        System.out.println("\n way 04 : create a StringBuilder and add the elements from given String");
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            stringBuilder.append(str.charAt(index));
        }
        System.out.println(stringBuilder);

        System.out.println("\n way 05 : create a StringBuilder and add the elements from given String & call reverse method");
        StringBuilder stringBuilder2 = new StringBuilder(str);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);

    }
}
