public class Main {
    public static void main(String[] args) {
        System.out.println("Первые примеры:");
        String regex1 = "\\w{1,}";
        if("abcdef".matches(regex1) == true) {
            System.out.println("abcdef=" + " " + "abcdef".matches(regex1));
        }else {
            System.out.println("false");
        }
        if("abcd".matches(regex1) == true){
            System.out.println("abcd=" + " " + "abcd".matches(regex1));
        }else {
            System.out.println("false");
        }
        if("abc".matches(regex1) == true){
            System.out.println("abc=" + " " + "abc".matches(regex1));
        }else {
            System.out.println("false");
        }
        
        System.out.println(" ");
        System.out.println("Вторые примеры:");
        String regex2 = "\\w{1,}\\s{0,}\\w{0,}\\s{0,}[=]{0,}\"{0,}[1-9]{0,}\"{0,}\\s{0,}[1-9;]{0,}";
        if("abc123xyz".matches(regex2) == true){
            System.out.println("abc123xyz=" + " " + "abc123xyz".matches(regex2));
        }else {
            System.out.println("false");
        }
        if("define \"123\" ".matches(regex2) == true) {
            System.out.println("define \"123\"=" + " " + "define \"123\" ".matches(regex2));
        }else {
            System.out.println("false");
        }
        if("var g = 123;".matches(regex2) == true){
            System.out.println("var g = 123;=" + " " + "var g = 123;".matches(regex2));
        }else {
            System.out.println("false");
        }
        
        System.out.println(" ");
        System.out.println("Третьи примеры:");
        String regex3 = "[\\w]{0,}[?]{0,}[=]{0,}[+]{0,}[.]$";
        if("cat.".matches(regex3) == true) {
            System.out.println("cat.=" + " " + "cat.".matches(regex3));
        }else {
            System.out.println("false");
        }
        if("896.".matches(regex3) == true) {
            System.out.println("896.=" + " " + "896.".matches(regex3));
        }else {
            System.out.println("false");
        }
        if("?=+.".matches(regex3) == true) {
            System.out.println("?=+.=" + " " + "?=+.".matches(regex3));
        }else {
            System.out.println("false");
        }
        if("abc1".matches(regex3) == true) {
            System.out.println("abc1=" + " " + "abc1".matches(regex3));
        }else {
            System.out.println("abc1=" + " " + "false");
        }
    }
}
