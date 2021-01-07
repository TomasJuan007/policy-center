CREATE TABLE `tb_rule` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `rule_id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '规则id',
  `app` varchar(255) NOT NULL DEFAULT '' COMMENT '接入方',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '规则/模式名称',
  `val` varchar(255) NOT NULL DEFAULT '' COMMENT '规则/模式内容',
  `op` varchar(255) NOT NULL DEFAULT '' COMMENT '关系运算符',
  `lft` bigint(20) unsigned NOT NULL DEFAULT '1' COMMENT '节点左值',
  `rgt` bigint(20) unsigned NOT NULL DEFAULT '2' COMMENT '节点右值',
  `lvl` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '节点层级',
  `is_deleted` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',blogsdb
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;