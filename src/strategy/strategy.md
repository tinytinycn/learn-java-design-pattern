# 策略模式 strategy

## 动机

- 完成一项任务，往往可以有多种不同的方式，每一种方式称为一个策略，我们可以根据环境或者条件的不同选择不同的策略来完成该项任务。
- 在软件开发中也常常遇到类似的情况，实现某一个功能有多个途径，此时可以使用一种设计模式来使得系统可以灵活地选择解决途径，也能够方便地增加新的解决途径。

## 定义

定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。

## 结构

策略模式包含如下角色:

- Context环境类
- Strategy抽象策略类
- ConcreteStrategy具体策略类

```mermaid
classDiagram

class Context{
  +algorithm() void
  +setStrategy(Strategy *) void
}

class Strategy{
  +algorithm() void
}

class ConcreteStrategyA{
  +algorithm() void
}

class ConcreteStrategyB{
  +algorithm() void
}

Context *--> Strategy : has more strategy
Strategy <|-- ConcreteStrategyA
Strategy <|-- ConcreteStrategyB
```

## 适用环境

- 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
- 一个系统需要动态地在几种算法中选择一种。
- 不希望客户端知道复杂的、与算法相关的数据结构，在具体策略类中封装算法和相关的数据结构，提高算法的保密性与安全性。
