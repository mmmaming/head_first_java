### Java 工作方式
1. 编写源代码
2. 通过编译器运行源代码（xxx.java）
3. 编译器将源代码转译成字节码(xxx.class)
4. 通过JVM运行字节码

### Java 程序结构
```
source file 
  -> class file
    -> method 1
      -> statement
      -> statement
    -> method 2
      -> statement
      -> statement
```

##### 源文件
带有类的定义,类用来表示程序的一个组件.
文件中最多只有一个public的类

##### 类
类中带有一个或者多个方法，方法必须在类的内部声明.

##### 方法
编写执行的指令，方法由一组语句组成。

### 剖析类
每个Java应用程序至少会有一个类，每个应用程序必须有且只有一个main()函数.

