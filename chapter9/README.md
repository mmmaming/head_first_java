# 构造器与垃圾回收器

对象存放在堆(heap)中。实例变量存在于对象所属的堆空间中。
方法调用，局部变量，primitive类型存放在栈(stack)中。
如果某个局部变量引用了某个对象，则变量本身放在栈上，对象本身放在堆上。

### 构造函数
构造函数只有对象在被new时会调用。如果没有手动声明一个构造函数，则编译器会创建构造函数。
构造函数会在初始一个对象的时候就执行（在被赋值给一个引用变量之前就执行）。
构造函数的函数名必须和类相同，并且没有返回类型。

可以在构造器中做一些初始化动作。
构造函数也可以重载，通过编写需要不提供个数参数和不需要参数的构造函数，来达到重载的目的。  


编译器会在完全没有构造函数时才自动创建构造函数。

重载构造函数的意思是表示有一个以上的构造函数并且参数都不相同

在创建新对象时，每个父级构造函数都会执行。

抽象类也有构造函数，并且会在子类对象实例化的时候执行构造函数。

在子类构造函数中使用super()来调用父类构造函数。如果没有手动声明，则编译器会帮助我们调用super();

子类构造函数第一个被调用，最后一个完成。这是因为super()必须在构造函数的第一条语句。

super()函数可以传参数，此参数会被传递到父类有参数的构造函数中。

一个类可以有多个构造函数，并且通过重载有不同的参数，通过在构造函数中调用this()函数来实现对所有其他重载的构造函数的调用。但是注意，this和super只能出现一个。

使用this()来从某个构造函数调用同一个类的另外一个构造函数。

局部变量只会存活在声明该变量的方法中。

实例变量的寿命与对象相同，如果对象活着，则实例变量也活着。
