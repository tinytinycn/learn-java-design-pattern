# 观察者模式 observer

## 动机
建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应做出反应。在此，发生改变的对象称为观察目标，而被通知的对象称为观察者，一个观察目标可以对应多个观察者，而且这些观察者之间没有相互联系，可以根据需要增加和删除观察者，使得系统更易于扩展.

## 定义
定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。观察者模式又叫做发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。

## 结构
观察者模式包含以下角色: Subject目标、ConcreteSubject具体目标、Observer观察者、ConcreteObserver具体观察者
```mermaid
classDiagram

class Subject{
  -observerList List<Observer*>
  +attach(Observer) void
  +detach(Observer) void
  +notify() void
}

class ConcreteSubject{
  -state int
  +getState() void
  +setState() void
}

class Observer{
  <<interface>>
  +update() void
}

class ConcreteObserver{
  -observerState int
  +update() void
}

Subject --> Observer : has more observers
Subject <|-- ConcreteSubject
Observer <|-- ConcreteObserver
ConcreteSubject <-- ConcreteObserver : has a subject

```

## 适用环境
- 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
- 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
- 一个对象必须通知其他对象，而并不知道这些对象是谁。
- 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。

