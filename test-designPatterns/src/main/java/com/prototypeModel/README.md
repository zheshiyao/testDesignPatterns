##原型模式
原型模式也是一种对象的创建模式，通过给出一个原型对象，来指明所有创建对象的类型，然后通过复制这个原型对象来创建更多同类型的对象。
##原型模式的结构
从上面可知，要实现原型模式，必须要用到Object类的clone()方法，要求对象本身实现一个可克隆自身接口。这样通过原型模式创建对象，就不需要
关心这个实例本身的类型，只需要实现克隆自身的方法，就能获取新的对象，并且不再需要new去创建
##为什么要使用原型模式
1. _使用原型模式的方式来创建对象，在性能上比直接new一个对象好的多_，因为Object类的clone()方法是一个native方法，直接操作内存的二进制流，
特别是在复制大对象时，性能差别非常明显
2. 使用原型模式另一个好处是简化的对象的创建，使得创建对象就像复制粘贴一样简单

不过原型模式很少单独使用，一般跟其他模式一起使用

原型模式设计到三个角色：
1. 客户角色

    客户提出创建对象的请求
2. 抽象原型角色
3. 具体原型角色

##原型模式的应用
java里的ArrayList，可以通过arrayList.clone()方法获取


