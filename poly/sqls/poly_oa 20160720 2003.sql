-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.20


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema poly
--

CREATE DATABASE IF NOT EXISTS poly;
USE poly;

--
-- Definition of table `t_poly_dept`
--

DROP TABLE IF EXISTS `t_poly_dept`;
CREATE TABLE `t_poly_dept` (
  `deptno` varchar(45) NOT NULL COMMENT '部门编号',
  `deptname` varchar(45) NOT NULL COMMENT '部门名称',
  `location` varchar(60) NOT NULL COMMENT '部门所在的位置',
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa部门表';

--
-- Dumping data for table `t_poly_dept`
--

/*!40000 ALTER TABLE `t_poly_dept` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_dept` ENABLE KEYS */;


--
-- Definition of table `t_poly_dictionary`
--

DROP TABLE IF EXISTS `t_poly_dictionary`;
CREATE TABLE `t_poly_dictionary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dict_options` varchar(45) NOT NULL COMMENT '字典项，下拉框中的内容',
  `dict_code` varchar(45) NOT NULL COMMENT '字典类别的代码',
  PRIMARY KEY (`id`),
  KEY `FK_t_poly_dictionary_type` (`dict_code`),
  CONSTRAINT `FK_t_poly_dictionary_type` FOREIGN KEY (`dict_code`) REFERENCES `t_poly_dictionary_type` (`dictionary_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';

--
-- Dumping data for table `t_poly_dictionary`
--

/*!40000 ALTER TABLE `t_poly_dictionary` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_dictionary` ENABLE KEYS */;


--
-- Definition of table `t_poly_dictionary_type`
--

DROP TABLE IF EXISTS `t_poly_dictionary_type`;
CREATE TABLE `t_poly_dictionary_type` (
  `dictionary_code` varchar(45) NOT NULL COMMENT '字典类别代码',
  `dictionary_name` varchar(45) NOT NULL COMMENT '字典类别名称',
  PRIMARY KEY (`dictionary_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类别表';

--
-- Dumping data for table `t_poly_dictionary_type`
--

/*!40000 ALTER TABLE `t_poly_dictionary_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_dictionary_type` ENABLE KEYS */;


--
-- Definition of table `t_poly_model_nodes`
--

DROP TABLE IF EXISTS `t_poly_model_nodes`;
CREATE TABLE `t_poly_model_nodes` (
  `model_no` varchar(45) NOT NULL COMMENT '模板代码',
  `uid` int(10) unsigned NOT NULL COMMENT '审批人',
  `levels` tinyint(3) unsigned NOT NULL COMMENT '第几审批人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='付款申请模板节点表';

--
-- Dumping data for table `t_poly_model_nodes`
--

/*!40000 ALTER TABLE `t_poly_model_nodes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_model_nodes` ENABLE KEYS */;


--
-- Definition of table `t_poly_official_documents_attachments`
--

DROP TABLE IF EXISTS `t_poly_official_documents_attachments`;
CREATE TABLE `t_poly_official_documents_attachments` (
  `official_documents_no` varchar(45) NOT NULL COMMENT '批文编号',
  `official_documents_attachment_name` varchar(200) NOT NULL COMMENT '批文附件名称'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa的批文附件表';

--
-- Dumping data for table `t_poly_official_documents_attachments`
--

/*!40000 ALTER TABLE `t_poly_official_documents_attachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_official_documents_attachments` ENABLE KEYS */;


--
-- Definition of table `t_poly_payment_contract_attachment`
--

DROP TABLE IF EXISTS `t_poly_payment_contract_attachment`;
CREATE TABLE `t_poly_payment_contract_attachment` (
  `contractno` varchar(45) NOT NULL COMMENT '合同编号',
  `contract_attachment_name` varchar(200) NOT NULL COMMENT '合同附件名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa合同附件表';

--
-- Dumping data for table `t_poly_payment_contract_attachment`
--

/*!40000 ALTER TABLE `t_poly_payment_contract_attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_payment_contract_attachment` ENABLE KEYS */;


--
-- Definition of table `t_poly_payment_flow`
--

DROP TABLE IF EXISTS `t_poly_payment_flow`;
CREATE TABLE `t_poly_payment_flow` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '付款流程id',
  `uid` int(10) unsigned NOT NULL COMMENT '申请人id',
  `start_date` datetime NOT NULL COMMENT '申请日期',
  `dictno` varchar(45) NOT NULL COMMENT '字典代码',
  `bills_amount` int(10) unsigned NOT NULL COMMENT '单据数',
  `pay_date` datetime NOT NULL COMMENT '付款日期',
  `detailed_reason` varchar(1000) NOT NULL COMMENT '详细事由',
  `simpled_reason` varchar(300) NOT NULL COMMENT '简化事由',
  `pay_money` int(10) unsigned NOT NULL COMMENT '用款金额',
  `official_documents_no` varchar(45) NOT NULL COMMENT '批文编号',
  `offical_documents_title` varchar(100) NOT NULL COMMENT '批文标题',
  `contract_no` varchar(45) NOT NULL COMMENT '合同编号',
  `contract_money` int(10) unsigned NOT NULL COMMENT '合同金额',
  `payed_money` int(10) unsigned NOT NULL COMMENT '已付金额',
  `contract_pay_items` varchar(1000) NOT NULL COMMENT '合同约定付款条款',
  `budget_items` varchar(1000) NOT NULL COMMENT '预算项目',
  `budget_money` int(10) unsigned NOT NULL COMMENT '预算金额',
  `budget_payed_money` int(10) unsigned NOT NULL COMMENT '已付预算',
  `payee` varchar(60) NOT NULL COMMENT '收款人',
  `account_bank` varchar(100) NOT NULL COMMENT '开户银行',
  `bank_accounts` varchar(45) NOT NULL COMMENT '银行账号',
  `contacts` varchar(60) NOT NULL COMMENT '联系人',
  `contracts_phone` varchar(45) NOT NULL COMMENT '联系电话',
  `status` tinyint(3) unsigned NOT NULL COMMENT '流程状态，0.待审批,1.审批中，2.被退回，3.待付款，4.已完成',
  `model_no` varchar(45) NOT NULL COMMENT '模板代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa付款流程表';

--
-- Dumping data for table `t_poly_payment_flow`
--

/*!40000 ALTER TABLE `t_poly_payment_flow` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_payment_flow` ENABLE KEYS */;


--
-- Definition of table `t_poly_payment_model`
--

DROP TABLE IF EXISTS `t_poly_payment_model`;
CREATE TABLE `t_poly_payment_model` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '付款流程申请模板id',
  `model_no` varchar(45) NOT NULL COMMENT '模板代码',
  `dept` varchar(45) NOT NULL COMMENT '单位',
  `total_money` int(10) unsigned NOT NULL COMMENT '模板适用金额',
  PRIMARY KEY (`id`),
  KEY `FK_t_poly_payment_model_dept` (`dept`),
  CONSTRAINT `FK_t_poly_payment_model_dept` FOREIGN KEY (`dept`) REFERENCES `t_poly_dept` (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='付款流程申请模板表';

--
-- Dumping data for table `t_poly_payment_model`
--

/*!40000 ALTER TABLE `t_poly_payment_model` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_payment_model` ENABLE KEYS */;


--
-- Definition of table `t_poly_payment_nodes`
--

DROP TABLE IF EXISTS `t_poly_payment_nodes`;
CREATE TABLE `t_poly_payment_nodes` (
  `payment_flow_id` int(10) unsigned NOT NULL COMMENT '付款申请表主键',
  `levels` tinyint(3) unsigned NOT NULL COMMENT '已经处理的级别',
  `opinion` varchar(45) NOT NULL COMMENT '1.同意；2.驳回',
  `remarks` varchar(1000) NOT NULL COMMENT '备注',
  `uid` int(10) unsigned NOT NULL COMMENT '审批人的id',
  `next_uid` int(10) unsigned NOT NULL COMMENT '下个审批人id',
  KEY `FK_t_poly_payment_nodes_flow` (`payment_flow_id`),
  CONSTRAINT `FK_t_poly_payment_nodes_flow` FOREIGN KEY (`payment_flow_id`) REFERENCES `t_poly_payment_flow` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='节点表，付款申请流程已处理的节点表';

--
-- Dumping data for table `t_poly_payment_nodes`
--

/*!40000 ALTER TABLE `t_poly_payment_nodes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_payment_nodes` ENABLE KEYS */;


--
-- Definition of table `t_poly_position`
--

DROP TABLE IF EXISTS `t_poly_position`;
CREATE TABLE `t_poly_position` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '职位id',
  `name` varchar(45) NOT NULL COMMENT '职位名称',
  `code` varchar(45) NOT NULL COMMENT '职位代码',
  `deptno` varchar(45) NOT NULL COMMENT '职位所在的部门编号',
  PRIMARY KEY (`id`),
  KEY `FK_t_position_dept` (`deptno`),
  CONSTRAINT `FK_t_position_dept` FOREIGN KEY (`deptno`) REFERENCES `t_poly_dept` (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位表';

--
-- Dumping data for table `t_poly_position`
--

/*!40000 ALTER TABLE `t_poly_position` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_position` ENABLE KEYS */;


--
-- Definition of table `t_poly_summary`
--

DROP TABLE IF EXISTS `t_poly_summary`;
CREATE TABLE `t_poly_summary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '摘要的id',
  `name` varchar(200) NOT NULL COMMENT '摘要描述',
  `dictid` int(10) unsigned NOT NULL COMMENT '字典表的id',
  `money` int(10) unsigned NOT NULL COMMENT '摘要的金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa摘要表';

--
-- Dumping data for table `t_poly_summary`
--

/*!40000 ALTER TABLE `t_poly_summary` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_summary` ENABLE KEYS */;


--
-- Definition of table `t_poly_user`
--

DROP TABLE IF EXISTS `t_poly_user`;
CREATE TABLE `t_poly_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户表id',
  `account` varchar(45) NOT NULL COMMENT '用户名，用来登录用的',
  `pwd` varchar(45) NOT NULL COMMENT '用户密码，用来登录用的',
  `username` varchar(60) NOT NULL COMMENT '用户的姓名',
  `deptno` varchar(45) NOT NULL COMMENT '用户部门的id',
  `positionid` int(10) unsigned NOT NULL COMMENT '用户职位的id',
  PRIMARY KEY (`id`),
  KEY `FK_t_poly_user_dept` (`deptno`),
  KEY `FK_t_poly_user_position` (`positionid`),
  CONSTRAINT `FK_t_poly_user_dept` FOREIGN KEY (`deptno`) REFERENCES `t_poly_dept` (`deptno`),
  CONSTRAINT `FK_t_poly_user_position` FOREIGN KEY (`positionid`) REFERENCES `t_poly_position` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='poly oa的用户表';

--
-- Dumping data for table `t_poly_user`
--

/*!40000 ALTER TABLE `t_poly_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_poly_user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
