
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            HashMap<Character, Integer> v = new HashMap<>();
            int ans = 0;
            int tmp;
            for (int i = 0; i < s.length()-2; i++) {
                v.put(s.charAt(i), i);
                v.put(s.charAt(i+1), i+1);
                v.put(s.charAt(i+2), i+2);
                for 
                while (v.size()>= 3 && v.get == '0' && v[v.size() - 2].first == '0' && v[v.size() - 3].first == '1') {
                    v.pop_back();
                    v.pop_back();
                    v.pop_back();
                }
                tmp = v.back().second;
                ans = max(ans, i - tmp);
            }
            return ans;
            System.out.println(check(s));
        }

    }

}
