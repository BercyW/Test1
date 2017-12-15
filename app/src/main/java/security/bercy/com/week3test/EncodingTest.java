package security.bercy.com.week3test;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bercy on 12/15/17.
 */

public class EncodingTest {

    @TargetApi(Build.VERSION_CODES.N)
    private static Map<Character, Integer> g(String s) {
        Map<Character, Integer> map = new HashMap<>();
        s.toLowerCase();
        s.trim();
        String s1=s.replaceAll("[`~!@#$%^&*()+=|{}':;',/?~！（）：”“’。，、？|-]", "");
        for (int i = 97; i < 123; i++) {
            char temp = (char)i;
            map.put(temp,0);
        }
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> entry :map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



        return map;

    }

    public static void main(String[] args) {
        String s = "Hello there! Apple!";
        System.out.println(g(s));
    }

}
