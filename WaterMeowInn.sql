/*
 Navicat Premium Data Transfer

 Source Server         : Local
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : WaterMeowInn

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 14/07/2022 17:28:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hotel
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `room_num` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '门牌号',
  `price` decimal(10,2) DEFAULT NULL,
  `type` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '0单人1双人大床2标间',
  `state` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '0未使用1已预订2已入住',
  PRIMARY KEY (`room_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of hotel
-- ----------------------------
BEGIN;
INSERT INTO `hotel` VALUES ('东八218', 1000.00, '1', '2');
INSERT INTO `hotel` VALUES ('东八219', 50.00, '1', '0');
INSERT INTO `hotel` VALUES ('东八220', 1000.00, '1', '1');
COMMIT;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` char(32) COLLATE utf8mb4_bin NOT NULL COMMENT 'uuid',
  `ali_id` char(28) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '支付宝订单',
  `user_id` int DEFAULT NULL COMMENT '用户id',
  `room_num` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '房间门牌号',
  `state` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT '0' COMMENT '0未支付1已支付2已完成3已退款',
  `price` decimal(10,2) DEFAULT NULL COMMENT '支付价钱',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of order
-- ----------------------------
BEGIN;
INSERT INTO `order` VALUES ('4960c4ff11a14f7cae2b62f29d975be5', NULL, 0, '东八219', '0', 50.00);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `birth` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  `mob` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `type` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '1234', '1234', '1314', '1', '13244', '321414', '2');
INSERT INTO `user` VALUES (2, 'admin', 'admin', 'admin', NULL, NULL, NULL, '1');
INSERT INTO `user` VALUES (3, '14323214', '14323214', '14321', '12', '32424', '2314', '2');
INSERT INTO `user` VALUES (4, '20191104844', 'qwer', '刺猬', '男', '2001-07-27', '17648277278', '2');
INSERT INTO `user` VALUES (5, '31421', '1324124', '12412', '2', '2342', '23414', '2');
INSERT INTO `user` VALUES (6, '321421', '2134321', '123421', '1', '1324213', '143241', '2');
INSERT INTO `user` VALUES (7, '3421412', '435343', '45354', '歪', '45345', '453535', '2');
INSERT INTO `user` VALUES (9, '520', '1314', '骆驼', '女', '2020-06-23', '12342134', '2');
INSERT INTO `user` VALUES (14, '4764', '4654', '64', '4564', '56465', '45', '2');
INSERT INTO `user` VALUES (16, '123456', '32142421', 'sb', '1', '1276', '637438736', '2');
INSERT INTO `user` VALUES (17, '123456', 'rewq', 'sbsbsb', '2', '786', '78698757', '2');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
