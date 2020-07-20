# 序列化和文件的输入/输出

可以通过序列化来存储对象的状态。

使用ObjectOutputStream来序列化对象(java.io)

Stream是链接串流或者是链接用的串流。

连接串流用来表示源或目的地、 文件、网络套接字连接。

链接用串流用来衔接连接串流。

用FileOutputStream链接ObjectOutputStream来将对象序列化到文件上。

调用ObjectOutputStream的writeObject(theObject)来将对象序列化，不需调用FileOutputStream的方法。

对象必须实现序列化这个接口才能被序列化。如果父类实现序列化，则子类也就自动地有实现，而不管是否有明确的声明。

当对象被序列化时，整个对象版图都会被序列化，这代表它的实例变量所引用的对象也会被实例化。

如果有不能序列化的对象，执行期间就会抛出异常。

除非该实例变量被标记为`transient`，否则，该变量在还原的时候会被赋予null或者primitive主数据类型的默认值。

在解序列化(deserialization)，所有的类都必须能让Java虚拟机找到。

读取对象的顺序必须与写入的顺序相同。

readObject()的返回类型是Object，因此解序列化回来的对象还需要转换成原来的类型。

静态变量不会被序列化，因为所有的对象都是共享同一份静态变量值。
