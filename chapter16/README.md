# 集合与泛型

泛型不能被多态

```
public <T extends Animal> void takeThing(ArrayList<T> list);

public void takeThing(ArrayList<Animal> list);

// 两者含义不一样，第一个表示任何Animal或者Animal的子类型的list都是合法的。
// 第二个表示只有Animal类型的ArrayList是合法的

```
