# 适配器模式 adapter
## 动机
通常情况下，客户端可以通过目标类的接口访问它所提供的服务。有时，现有的类可以满足客户类的功能需要，但是它所提供的接口不一定是客户类所期望的，这可能是因为现有类中方法名与目标类中定义的方法名不一致等原因所导致的。

在这种情况下，现有的接口需要转化为客户类期望的接口，这样保证了对现有类的重用。如果不进行这样的转化，客户类就不能利用现有类所提供的功能，适配器模式可以完成这样的转化。

当客户类调用适配器的方法时，在适配器类的内部将调用适配者类的方法，而这个过程对客户类是透明的，客户类并不直接访问适配者类。因此，适配器可以使由于接口不兼容而不能交互的类可以一起工作。

## 定义
将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。

## 结构
适配器模式包含如下角色: Target目标抽象类、Adapter适配器类、Adaptee适配者类、Client客户类

对象适配器：
```mermaid
classDiagram

class Target{
  <<interface>>
  +request() void
}

class Adapter{
  -adapter Adapter
  +request() void
}

class Adaptee{
  +specialRequest() void
}

class Client

Client ..> Target
Target <|-- Adapter
Adapter --> Adaptee : has a adaptee
```
类适配器：
```mermaid
classDiagram

class Target{
  <<interface>>
  +request() void
}

class Adapter{
  +request() void
}

class Adaptee{
  +specialRequest() void
}

class Client

Client ..> Target
Target <|-- Adapter
Adaptee <|-- Adapter


```
## 适用环境

- 系统需要使用现有的类，而这些类的接口不符合系统的需要。
- 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。