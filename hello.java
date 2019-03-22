import java.util.Vector;

// import com.sun.tools.javac.util.List;

class HelloJava implements Deleteable {
    public void delet() {

    }

    static private void alert() {
        System.out.println("warning !\n");
    }
    static class DataOnly {
        int i;
        float f;
        boolean b;
    }
    static int storage(String s) {
        return s.length();
    }
    public static void main(String [] args) {
        DataOnly d = new DataOnly();
        System.out.println(args);
        System.out.println(Integer.toBinaryString(6));
        // List<String> foo = 
        // String str = "aha~~~";
        {
            String word = "bingo";
            word = "aha~~~";
            String chas = "a" + "ha~~~";
            String newWord = new String("aha~~~");
            // System.out.println(word == str);
            // System.out.println(word == chas);
            // System.out.println(word == newWord);
            // System.out.println(word.equals(newWord));
            int hc = chas.hashCode();
            System.out.println(hc);
        }

        // System.out.println(str);
        int sth = storage("^E^%*(&$*%)^)");
        System.out.println(d);
        System.out.println(sth);

        alert();
    }
}

interface Deleteable {
    void delet();
    
}

class SomeWhat {
    static void main() {

    }
}