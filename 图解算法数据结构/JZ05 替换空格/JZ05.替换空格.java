/**效率不高，但是力扣能通过
class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}*/

// 遍历修改
class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray()){// for(<数组/列表的数据类型> <临时变量名称>：<要迭代的数组/列表>);toCharArray() 方法将字符串转换为字符数组
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}

// C++ 语言中， string 被设计成「可变」的类型，因此可以在不新建字符串的情况下实现原地修改。
