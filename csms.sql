/*
 Navicat Premium Data Transfer

 Source Server         : MariaDB
 Source Server Type    : MariaDB
 Source Server Version : 100515 (10.5.15-MariaDB)
 Source Host           : localhost:3306
 Source Schema         : csms

 Target Server Type    : MariaDB
 Target Server Version : 100515 (10.5.15-MariaDB)
 File Encoding         : 65001

 Date: 08/12/2022 12:23:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for id_table
-- ----------------------------
DROP TABLE IF EXISTS `id_table`;
CREATE TABLE `id_table`  (
  `id` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `idtype` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  CONSTRAINT `idtype` CHECK (`idtype` = 0 or `idtype` = 1)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of id_table
-- ----------------------------
INSERT INTO `id_table` VALUES ('admin', '21232f297a57a5a74389', '12345@qq.com', 0);
INSERT INTO `id_table` VALUES ('yg000001', 'e8d511893411a69a92f8', '5678@qq.com', 1);
INSERT INTO `id_table` VALUES ('yg000002', '1cec773d3e178d1a48c8', '1431279@qq.com', 1);
INSERT INTO `id_table` VALUES ('yg000004', 'aa8f52608f4c62178362', '2342@qq.com', 1);

-- ----------------------------
-- Table structure for in_table
-- ----------------------------
DROP TABLE IF EXISTS `in_table`;
CREATE TABLE `in_table`  (
  `icode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pcode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(11) NOT NULL,
  `itime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `rcode` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stype` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ucode` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`icode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of in_table
-- ----------------------------
INSERT INTO `in_table` VALUES ('1670427034', 'pj00000001', 20, '2022-12-07 23:30:34', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670462041', 'pj00000001', 40, '2022-12-08 09:14:01', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670462410', 'pj00000001', 40, '2022-12-08 09:20:10', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670462573', 'pj00000001', 40, '2022-12-08 09:22:53', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670462906', 'pj00000001', 40, '2022-12-08 09:28:26', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670463006', 'pj00000001', 40, '2022-12-08 09:30:06', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670471383', 'pj00000001', 40, '2022-12-08 11:49:43', 'ck0001', '小型', 'yg000001');
INSERT INTO `in_table` VALUES ('1670471443', 'pj00000001', 40, '2022-12-08 11:50:43', 'ck0001', '小型', 'yg000001');

-- ----------------------------
-- Table structure for out_table
-- ----------------------------
DROP TABLE IF EXISTS `out_table`;
CREATE TABLE `out_table`  (
  `ocode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pcode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rcode` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(11) NOT NULL,
  `otime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `ucode` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ocode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of out_table
-- ----------------------------
INSERT INTO `out_table` VALUES ('1670424621', 'pj00000001', 'ck0001', 20, '2022-12-07 22:50:21', 'yg000001');
INSERT INTO `out_table` VALUES ('1670424737', 'pj00000001', 'ck0001', 20, '2022-12-07 22:52:17', 'yg000001');
INSERT INTO `out_table` VALUES ('1670424800', 'pj00000001', 'ck0001', 20, '2022-12-07 22:53:20', 'yg000001');
INSERT INTO `out_table` VALUES ('1670424847', 'pj00000001', 'ck0001', 20, '2022-12-07 22:54:07', 'yg000001');
INSERT INTO `out_table` VALUES ('1670424942', 'pj00000001', 'ck0001', 25, '2022-12-07 22:55:42', 'yg000001');
INSERT INTO `out_table` VALUES ('1670462076', 'pj00000001', 'ck0001', 20, '2022-12-08 09:14:36', 'yg000001');
INSERT INTO `out_table` VALUES ('1670471405', 'pj00000001', 'ck0001', 40, '2022-12-08 11:50:05', 'yg000001');
INSERT INTO `out_table` VALUES ('1670471466', 'pj00000001', 'ck0001', 30, '2022-12-08 11:51:06', 'yg000001');

-- ----------------------------
-- Table structure for pa_po_table
-- ----------------------------
DROP TABLE IF EXISTS `pa_po_table`;
CREATE TABLE `pa_po_table`  (
  `pcode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rcode` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `scode` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stype` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`pcode`, `rcode`, `scode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pa_po_table
-- ----------------------------
INSERT INTO `pa_po_table` VALUES ('pj00000001', 'ck0001', 'hj001', '小型', 20);
INSERT INTO `pa_po_table` VALUES ('pj00000001', 'ck0001', 'hj003', '小型', 20);
INSERT INTO `pa_po_table` VALUES ('pj00000002', 'ck0001', 'hj007', '中型', 40);
INSERT INTO `pa_po_table` VALUES ('pj00000002', 'ck0002', 'hj002', '大型', 60);

-- ----------------------------
-- Table structure for part_table
-- ----------------------------
DROP TABLE IF EXISTS `part_table`;
CREATE TABLE `part_table`  (
  `pcode` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配件号',
  `pname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ptype` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `manufacture` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `protime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE CURRENT_TIMESTAMP,
  `Warrantytime` int(11) NOT NULL,
  `info` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `size` int(11) NOT NULL COMMENT '一箱中有几个商品',
  PRIMARY KEY (`pcode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of part_table
-- ----------------------------
INSERT INTO `part_table` VALUES ('pj00000001', 'RTX4090', '显卡', '技嘉', '2022-12-06 08:47:16', 2, '无', 20);
INSERT INTO `part_table` VALUES ('pj00000002', 'i9-13900k', 'cpu', 'intel', '2022-12-07 18:18:49', 2, '散片', 40);
INSERT INTO `part_table` VALUES ('pj00000003', 'gpro wireless', '鼠标', '罗技', '2020-12-03 00:00:00', 2, '无线鼠标', 20);
INSERT INTO `part_table` VALUES ('pj00000004', '毒蝰v2', '鼠标', '雷蛇', '2022-12-01 18:14:51', 2, '三模鼠标', 20);
INSERT INTO `part_table` VALUES ('pj00000005', '达尔优A87', '键盘', '达尔优', '2022-12-06 18:16:17', 1, 'RGB炫光版', 10);
INSERT INTO `part_table` VALUES ('pj00000006', 'Ryzen 5 7600X', 'cpu', 'AMD', '2022-12-02 18:18:06', 2, '盒装', 20);
INSERT INTO `part_table` VALUES ('pj00000007', '友达IPS', '显示器', '雷神', '2022-11-09 18:20:30', 1, '240hz,ips,17英寸', 5);

-- ----------------------------
-- Table structure for sh_table
-- ----------------------------
DROP TABLE IF EXISTS `sh_table`;
CREATE TABLE `sh_table`  (
  `scode` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stype` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `snum` int(11) NULL DEFAULT NULL COMMENT '货架容量',
  PRIMARY KEY (`scode`) USING BTREE,
  CONSTRAINT `snum` CHECK (`snum` > 0)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sh_table
-- ----------------------------
INSERT INTO `sh_table` VALUES ('hj001', '小型', 20);
INSERT INTO `sh_table` VALUES ('hj002', '大型', 60);
INSERT INTO `sh_table` VALUES ('hj003', '小型', 20);
INSERT INTO `sh_table` VALUES ('hj004', '小型', 20);
INSERT INTO `sh_table` VALUES ('hj005', '小型', 20);
INSERT INTO `sh_table` VALUES ('hj006', '小型', 20);
INSERT INTO `sh_table` VALUES ('hj007', '中型', 40);

-- ----------------------------
-- Table structure for user_table
-- ----------------------------
DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table`  (
  `ucode` char(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rcode` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ucode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_table
-- ----------------------------
INSERT INTO `user_table` VALUES ('admin', '无', '仓库管理员', '12345567');
INSERT INTO `user_table` VALUES ('yg000001', 'ck0001', '张三', '12344566');
INSERT INTO `user_table` VALUES ('yg000002', 'ck0002', '李四', '12345679');
INSERT INTO `user_table` VALUES ('yg000004', 'ck0003', '王五', '41344134');

-- ----------------------------
-- Table structure for wh_table
-- ----------------------------
DROP TABLE IF EXISTS `wh_table`;
CREATE TABLE `wh_table`  (
  `whcode` char(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `whname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `snum` int(11) NOT NULL,
  `mnum` int(11) NOT NULL,
  `bnum` int(11) NOT NULL,
  PRIMARY KEY (`whcode`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wh_table
-- ----------------------------
INSERT INTO `wh_table` VALUES ('ck0001', '一号仓', '北京市海淀区', 10, 20, 40);
INSERT INTO `wh_table` VALUES ('ck0002', '二号仓', '北京市朝阳区', 30, 20, 50);
INSERT INTO `wh_table` VALUES ('ck0003', '三号仓', '北京市清河区', 40, 20, 10);

SET FOREIGN_KEY_CHECKS = 1;
