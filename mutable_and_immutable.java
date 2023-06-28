public class mutable_and_immutable {
    public static void main(String[] args) {

        StringBuffer stringBuffer =new StringBuffer();
        stringBuffer.append("Nabin");
        System.out.println(stringBuffer);
        String str  = stringBuffer.toString();
        stringBuffer.deleteCharAt(2);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(2));
    }
}
