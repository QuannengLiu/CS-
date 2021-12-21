

Day 3数组二分查找

[704题.二分查找](https://leetcode-cn.com/problems/binary-search/)

​    //二分查找基本思路

​    //第一步：先让target与最小值左边比较；

​    //第二步：若大于左边的值，则与右边比较，若小于右边则与中间值比较；

​    //第三步：若大于中间的值，则取右边与左边（原中间）的中间值比较；若小于中间的值，则取左边与右边（原中间）的中间值比较；（中间值为奇数怎么办？中间值的左右各算一遍吗？）

​    //第四步：重复第三步直至中间值相等，则输出中间值；若中间值的下标等于左边或右边则返回-1；



二分查找三大模板

https://leetcode-cn.com/problems/binary-search/solution/leetcode-offer-er-fen-cha-zhao-san-da-mo-0mn7/