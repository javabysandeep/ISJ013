package _4_control_statements.if_else;

public class Demo7 {
    public static void main(String[] args) {
        String fileType = "txt";
        if (fileType.equals("pdf")) {
            System.out.println("1. pdf files reading logic");
        }
        if (fileType.equals("txt")) {
            System.out.println("2. txt files reading logic");
        }
        if (fileType.equals("xml")) {
            System.out.println("3. xml files reading logic");
        }
        if (fileType.equals("excel")) {
            System.out.println("4. excel files reading logic");
        }
        if (fileType.equals("json")) {
            System.out.println("5. json files reading logic");
        }
        if (fileType.equals("image")) {
            System.out.println("6. image files reading logic");
        }
        if (fileType.equals("video")) {
            System.out.println("7. video files reading logic");
        } else {
            System.out.println("invalid file format");
        }
    }
}
