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

 Date: 01/06/2019 18:18:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wsxd_allocate_group_scope
-- ----------------------------
DROP TABLE IF EXISTS `wsxd_allocate_group_scope`;
CREATE TABLE `wsxd_allocate_group_scope`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物理主键',
  `group_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理组名',
  `group_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理组id',
  `app_org` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机构 01:网商 02:玖康 03:分蛋 04:嘉禾 05: 机构一商润贷 app:app',
  `app_org_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '机构名',
  `department_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事业部',
  `department_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '事业部名',
  `has_common_pool` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否含公共池,0:是1:否 2:全部',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除标记 默认 0-正常 1-删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分案处理组案件范围表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of wsxd_allocate_group_scope
-- ----------------------------
INSERT INTO `wsxd_allocate_group_scope` VALUES ('1', '处理组1', '1', '01', '网商', '123', '研发', '0', 'luqihua', '2019-05-31 20:31:14', 'luqihua', '2019-05-31 20:31:14', NULL, NULL);
INSERT INTO `wsxd_allocate_group_scope` VALUES ('2', '处理组1', '1', '02', '九康', '3564', '催收', '1', 'luqihua', '2019-05-31 20:33:00', 'luqihua', '2019-05-31 20:33:00', '', '');

SET FOREIGN_KEY_CHECKS = 1;
