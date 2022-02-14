# 建造者模式 builder

## 动机
无论是在现实世界中还是在软件系统中，都存在一些复杂的对象，它们拥有多个组成部分，如汽车，它包括车轮、方向盘、发送机等各种部件。而对于大多数用户而言，无须知道这些部件的装配细节，也几乎不会使用单独某个部件，而是使用一辆完整的汽车，可以通过建造者模式对其进行设计与描述，建造者模式可以将部件和其组装过程分开，一步一步创建一个复杂的对象。用户只需要指定复杂对象的类型就可以得到该对象，而无须知道其内部的具体构造细节。

## 定义
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。

## 结构
建造者模式包含如下角色:
- Builder抽象建造者
- ConcreteBuilder具体建造者
- Director指挥者
- Product产品角色

```mermaid
classDiagram

class Builder{
  +buildPartA() void
  +buildPartB() void
  +buildPartC() void
  +getResult() void
}

class ConcreteBuilder{
  -product Product
  +buildPartA() void
  +buildPartB() void
  +buildPartC() void
}

class Director{
  -pBuilder Builder*
  +construct() Product*
  +setBuilder(Builder*) Product
}

class Product

Director *-- Builder : has a builder
Builder <|.. ConcreteBuilder
ConcreteBuilder ..> Product
```


## 适用环境

