// 不像StringBuilder是可变对象，每轮遍历拼接字符时，只是向列表尾部添加一个新的字符元素，最终拼接转化为字符串时，系统仅申请一次内存；
// 而String字符串是 “不可变对象”，每轮遍历拼接字符时，都需要新建一个字符串，系统需申请N次内存 ，数据量较大时效率低下。
class Solution {
    public String reverseLeftWords(String s, int n) {
        String res = "";
        for(int i = n; i < s.length(); i++)
            res +=s.charAt(i);
        for(int i = 0; i < n; i++)
            res += s.charAt(i);
        return res;
    }
}
