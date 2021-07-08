-- ********************************************************************
-- FileName： db.sql
-- Author: Andy
-- Date： 2021-05-08
-- Description： 服务数据模型创建脚本
-- Example: source db.sql  |  mysqldump -uroot -p -d demo > db.sql
-- 更新历史：
--      2021-05-08   创建
-- ********************************************************************

-- 创建测试表
CREATE TABLE `t_account` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `status` int DEFAULT '0' COMMENT '状态:0-有效，1-无效',
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

INSERT INTO demo.account(id, name, gender, age) VALUES('123', 'andy', 'm', 1);
