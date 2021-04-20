INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (1, 1, '', 'age', '18,35', 'btw', 1, 26, 0, 0, '2021-01-15 19:49:10', '2021-01-18 21:02:55');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (2, 1, '', 'age', '18,25', 'btw', 2, 9, 1, 0, '2021-01-15 19:49:10', '2021-01-18 21:03:00');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (3, 1, '', 'age', '18,35', 'btw', 10, 17, 1, 0, '2021-01-15 19:49:10', '2021-01-18 20:54:49');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (4, 1, '', 'age', '18,25', 'btw', 18, 25, 1, 0, '2021-01-15 19:49:10', '2021-01-18 20:54:57');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (5, 1, '', 'age', '18,25', 'btw', 3, 4, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (6, 1, '', 'age', '18,25', 'btw', 5, 6, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (7, 1, '', 'age', '18,25', 'btw', 7, 8, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (8, 1, '', 'age', '18,25', 'btw', 11, 12, 2, 0, '2021-01-15 19:49:10', '2021-01-18 20:55:01');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (9, 1, '', 'age', '18,35', 'btw', 13, 14, 2, 0, '2021-01-15 19:49:10', '2021-01-18 21:03:28');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (10, 1, '', 'age', '18,25', 'btw', 15, 16, 2, 0, '2021-01-15 19:49:10', '2021-01-18 20:55:07');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (11, 1, '', 'age', '18,25', 'btw', 19, 20, 2, 0, '2021-01-15 19:49:10', '2021-01-18 21:03:11');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (12, 1, '', 'age', '18,25', 'btw', 21, 22, 2, 0, '2021-01-15 19:49:10', '2021-01-18 21:03:13');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (13, 1, '', 'age', '18,25', 'btw', 23, 24, 2, 0, '2021-01-15 19:49:10', '2021-01-18 21:03:15');
/**
INSERT INTO `tb_rule` (`rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`)
VALUES
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 1, 26, 0, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 2, 9, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 10, 17, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 18, 25, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 3, 4, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 5, 6, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 7, 8, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 11, 12, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 13, 14, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 15, 16, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 19, 20, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 21, 22, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 23, 24, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10')
**/