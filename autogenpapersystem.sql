/*
Navicat MySQL Data Transfer

Source Server         : pi_mysql
Source Server Version : 50552
Source Host           : 10.7.90.140:3306
Source Database       : autogenpapersystem

Target Server Type    : MYSQL
Target Server Version : 50552
File Encoding         : 65001

Date: 2016-10-14 13:15:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for charaction
-- ----------------------------
DROP TABLE IF EXISTS `charaction`;
CREATE TABLE `charaction` (
  `Charact_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Charact_name` varchar(50) NOT NULL,
  PRIMARY KEY (`Charact_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of charaction
-- ----------------------------
INSERT INTO `charaction` VALUES ('1', '历年高考真题');
INSERT INTO `charaction` VALUES ('2', '名校模拟');
INSERT INTO `charaction` VALUES ('3', '原创');

-- ----------------------------
-- Table structure for difficulty
-- ----------------------------
DROP TABLE IF EXISTS `difficulty`;
CREATE TABLE `difficulty` (
  `Difficulty_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uplimit` double NOT NULL,
  `Lowlimit` double NOT NULL,
  `Describe` varchar(10) NOT NULL,
  PRIMARY KEY (`Difficulty_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of difficulty
-- ----------------------------
INSERT INTO `difficulty` VALUES ('1', '1', '0.86', '容易');
INSERT INTO `difficulty` VALUES ('2', '0.85', '0.71', '较易');
INSERT INTO `difficulty` VALUES ('3', '0.7', '0.56', '中等');
INSERT INTO `difficulty` VALUES ('4', '0.55', '0.41', '较难');
INSERT INTO `difficulty` VALUES ('5', '0.4', '0.26', '困难');

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `Grade_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Grade_name` varchar(10) NOT NULL,
  PRIMARY KEY (`Grade_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '高中');
INSERT INTO `grade` VALUES ('2', '初中');
INSERT INTO `grade` VALUES ('3', '小学');

-- ----------------------------
-- Table structure for knowledge
-- ----------------------------
DROP TABLE IF EXISTS `knowledge`;
CREATE TABLE `knowledge` (
  `Knowledge_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Knowledge_name` varchar(100) NOT NULL,
  `Subject_ID` int(11) NOT NULL,
  `Superior_ID` int(11) DEFAULT '0',
  PRIMARY KEY (`Knowledge_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of knowledge
-- ----------------------------
INSERT INTO `knowledge` VALUES ('1', '基础知识及语言表达', '1', '0');
INSERT INTO `knowledge` VALUES ('2', '常用字的字音', '1', '1');
INSERT INTO `knowledge` VALUES ('3', '扩展语句、压缩语段', '1', '1');
INSERT INTO `knowledge` VALUES ('4', '语言表达', '1', '3');
INSERT INTO `knowledge` VALUES ('5', '诗歌鉴赏', '1', '0');
INSERT INTO `knowledge` VALUES ('6', '文言文阅读', '1', '0');
INSERT INTO `knowledge` VALUES ('7', '现代文阅读', '1', '0');
INSERT INTO `knowledge` VALUES ('11', '词汇', '3', '0');
INSERT INTO `knowledge` VALUES ('12', '完形填空', '3', '0');
INSERT INTO `knowledge` VALUES ('13', '阅读理解', '3', '0');
INSERT INTO `knowledge` VALUES ('14', '导数与函数', '2', '0');
INSERT INTO `knowledge` VALUES ('15', '三角函数', '2', '0');
INSERT INTO `knowledge` VALUES ('16', '拼写', '3', '11');
INSERT INTO `knowledge` VALUES ('17', '断句', '1', '6');
INSERT INTO `knowledge` VALUES ('18', '解三角形', '2', '15');
INSERT INTO `knowledge` VALUES ('19', '函数', '2', '14');
INSERT INTO `knowledge` VALUES ('20', '文学类', '1', '7');
INSERT INTO `knowledge` VALUES ('21', '细胞的分子组成', '6', '0');
INSERT INTO `knowledge` VALUES ('22', '蛋白质、核酸的结构和功能', '6', '21');
INSERT INTO `knowledge` VALUES ('23', '糖类、脂肪的种类和作用', '6', '21');
INSERT INTO `knowledge` VALUES ('24', '经济生活', '8', '0');
INSERT INTO `knowledge` VALUES ('25', '生活与消费', '8', '24');
INSERT INTO `knowledge` VALUES ('26', '导数', '2', '14');
INSERT INTO `knowledge` VALUES ('27', '极限', '2', '14');
INSERT INTO `knowledge` VALUES ('28', '解析式', '2', '19');
INSERT INTO `knowledge` VALUES ('29', '反函数', '2', '19');

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions` (
  `Questions_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Content` varchar(200) COLLATE utf8_bin NOT NULL,
  `Subject_ID` int(11) NOT NULL DEFAULT '0',
  `Knowledge_ID1` int(11) DEFAULT '0',
  `Knowledge_ID2` int(11) DEFAULT '0',
  `Knowledge_ID3` int(11) DEFAULT '0',
  `Knowledge_ID4` int(11) DEFAULT '0',
  `Type_ID` int(11) NOT NULL DEFAULT '0',
  `Difficulty_ID` int(11) NOT NULL DEFAULT '0',
  `Charact_ID` int(11) NOT NULL DEFAULT '0',
  `Isdelete` tinyint(1) NOT NULL DEFAULT '0',
  `Answer` varchar(100) COLLATE utf8_bin DEFAULT '略',
  PRIMARY KEY (`Questions_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of questions
-- ----------------------------
INSERT INTO `questions` VALUES ('1', 'qewretyytiyopi', '1', '1', '3', '4', '0', '1', '5', '3', '0', '略');
INSERT INTO `questions` VALUES ('2', 'uijsidofoei', '3', '2', '0', '0', '0', '3', '4', '1', '0', '略');
INSERT INTO `questions` VALUES ('3', 'dajfioef', '4', '6', '0', '0', '0', '8', '3', '3', '0', '略');
INSERT INTO `questions` VALUES ('4', 'ffbfb', '5', '2', '0', '0', '0', '7', '2', '2', '0', '略');
INSERT INTO `questions` VALUES ('8', 'dfefdfef', '6', '11', '16', '0', '0', '6', '3', '1', '0', '略');
INSERT INTO `questions` VALUES ('9', 'ghdjghg', '3', '9', '0', '0', '0', '13', '3', '2', '0', '略');
INSERT INTO `questions` VALUES ('10', 'trhtjfgt', '4', '7', '0', '0', '0', '18', '1', '3', '0', '略');
INSERT INTO `questions` VALUES ('11', 'fghhgjdgh', '6', '5', '0', '0', '0', '17', '3', '2', '0', '略');
INSERT INTO `questions` VALUES ('12', 'vbvbb', '1', '3', '0', '0', '0', '16', '4', '1', '0', '略');
INSERT INTO `questions` VALUES ('13', '唐诗', '1', '5', '0', '0', '0', '2', '2', '1', '0', '略');
INSERT INTO `questions` VALUES ('14', '修改病句', '1', '3', '4', '0', '0', '6', '3', '2', '0', '略');
INSERT INTO `questions` VALUES ('15', '幂函数', '2', '14', '19', '0', '0', '2', '2', '2', '0', '略');
INSERT INTO `questions` VALUES ('16', '测试题目', '1', '1', '3', '4', '0', '1', '5', '3', '0', '略');
INSERT INTO `questions` VALUES ('17', '测试2', '6', '11', '16', '0', '0', '6', '3', '1', '0', '略');
INSERT INTO `questions` VALUES ('18', '测试题目内容2', '6', '11', '16', '0', '0', '6', '3', '1', '0', '略');
INSERT INTO `questions` VALUES ('19', '11', '2', '14', '19', '0', '0', '1', '5', '3', '0', '略');
INSERT INTO `questions` VALUES ('20', 'tsest111', '1', '1', '3', '4', '0', '1', '5', '3', '0', '略');
INSERT INTO `questions` VALUES ('21', '蛋白质', '6', '21', '22', '0', '0', '1', '4', '3', '0', '略');
INSERT INTO `questions` VALUES ('22', '糖类de zhonglei', '6', '21', '23', '0', '0', '19', '1', '2', '0', '略');
INSERT INTO `questions` VALUES ('23', '货币de jiazhi', '8', '24', '25', '0', '0', '19', '3', '2', '0', '略');
INSERT INTO `questions` VALUES ('24', '消费zenmesuan', '8', '24', '25', '0', '0', '19', '5', '1', '0', '略');
INSERT INTO `questions` VALUES ('25', '极限的定义', '2', '14', '26', '0', '0', '20', '3', '3', '0', '略');
INSERT INTO `questions` VALUES ('26', 'hanshujiexishi', '2', '14', '19', '0', '0', '19', '4', '2', '0', '略');
INSERT INTO `questions` VALUES ('27', '反函数的性质', '2', '14', '19', '29', '0', '9', '2', '1', '0', '略');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `Subject_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Subject_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `Grade_ID` int(11) NOT NULL,
  PRIMARY KEY (`Subject_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('1', '语文', '1');
INSERT INTO `subject` VALUES ('2', '数学', '2');
INSERT INTO `subject` VALUES ('3', '英语', '1');
INSERT INTO `subject` VALUES ('4', '物理', '1');
INSERT INTO `subject` VALUES ('5', '化学', '3');
INSERT INTO `subject` VALUES ('6', '生物', '3');
INSERT INTO `subject` VALUES ('7', '科学', '2');
INSERT INTO `subject` VALUES ('8', '政治', '1');

-- ----------------------------
-- Table structure for types
-- ----------------------------
DROP TABLE IF EXISTS `types`;
CREATE TABLE `types` (
  `Type_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `Subject_ID` int(11) NOT NULL,
  PRIMARY KEY (`Type_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of types
-- ----------------------------
INSERT INTO `types` VALUES ('1', '单选题', '1');
INSERT INTO `types` VALUES ('2', '现代文阅读', '1');
INSERT INTO `types` VALUES ('3', '文言文阅读', '1');
INSERT INTO `types` VALUES ('4', '默写', '1');
INSERT INTO `types` VALUES ('5', '诗歌鉴赏', '1');
INSERT INTO `types` VALUES ('6', '语言表达', '1');
INSERT INTO `types` VALUES ('7', '名著导读', '1');
INSERT INTO `types` VALUES ('8', '作文', '1');
INSERT INTO `types` VALUES ('10', '集合与常用逻辑用语', '2');
INSERT INTO `types` VALUES ('11', '函数与导数', '2');
INSERT INTO `types` VALUES ('12', '三角函数', '2');
INSERT INTO `types` VALUES ('13', '词汇', '3');
INSERT INTO `types` VALUES ('14', '阅读理解', '3');
INSERT INTO `types` VALUES ('15', '完形填空', '3');
INSERT INTO `types` VALUES ('16', '机械能', '4');
INSERT INTO `types` VALUES ('17', '电场', '4');
INSERT INTO `types` VALUES ('18', '电路', '4');
INSERT INTO `types` VALUES ('19', '解答题', '8');
INSERT INTO `types` VALUES ('20', '计算题', '2');
