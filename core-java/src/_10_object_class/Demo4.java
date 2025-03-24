package _10_object_class;

public class Demo4 {
    public static void main(String[] args) {
        Demo4 ref1 = new Demo4();
        Demo4 ref2 = ref1;
        System.out.println(ref1.hashCode());//1072408673
        System.out.println(ref2.hashCode());//1072408673

        String classCompleteName = ref1.getClass().getName();
        String hexString = Integer.toHexString(ref1.hashCode());

        System.out.println(classCompleteName+"@"+hexString);
        System.out.println(ref1.toString());
        System.out.println(ref1);

    }
}
