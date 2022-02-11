# 中介者模式 mediator

## 动机

对象之间存在很强的关联性，将导致系统出现如下问题：

- 系统结构复杂：对象之间存在大量的相互关联和调用，若有一个对象发生变化，则需要跟踪和该对象关联的其他所有对象，并进行适当处理。
- 对象可重用性差：由于一个对象和其他对象具有很强的关联，若没有其他对象的支持，一个对象很难被另一个系统或模块重用，这些对象表现出来更像一个不可分割的整体，职责较为混乱。
- 系统扩展性低：增加一个新的对象需要在原有相关对象上增加引用，增加新的引用关系也需要调整原有对象，系统耦合度很高，对象操作很不灵活，扩展性差。
- 在面向对象的软件设计与开发过程中，根据“单一职责原则”，我们应该尽量将对象细化，使其只负责或呈现单一的职责。
- 对于一个模块，可能由很多对象构成，而且这些对象之间可能存在相互的引用，为了减少对象两两之间复杂的引用关系，使之成为一个松耦合的系统，我们需要使用中介者模式.

## 定义

用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。中介者模式又称为调停者模式。

## 结构

中介者模式包含如下角色: Mediator抽象中介者、ConcreteMediator具体中介者、Colleague抽象同事类、ConcreteColleague具体同事类
```mermaid
classDiagram

class Mediator{
  <<interface>>
  +operation() void
  +register(Colleague*) void
}

class ConcreteMediator{
  +operation() void
}

class Colleague{
  <<interface>>
  +setMediator(Mediator*) void
  +sendMsg(int) void
  +receiveMsg() void
}

class ConcreteColleagueA{
  +setMediator(Mediator*) void
  +sendMsg(int) void
}

class ConcreteColleagueB{
  +setMediator(Mediator*) void
  +sendMsg(int) void
}

Mediator <|-- ConcreteMediator
Colleague <|-- ConcreteColleagueA
Colleague <|-- ConcreteColleagueB

Mediator <-- Colleague : imforms
ConcreteMediator --> ConcreteColleagueA : updates
ConcreteMediator --> ConcreteColleagueB : updates


```

## 适用环境
- 系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解。
- 一个对象由于引用了其他很多对象并且直接和这些对象通信，导致难以复用该对象。
- 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。可以通过引入中介者类来实现，在中介者中定义对象。
- 交互的公共行为，如果需要改变行为则可以增加新的中介者类。

## 优点
- 简化对象之间的交互
- colleague解耦
- 减少重复的colleague子类产生
- 简化colleague类的设计和实现

## 缺点
- 中介者包含了交互细节，可能导致类的实现复杂度和维护成本