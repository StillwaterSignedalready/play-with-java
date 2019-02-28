import org.graalvm.compiler.word.Word;

class HelloJava implements Deleteable {
    static private void alert() {
        System.out.println("warning !\n");
    }
    public static void main(String [] args) {
        System.out.println(args);
        System.out.println(Integer.toBinaryString(6));

        String str = "aha~~~";
        {
            String word = "bingo";
            word = "aha~~~";
            String chas = "a" + "ha~~~";
            String newWord = new String("aha~~~");
            System.out.println(word == str);
            System.out.println(word == chas);
            System.out.println(word == newWord);
        }
        System.out.println(str);

        alert();
    }
}

public interface Deleteable {
    void delet();
    
}

class SomeWhat {
    static void main() {

    }
}