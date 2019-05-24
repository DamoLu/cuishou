/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : cuishou

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 18/05/2019 22:03:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wsxd_allocate_rule
-- ----------------------------
DROP TABLE IF EXISTS `wsxd_allocate_rule`;
CREATE TABLE `wsxd_allocate_rule`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(1) NOT NULL COMMENT '用于页面展示',
  `rule_describe` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort_key` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用于分案排序组合',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of wsxd_allocate_rule
-- ----------------------------
INSERT INTO `wsxd_allocate_rule` VALUES ('1', 1, '历史电催处理过的件优先分配至原对应阶段电催人员', '1', '李明', '2019-05-18 14:23:50', '李明', '0000-00-00 00:00:00', NULL, NULL);
INSERT INTO `wsxd_allocate_rule` VALUES ('2', 2, '同身份证号名下存在多笔逾期的，按最高逾期天数分配，分配给同一个催收员', '2', '李明', '2019-05-18 14:24:38', '李明', '0000-00-00 00:00:00', NULL, NULL);
INSERT INTO `wsxd_allocate_rule` VALUES ('3', 3, '按照逾期贷款余额在待分件人员中平均循环分案', '3', '李明', '2019-05-18 14:25:09', '李明', '0000-00-00 00:00:00', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
