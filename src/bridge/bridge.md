# 桥接模式 bridge
## 动机
设想如果要绘制矩形、圆形、椭圆、正方形，我们至少需要4个形状类，但是如果绘制的图形需要具有不同的颜色，如红色、绿色、蓝色等，此时至少有如下两种设计方案：

- 第一种设计方案是为每一种形状都提供一套各种颜色的版本。
- 第二种设计方案是根据实际需要对形状和颜色进行组合

对于有两个变化维度（即两个变化的原因）的系统，采用方案二来进行设计系统中类的个数更少，且系统扩展更为方便。设计方案二即是桥接模式的应用。桥接模式将继承关系转换为关联关系，从而降低了类与类之间的耦合，减少了代码编写量。

## 定义
将抽象部分与它的实现部分分离，使它们都可以独立地变化。

## 结构
桥接模式包含如下角色: Abstraction抽象类、RefinedAbstraction扩充抽象类、Implementor实现类接口、ConcreteImplementor具体实现类
```mermaid
classDiagram

class Abstraction{
  -pImp Implementor
  +Abstraction(Implementor) void
  +operation() void
}

class RefinedAbstraction{
  +RefinedAbstraction(Implementor)
  +operation() void
}

class Implementor{
  <<interface>>
  +operationImp() void
}

class ConcreteImplementorA{
  +operationImp() void
}

class ConcreteImplementorB{
  +operationImp() void
}

class Client

Client ..> Abstraction
Abstraction <|-- RefinedAbstraction
Abstraction o--> Implementor : aggregation a interface
Implementor <|.. ConcreteImplementorA
Implementor <|.. ConcreteImplementorB
```
![bridge](../../img/bridge.png)

## 适用环境
- 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
- 抽象化角色和实现化角色可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合。
- 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
- 虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
- 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。