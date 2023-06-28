public class javaString {

    public static void main(String[] args) {

//        to use trim always assign the value of trim another varibale or the same variable itself
        String name="      naBein    ";
        System.out.println("before"+name.length());
    String  value= name.trim();
        System.out.println(value.length());

        System.out.println(value.toLowerCase());
        System.out.println(value.charAt(3));
        System.out.println(value.concat(name));
        System.out.println(value.codePoints());
        System.out.println(value.subSequence(2,5));
        System.out.println(value.hashCode());
        System.out.println(value.replace('n','N'));
        System.out.println(value.substring(2,5));
        System.out.println(value.strip());
        System.out.println(value.split("e",4));
        System.out.println(value.toUpperCase());

        String str = "abcde";
        str.trim();
        str.toUpperCase();
        str.substring(3, 4);
        System.out.println(str);

    }
}
