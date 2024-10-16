package classwork_25.string_builder;

public class StringBuilderAppl {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        sb.append("_").append("21"); // append - добавить в конец
        System.out.println(sb);

        sb.reverse(); // разворот строки
        System.out.println(sb);

        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5, "!"); // insert - вставить куда (на какое место - 5) и что (!)
        System.out.println(sbNew);
        sbNew.append(true);
        System.out.println(sbNew);

    }
}
