# 外观模式 facade
## 动机

## 定义
外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

## 结构
外观模式包含以下角色: Facade外观角色、SubSystem子系统角色

```mermaid
classDiagram

class Facade{
  +wrapOperation() void
}

class SubSystemA{
  +operationA void
}

class SubSystemB{
  +operationB void
}

class SubSystemC{
  +operationC void
}

class Client

Client ..> Facade
Facade --> SubSystemA
Facade --> SubSystemB
Facade --> SubSystemC
```

![facade](../../img/facade.png)

## 适用环境
- 当要为一个复杂子系统提供一个简单接口时可以使用外观模式。该接口可以满足大多数用户的需求，而且用户也可以越过外观类直接访问子系统。
- 客户程序与多个子系统之间存在很大的依赖性。引入外观类将子系统与客户以及其他子系统解耦，可以提高子系统的独立性和可移植性。
- 在层次化结构中，可以使用外观模式定义系统中每一层的入口，层与层之间不直接产生联系，而通过外观类建立联系，降低层之间的耦合度。