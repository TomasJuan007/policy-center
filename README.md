# policy-center
A rule engine based on Nested Set Model.

# NSM实现方式
基于多叉树的规则引擎
用一棵采用嵌套集合模型保存到数据库的多叉树表示一个规则
同一分支的模式（模式包含模式名称、参考值、关系运算符）是AND关系，不同分支的模式是OR关系
当一个事实可以从根节点匹配到叶子节点，则该事实匹配上这个规则
适合于(P11*P12*...*P1n)+(P21*P22*...P2n)+(Pm1*Pm2*...Pmn)这种模式的规则,'*'表示‘与’，'+'表示‘或’
可以转换成(P11+P12+...+P1n)*(P21+P22+...P2n)*(Pm1+Pm2+...Pmn)的模式

# Lane实现
参考开源实现——<https://gitee.com/NSMRule>

# 性能测试说明
- DataInitializer添加@Test初始化三层的三叉完全树
- 运行RuleFlowNSMServiceTest和RuleFlowLaneServiceTest

# 下一步
> 基于AST的规则引擎

支持完全的规则语法，用中间节点表示‘与’和‘或’，用叶子节点表示规则模式
