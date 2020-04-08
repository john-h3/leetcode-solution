# remove-duplicates-from-sorted-array

双指针方法，一个指针 `i` 循环数组，另一个指针 `idx` 维护不重复的元素，当出现新的不重复元素时， `idx` 指针后移一位并将值替换为新的元素。