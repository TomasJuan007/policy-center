# policy-center
A rule engine based on Nested Set Model.

# NSM实现方式
> 基于多叉树的规则引擎

用一棵采用嵌套集合模型保存到数据库的多叉树表示一个规则，不同分支的<abbr title="规则模式包含模式名称、参考值、关系运算符">规则模式</abbr>是OR关系，同一分支的规则模式是AND关系，也可以用不同分支表示AND关系，同一分支表示OR关系，称前者为OR模式，后者为AND模式.  
- OR模式：
    - 当一个事实可以从根节点匹配到叶子节点，则该事实匹配上这个规则
    - 适合于类似`(P11&&P12&&...&&P1n)||(P21&&P22&&...P2n)||(Pm1&&Pm2&&...Pmn)`的模式
    - 不适合类似`(P1||P2)&&(P3||P4)`的模式
- AND模式：
    - 子树的状态可以转移到子树的根节点，匹配到达时，根节点状态为匹配或下级节点状态为匹配时满足条件
    - 适合于类似`(P11||P12||...||P1n)&&(P21||P22||...P2n)&&(Pm1||Pm2||...Pmn)`的模式
    - 不适合类似`(P1&&P2)||(P3&&P4)`的模式

#Lane实现
参考开源实现——<https://gitee.com/NSMRule>

#性能测试说明
- DataInitializer添加@Test初始化三层的三叉完全树
- 运行RuleFlowNSMServiceTest和RuleFlowLaneServiceTest

#下一步
> 基于AST的规则引擎

支持完全的规则语法，用中间节点表示‘与’和‘或’，用叶子节点表示规则模式
