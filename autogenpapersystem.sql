

DROP TABLE IF EXISTS `character`;


CREATE TABLE `character` (                      //题目特点表
  `Charact_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Charact_name` varchar(50) NOT NULL,                     
  PRIMARY KEY (`Charact_ID`)
)  


DROP TABLE IF EXISTS `difficulty`;
  
  
CREATE TABLE `difficulty` (                          //难度系数表
  `Difficulty_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Uplimit` double NOT NULL,                         //难度上限
  `Lowlimit` double NOT NULL,                       //难度下限
  PRIMARY KEY (`Difficulty_ID`)
)  

DROP TABLE IF EXISTS `grade`;                   
  
  
CREATE TABLE `grade` (                          //年级表
  `Crade_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Crade_name` varchar(10) NOT NULL,
  PRIMARY KEY (`Crade_ID`)
)  

DROP TABLE IF EXISTS `knowledge`;
  
  
CREATE TABLE `knowledge` (                         //知识点表
  `Knowledge_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Knowledge_name` varchar(100) NOT NULL,
  `Subject_ID` int(11) NOT NULL,                   //对应学科ID
  `Superior_ID` int(11) DEFAULT NULL,              //上级知识点ID
  PRIMARY KEY (`Knowledge_ID`)
)  


DROP TABLE IF EXISTS `questions`;
  
  
CREATE TABLE `questions` (                        //题目表
  `Questions_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Content` varchar(200) NOT NULL,                 //题目内容
  `Subject_ID` int(11) NOT NULL,                   //对应学科ID
  `Knowledge_ID1` int(11) DEFAULT NULL,            //对应知识点1
  `Knowledge_ID2` int(11) DEFAULT NULL,            //对应知识点2
  `Knowledge_ID3` int(11) DEFAULT NULL,            //对应知识点3
  `Knowledge_ID4` int(11) DEFAULT NULL,            //对应知识点4
  `Type_ID` int(11) NOT NULL,                      //对应题型
  `Difficulty_ID` int(11) NOT NULL,                //对应难度
  `Charact_ID` int(11) NOT NULL,                   //对应题目特点
  `Isdelete` tinyint(1) NOT NULL DEFAULT '0',      //状态
  PRIMARY KEY (`Questions_ID`)
)  


DROP TABLE IF EXISTS `subject`;
  
  
CREATE TABLE `subject` (                        //学科表
  `Subject_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Subject_name` varchar(20) NOT NULL,
  `Grade_ID` int(11) NOT NULL,                   //对应年级
  PRIMARY KEY (`Subject_ID`)
)  


DROP TABLE IF EXISTS `type`;
  
  
CREATE TABLE `type` (                       //题型表
  `Type_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type_name` varchar(20) NOT NULL,
  `Subject_ID` int(11) NOT NULL,             //对应学科
  PRIMARY KEY (`Type_ID`)
)  
