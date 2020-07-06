# 方法操作实例变量 

### 状态影响行为 行为影响状态

### 类所描述的是对象知道什么与执行什么

方法要声明返回值的类型,写法：
```
class XX {
  int getNumber() {
    return 666;
  };
}

var x = new XX();
// 定义的变量类型必须与返回值类型相等或兼容。
int num = x.getNumber();
```

### Java是通过值传递的，也就是说通过拷贝传递 //(基本类型)

### 传递给方法的参数类型必须与声明时的参数类型相等

通过Getter Setter来设置和访问实例变量的值.

```
class XX {
  String brand;

  void setBrand(String aBrand) {
    brand = aBrand;
  }

  String getBrand() {
    return brand;
  }
}
```

### 封装
通过将实例对象标记为私有的，并设置getter和setter来控制访问动作，以达到访问安全性的目的。

实例变量只初始化没有赋值时会有默认值。
实例变量声明在类中。
局部变量声明在方法中。
局部变量在初始化时必须设置初始值。

|variable|default value|
|-|-|
| integers| 0|
|floating points|0.0|
|booleans|false|
|references|null|

### 变量的比较
primitive类型中==比较的是两个变量的字节组合。
```
int a = 3;
byte b = 3;
a == b; // true
```
对象类型中==比较的是两个变量的引用是否相等。

