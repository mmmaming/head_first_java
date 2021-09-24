# 集合与泛型

## 重要的集合
### TreeSet 以有序状态保持并防止重复

### HashMap 可用成对的`name/value`来保存和取出

### LinkedList 针对经常插入或删除中间元素所设计的高效率集合。

### HashSet 防止重复的集合，可快速寻找相符的元素。

### LinkedHashMap 类似HashMap，但可记住元素插入的顺序，也可以设计成依照元素上次存取的先后来排序。

Java中的每个类都会继承Object，所以都会有toString这个方法，当System.out.println()被调用时，对象的toString方法就会被调用一次。有时候可以通过复写类的toString方法来达到输出不同内容的目的。
泛型不能被多态

```
public <T extends Animal> void takeThing(ArrayList<T> list);

public void takeThing(ArrayList<Animal> list);

// 两者含义不一样，第一个表示任何Animal或者Animal的子类型的list都是合法的。
// 第二个表示只有Animal类型的ArrayList是合法的..

```
