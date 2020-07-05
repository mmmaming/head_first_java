# 认识Java的API

### ArrayList, Java 函数库中的一个类

```
add(Object elem) 向list中加入对象参数

remove(int index) 在索引参数中移除对象

remove(Object elem) 移除该对象

contains(Objext elem) 如果和对象参数匹配返回true

isEmpty() 如果list中没有元素返回true

indexOf(Object elem) 返回对象参数的索引或-1

size() 返回list元素的个数

get(int index) 返回当前索引参数的对象
```
### ArrayList的操作
```
// 创建
ArrayList<Egg> myList = new ArrayList<Egg>();

// 添加
Egg e = new Egg();
myList.add(e);

// 查询大小
int theSize = myList.size();

// 查询特定元素
boolean isIn = myList.contains(e);

// 查询特定元素的位置
int idx = myList.indexOf(e);

// 判断集合是否为空
boolean empty = myList.isEmpty();

// 删除元素
myList.remove(e);

```

### 使用函数库(Java API)
1. 在Java API中，类被包装在包中。 
2. 要使用API中的类，你必须知道他被放在哪个包中。
3. 使用API时需要指定函数库类的完整名称(包的名称+类的名称)(java.lang除外)。
4. 两种方法指定所使用的的类
  * 4.1. 在源文件最开始的位置使用import.
  `import java.util.ArrayList`
  * 4.2. 在程序代码中打出全名. 
  `java.util.ArrayList<Dog> list = new java.util.ArrayList<Dog>()`
  
  [java14 Doc](https://docs.oracle.com/en/java/javase/14/docs/api/index.html)
  