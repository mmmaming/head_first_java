# 集合与泛型

## 重要的集合
### TreeSet 以有序状态保持并防止重复

### HashMap 可用成对的`name/value`来保存和取出

### LinkedList 针对经常插入或删除中间元素所设计的高效率集合。

### HashSet 防止重复的集合，可快速寻找相符的元素。

### LinkedHashMap 类似HashMap，但可记住元素插入的顺序，也可以设计成依照元素上次存取的先后来排序。

Java中的每个类都会继承Object，所以都会有toString这个方法，当System.out.println()被调用时，对象的toString方法就会被调用一次。有时候可以通过复写类的toString方法来达到输出不同内容的目的。
