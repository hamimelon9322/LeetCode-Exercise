class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n;i < s.length();i++)
            res.append(s.charAt(i)); // charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1
        for(int i = 0;i < n;i++)
            res.append(s.charAt(i));
        return res.toString(); 
    }
}

// 取余简化代码
/**     for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length())); */