/*
DataSourceInitializer 这个类来生成建表语句 建表语句可以命名为schema或者schema-all放在resource文件夹下

Date: 2019-04-11 21:26:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'zhangsan', null);
INSERT INTO `customer` VALUES ('2', '李四', null);
INSERT INTO `customer` VALUES ('3', '王武', null);
INSERT INTO `customer` VALUES ('4', null, null);
