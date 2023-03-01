package leetcode.easy;

public class Solution1108 {
    public String defangIPaddr(String address){
        char[] ip = new char[address.length() + (3*2)];
        for (int i=0, y=0;i<address.length();i++,y++){
            if (address.charAt(i)=='.'){
                ip[y++] = '[';
                ip[y++] = '.';
                ip[y] = ']';
            }else {
                ip[y] = address.charAt(i);
            }
        }
        return String.valueOf(ip);
    }
}
