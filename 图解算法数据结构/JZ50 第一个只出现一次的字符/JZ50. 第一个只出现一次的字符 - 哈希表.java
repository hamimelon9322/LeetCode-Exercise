// 初始化： 字典 (Python)、HashMap(Java)、map(C++)，记为 dic
// 时间复杂度：O(N)：N 为字符串s的长度；需遍历s两轮，使用O(N) ；HashMap 查找操作的复杂度为O(1) ；
// 空间复杂度：O(1)：由于题目指出 s 只包含小写字母，因此最多有 26 个不同字符，HashMap 存储需占用O(26)=O(1) 的额外空间。

class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c)); // 不包含 c 输入(c, true);包含 c 修改为(c, false)
        for(char c : sc)
            if(dic.get(c)) return c; // get dic 的 value 值，if(true) return c;
        return ' ';
    }
}