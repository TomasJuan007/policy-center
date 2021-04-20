INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (1, 1, '', '', '', 'AND', 1, 26, 0, 0, '2021-01-15 19:49:10', '2021-01-20 16:47:25');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (2, 1, '', '', '', 'OR', 2, 9, 1, 0, '2021-01-15 19:49:10', '2021-01-20 16:47:17');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (3, 1, '', '', '', 'AND', 10, 17, 1, 0, '2021-01-15 19:49:10', '2021-01-20 16:47:22');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (4, 1, '', '', '', 'OR', 18, 25, 1, 0, '2021-01-15 19:49:10', '2021-01-20 16:47:18');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (5, 1, '', 'age', '18,25', 'btw', 3, 4, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:02');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (6, 1, '', 'age', '18,25', 'btw', 5, 6, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:06');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (7, 1, '', 'age', '18,35', 'btw', 7, 8, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:09');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (8, 1, '', 'age', '18,35', 'btw', 11, 12, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:35');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (9, 1, '', 'age', '18,35', 'btw', 13, 14, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:38');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (10, 1, '', 'age', '18,35', 'btw', 15, 16, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:42');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (11, 1, '', 'age', '18,25', 'btw', 19, 20, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:46');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (12, 1, '', 'age', '18,25', 'btw', 21, 22, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:49:50');
INSERT INTO `tb_rule` (`id`, `rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`) VALUES (13, 1, '', 'age', '18,35', 'btw', 23, 24, 2, 0, '2021-01-15 19:49:10', '2021-01-20 16:50:11');
/*
INSERT INTO `tb_rule` (`rule_id`, `app`, `name`, `val`, `op`, `lft`, `rgt`, `lvl`, `is_deleted`, `created_at`, `updated_at`)
VALUES
(#{ruleId,jdbcType=BIGINT}, '', '', '', 'AND', 1, 26, 0, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', '', '', 'OR', 2, 9, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', '', '', 'AND', 10, 17, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', '', '', 'OR', 18, 25, 1, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 3, 4, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 5, 6, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 7, 8, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 11, 12, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 13, 14, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 15, 16, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 19, 20, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,25', 'btw', 21, 22, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10'),
(#{ruleId,jdbcType=BIGINT}, '', 'age', '18,35', 'btw', 23, 24, 2, 0, '2021-01-15 19:49:10', '2021-01-15 19:49:10')
*/