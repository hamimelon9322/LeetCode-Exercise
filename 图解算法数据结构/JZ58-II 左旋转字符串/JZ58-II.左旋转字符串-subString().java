class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);// 切片函数substring() 方法返回字符串的子字符串,(beginIndex,endIndex)，开始索引（包括）从0开始，和结束索引（不包括）
    }
}