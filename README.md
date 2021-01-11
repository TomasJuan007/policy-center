# policy-center
A rule engine based on Nested Set Model.

# NSM实现方式（TODO）
基于多叉树的规则引擎
用一棵采用嵌套集合模型保存到数据库的多叉树表示一个规则
同一分支的模式（模式包含模式名称、参考值、关系运算符）是AND关系，不同分支的模式是OR关系
当一个事实可以从根节点匹配到叶子节点，则该事实匹配上这个规则