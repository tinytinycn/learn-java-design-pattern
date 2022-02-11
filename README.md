# Java 设计模式

## 遵循6个原则

1. 单一职责原则
2. 开发-封闭原则
3. 里氏代换原则
4. 依赖倒转原则
5. 迪米特原则
6. 合成/聚合复用原则

## UML类图中的几种关系

1. 泛化 Generalization
2. 实现 Realization
3. 关联 Association
4. 聚合 Aggregation
5. 组合 Composition
6. 依赖 Dependency

各种关系的强弱顺序: `泛化 = 实现 > 组合 > 聚合 > 关联 > 依赖`

## mermaid语法

1. 泛化

```mermaid
classDiagram
class A
class B
A <|-- B
```

2. 实现

```mermaid
classDiagram
class A
class B
A <|.. B
```

3. 组合

```mermaid
classDiagram
class A
class B
A "1" *--> "n"  B : has more B
```

4. 聚合

```mermaid
classDiagram
class A
class B
class C
A "1" o--> "1" B : has a B
A "1" o--> "n" C : has more C
```

5. 关联

```mermaid
classDiagram
class A
class B
A "n" <-- "1" B : has more A
```

6. 依赖

```mermaid
classDiagram
class A
class B
A <.. B : dependency A
```

举个例子:

```mermaid
classDiagram

class 氧气{
  -特征
  -操作()
}

class 水{
  -特征
  -操作()
}

class 动物{
  +生命
  +新陈代谢(int 氧气, int 水)
  +繁殖()
}

氧气 <.. 动物
水 <.. 动物

class 翅膀{
  -特征
  -操作()
}

class 鸟{
  +羽毛
  +下蛋()
}

鸟 "1" *-- "2" 翅膀
动物 <|-- 鸟

class 飞翔 {
  <<interface>>
  - 特性
  + 飞()
}

class 大雁{
  -特性
  +下蛋()
  +飞()
}

class 鸭子{
  -特性
  +下蛋()
}

class 企鹅{
  -特性
  +下蛋()
}

class 气候{
  -特性
  -操作()
}

气候 "1" <-- "1" 企鹅

飞翔 <|.. 大雁
鸟 <|-- 大雁
鸟 <|-- 鸭子
鸟 <|-- 企鹅

class 讲话{
  <<interface>>
  -特性
  +说话()
}

class 唐老鸭{
  -特性
  +说话()
}

鸭子 <|-- 唐老鸭
讲话 <|.. 唐老鸭

class 雁群{
  -特性
  -操作()
}

大雁 "n" o-- "1" 雁群

```

![example](img/example.png)

## 创建型(5个)

1. 工厂方法
2. 抽象工厂
3. 建造者
4. 原型
5. 单例

## 结构型(7个)

1. [适配器](src/adapter/adapter.md)
2. [桥接](src/bridge/bridge.md)
3. [组合](src/composite/composite.md)
4. [装饰](src/decorator/decorator.md)
5. [外观](src/facade/facade.md)
6. [享元](src/flyweight/flyweight.md)
7. [代理](src/proxy/proxy.md)

## 行为型(11个 )

1. [解释器](src/interpreter/interpreter.md)
2. [模板方法](src/template/template.md)
3. [责任链](src/chain/chain-of-responsibility.md)
4. [命令](src/command/command.md)
5. [迭代器](src/iterator/iterator.md)
6. [中介者](src/mediator/mediator.md)
7. 备忘录
8. [观察者](src/observer/observer.md)
9. [状态](src/state/state.md)
10. [策略](src/strategy/strategy.md)
11. 访问者