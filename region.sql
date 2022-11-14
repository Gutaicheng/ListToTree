/*
 Navicat Premium Data Transfer

 Source Server         : txYun
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : 43.139.151.174:3306
 Source Schema         : testlist

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 14/11/2022 17:32:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region`  (
  `id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `pid` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `abbreviation` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('10000', '中国', '0', '中国');
INSERT INTO `region` VALUES ('10001', '湖南', '10000', '湘');
INSERT INTO `region` VALUES ('1000101', '长沙', '10001', '长沙');
INSERT INTO `region` VALUES ('10002', '湖北', '10000', '鄂');
INSERT INTO `region` VALUES ('1000201', '武汉', '10002', '武汉');
INSERT INTO `region` VALUES ('10003', '江西', '10000', '赣');
INSERT INTO `region` VALUES ('1000301', '南昌', '10003', '南昌');

SET FOREIGN_KEY_CHECKS = 1;
