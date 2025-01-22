package _4_control_statements.if_else;

public class Demo11 {
    public static void main(String[] args) {
        String fileType = "abc";
        switch (fileType){
            case "txt" : System.out.println("text");break;
            case "json" : System.out.println("json");break;
            case "excel" : System.out.println("excel");break;
            case "pdf" : System.out.println("pdf");break;
            default:
                System.out.println("invalid file format");break;
        }
    }
}
