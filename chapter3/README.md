变量有两种类型
1. 原始类型
2. 对象类型

**声明变量时必须定义变量的类型和名称。**

primitive类型
boolean char byte short int long float double

对象引用变量保存的是存取对象的方法。

对象存在于堆中，变量保存的是对对象的引用。

当对象没有被引用时，会被垃圾回收器标记为可回收的，并在适当的时候回收。

声明数组

1. 声明一个Dog数组变量。

  ```
  Dog[] pets;
```
2. 创建一个Dog数组，并赋值给pets变量。
```
pets = new Dog[7];
```
3.创建Dog对象并赋值给数组的元素。
```
pets[0] = new Dog();
pets[1] = new Dog();
```
