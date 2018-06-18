/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50545
Source Host           : localhost:3306
Source Database       : myshiro

Target Server Type    : MYSQL
Target Server Version : 50545
File Encoding         : 65001

Date: 2018-06-18 22:35:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_permisson
-- ----------------------------
DROP TABLE IF EXISTS `sys_permisson`;
CREATE TABLE `sys_permisson` (
  `p_code` varchar(50) NOT NULL COMMENT '权限标识',
  `p_name` varchar(100) DEFAULT NULL COMMENT '权限名称',
  PRIMARY KEY (`p_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_permisson
-- ----------------------------
INSERT INTO `sys_permisson` VALUES ('1', '用户管理页面');
INSERT INTO `sys_permisson` VALUES ('2', '新增用户');
INSERT INTO `sys_permisson` VALUES ('3', '角色管理页面');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_code` varchar(50) NOT NULL COMMENT '角色标识',
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('administrator', '管理员');
INSERT INTO `sys_role` VALUES ('rolemanage', '角色管理员');
INSERT INTO `sys_role` VALUES ('usermanage', '用户管理员');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_code` varchar(50) NOT NULL COMMENT '角色标识',
  `p_code` varchar(50) NOT NULL COMMENT '权限标识',
  PRIMARY KEY (`role_code`,`p_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关系表';

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('administrator', '1');
INSERT INTO `sys_role_permission` VALUES ('administrator', '2');
INSERT INTO `sys_role_permission` VALUES ('administrator', '3');
INSERT INTO `sys_role_permission` VALUES ('rolemanage', '3');
INSERT INTO `sys_role_permission` VALUES ('usermanage', '1');
INSERT INTO `sys_role_permission` VALUES ('usermanage', '2');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `gender` tinyint(4) DEFAULT NULL COMMENT '性别（0：女；1：男；）',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `actual_name` varchar(50) DEFAULT NULL COMMENT '实际名称',
  `status` tinyint(4) DEFAULT NULL COMMENT '是否可用（0：不可用；1：可用；）',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uk_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '123', '0', null, '管理员', '1');
INSERT INTO `sys_user` VALUES ('4', 'abc', '123', '1', null, 'abc', '1');
INSERT INTO `sys_user` VALUES ('5', 'local', '123', '0', null, '本地人员', '1');
INSERT INTO `sys_user` VALUES ('6', 'zhang3', '123', '1', null, '张三', '1');
INSERT INTO `sys_user` VALUES ('7', 'li4', '123', '0', null, '李四', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` int(11) NOT NULL,
  `role_code` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`,`role_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', 'administrator');
INSERT INTO `sys_user_role` VALUES ('6', 'rolemanage');
INSERT INTO `sys_user_role` VALUES ('7', 'usermanage');
