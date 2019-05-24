/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : cuishou

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 24/05/2019 14:39:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wsxd_allocate_group
-- ----------------------------
DROP TABLE IF EXISTS `wsxd_allocate_group`;
CREATE TABLE `wsxd_allocate_group`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物理主键',
  `group_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理组名',
  `odvs` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人员组',
  `odvs_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理人员组（姓名）',
  `min_overdue_day` int(11) NULL DEFAULT NULL COMMENT '逾期范围下限',
  `max_overdue_day` int(11) NULL DEFAULT NULL COMMENT '逾期范围上限',
  `app_org` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '案件范围(机构)',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '当前状态 1-启用 0-禁用',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标记 默认 0-正常 1-删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of wsxd_allocate_group
-- ----------------------------
INSERT INTO `wsxd_allocate_group` VALUES ('994eec780b20416fa192eb0bcfb78d69', '处理组11111111111', '24540018|24540017|24540013|24210011|24210014|24210020', '武超|焦东|李文海|张庆玉|何剑朝|谢婷', 1, 3, '01', '0', 'admin', '2019-05-22 14:35:47', 'admin', '2019-05-24 13:32:37', NULL, '0');
INSERT INTO `wsxd_allocate_group` VALUES ('9b7d385df6554da2af308aa07aca070b', '处理组0000', '24130014|24130017', '王磊|靳雅琴', 1, 3, '01|02|03|04', '1', 'admin', '2019-05-24 12:06:36', NULL, '2019-05-24 12:06:36', NULL, '0');
INSERT INTO `wsxd_allocate_group` VALUES ('cabb6855d5414e33996742d7add5927e', '处理组222333', '24110010|24110011|24620016', '王浩然|吴佳沂|刘恒', 11, 15, '01|02|03', '1', 'admin', '2019-05-23 14:43:58', 'admin', '2019-05-24 12:04:26', NULL, '0');
INSERT INTO `wsxd_allocate_group` VALUES ('e142c7f6721f418d9b41982813bc9ac1', '处理组1', '24540014', '钱海余', 5, 10, '02', '1', 'admin', '2019-05-22 14:36:46', NULL, '2019-05-22 14:36:46', NULL, '0');

SET FOREIGN_KEY_CHECKS = 1;
