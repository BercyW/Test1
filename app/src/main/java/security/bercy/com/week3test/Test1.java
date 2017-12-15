package security.bercy.com.week3test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bercy on 12/15/17.
 */

public class Test1 {

    public static List<String> checkString(String s) {

            List<String> list = new ArrayList<>();
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                list.add(String.valueOf(chars[i]));
            }
            for (int i = 0; i < chars.length-1; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(chars[i]).toString();
                for (int j = i+1; j < chars.length; j++) {
                    sb.append(chars[j]).toString();
                }
                list.add(sb.toString());

            }

            return list;
    }

    public static void main(String[] args) {
        String s = "frog";
        System.out.println(checkString(s));
    }
}
