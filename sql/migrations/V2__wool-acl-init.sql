------------------------------ Table wool_acl_user -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_user`;
CREATE TABLE `wool_acl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `login_name` varchar(30) NOT NULL COMMENT '登录名',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `mail` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `salt` varchar(10) NOT NULL COMMENT 'salt',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `pw_dead_time` int(11) NOT NULL COMMENT '密码过期时间',
  `ctime` int(11) NOT NULL COMMENT '创建时间',
  `is_valid` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否可用 0-不可用 1-可用',
  `failure_times` tinyint(4) NOT NULL DEFAULT '0' COMMENT '失败次数',
  `failure_time` int(11) DEFAULT NULL COMMENT '失败时间',
  `last_login_time` int(11) DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_login_name` (`login_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_user` VALUES ('1', 'admin', 'admin', '', '1', 'oC5XAkM2', '22b6da62f8ba7ce8e331d1aec6e5272d',
                                       '1484644595', '0', '', '0', '0', '1484644595');

------------------------------ Table wool_acl_app -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_app`;
CREATE TABLE `wool_acl_app` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `app_name` varchar(20) NOT NULL COMMENT '应用名',
  `description` varchar(50) NOT NULL COMMENT '应用描述',
  `token` varchar(20) NOT NULL COMMENT 'token',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_app` (`app_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_app` VALUES ('1', 'acl', '统一权限', 'WoolAcl000000');

------------------------------ Table wool_acl_user_app_relation -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_user_app_relation`;
CREATE TABLE `wool_acl_user_app_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) NOT NULL COMMENT '用户id 对应wool_acl_user表的id',
  `app_id` int(11) NOT NULL COMMENT '应用id 对应wool_acl_app表的id',
  PRIMARY KEY (`id`),
  KEY `uid_idx_0` (`uid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_user_app_relation` VALUES ('1', '1', '1');

------------------------------ Table wool_acl_group -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_group`;
CREATE TABLE `wool_acl_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `app_id` int(11) DEFAULT NULL COMMENT '应用id',
  `group_id` int(11) DEFAULT NULL COMMENT '组id',
  `group_name` varchar(50) DEFAULT NULL COMMENT '组名',
  `description` varchar(50) DEFAULT NULL COMMENT '组描述',
  PRIMARY KEY (`id`),
  KEY `appid_name_idx_0` (`app_id`,`group_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

------------------------------ Table wool_acl_user_group_relation -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_user_group_relation`;
CREATE TABLE `wool_acl_user_group_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) DEFAULT NULL COMMENT '用户id 对应wool_acl_user表的id',
  `group_id` int(11) DEFAULT NULL COMMENT '组id 对应wool_acl_group表的id',
  PRIMARY KEY (`id`),
  KEY `idx_uid` (`uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

------------------------------ Table wool_acl_role -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_role`;
CREATE TABLE `wool_acl_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `app_id` int(11) NOT NULL COMMENT '应用id',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名',
  `description` varchar(50) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_role_name` (`app_id`,`role_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_role` VALUES ('1', '1', 'admin', 'admin role');

------------------------------ Table wool_acl_user_role_relation -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_user_role_relation`;
CREATE TABLE `wool_acl_user_role_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) NOT NULL COMMENT '用户id 对应wool_acl_user表的id',
  `role_id` int(11) NOT NULL COMMENT '角色id 对应wool_acl_role表的id',
  PRIMARY KEY (`id`),
  KEY `uid_idx_0` (`uid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_user_role_relation` VALUES ('1', '1', '1');

------------------------------ Table wool_acl_resource -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_resource`;
CREATE TABLE `wool_acl_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `app_id` int(11) NOT NULL COMMENT '应用id',
  `parent_id` int(11) DEFAULT NULL COMMENT '父id',
  `resource_id` int(11) NOT NULL COMMENT '资源id',
  `resource_name` varchar(50) DEFAULT NULL COMMENT '资源名称',
  `resouce_value` varchar(200) DEFAULT NULL COMMENT '资源值',
  `describe` varchar(50) DEFAULT NULL COMMENT '资源描述',
  PRIMARY KEY (`id`),
  KEY `resource_unique_res_id` (`app_id`,`resource_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_resource` VALUES ('1', '1', '-1', '1', 'APP', 'app', 'APP');
INSERT INTO `wool_acl_resource` VALUES ('2', '1', '-1', '2', '角色', 'role', '角色');
INSERT INTO `wool_acl_resource` VALUES ('3', '1', '-1', '3', '资源', 'res', '资源');
INSERT INTO `wool_acl_resource` VALUES ('4', '1', '-1', '4', '用户', 'user', '用户');
INSERT INTO `wool_acl_resource` VALUES ('5', '1', '1', '11', '查看APP列表', 'app:query', '查看APP列表');
INSERT INTO `wool_acl_resource` VALUES ('6', '1', '1', '12', '编辑APP', 'app:edit', '编辑APP');
INSERT INTO `wool_acl_resource` VALUES ('7', '1', '1', '13', '添加APP', 'app:add', '添加APP');
INSERT INTO `wool_acl_resource` VALUES ('8', '1', '1', '14', '删除APP', 'app:del', '删除APP');
INSERT INTO `wool_acl_resource` VALUES ('9', '1', '2', '21', '查询角色列表', 'role:query', '查询角色列表');
INSERT INTO `wool_acl_resource` VALUES ('10', '1', '2', '22', '添加角色', 'role:add', '添加角色');
INSERT INTO `wool_acl_resource` VALUES ('11', '1', '2', '23', '删除角色', 'role:del', '删除角色');
INSERT INTO `wool_acl_resource` VALUES ('12', '1', '2', '24', '修改角色', 'role:edit', '修改角色');
INSERT INTO `wool_acl_resource` VALUES ('13', '1', '2', '25', '配置角色权限', 'role:configRes', '配置角色权限');
INSERT INTO `wool_acl_resource` VALUES ('14', '1', '3', '31', '查看资源列表', 'res:query', '查看资源列表');
INSERT INTO `wool_acl_resource` VALUES ('15', '1', '3', '32', '添加资源列表', 'res:add', '添加资源列表');
INSERT INTO `wool_acl_resource` VALUES ('16', '1', '3', '33', '编辑资源列表', 'res:edit', '编辑资源列表');
INSERT INTO `wool_acl_resource` VALUES ('17', '1', '3', '34', '删除资源列表', 'res:del', '删除资源列表');
INSERT INTO `wool_acl_resource` VALUES ('18', '1', '4', '41', '查看用户列表', 'user:query', '查看用户列表');
INSERT INTO `wool_acl_resource` VALUES ('19', '1', '4', '42', '添加用户', 'user:add', '添加用户');
INSERT INTO `wool_acl_resource` VALUES ('20', '1', '4', '43', '编缉用户', 'user:edit', '编缉用户');
INSERT INTO `wool_acl_resource` VALUES ('21', '1', '4', '44', '禁用用户', 'user:disable', '禁用用户');
INSERT INTO `wool_acl_resource` VALUES ('22', '1', '4', '45', '配置用户角色', 'user:configRole', '配置用户角色');

------------------------------ Table wool_acl_role_resource_relation -----------------------------------------------
DROP TABLE IF EXISTS `wool_acl_role_resource_relation`;
CREATE TABLE `wool_acl_role_resource_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` int(11) NOT NULL COMMENT '角色id 对应wool_acl_role表的id',
  `resource_id` int(11) NOT NULL COMMENT '资源id 对应wool_acl_resource表的id',
  PRIMARY KEY (`id`),
  KEY `role_id_idx_0` (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

INSERT INTO `wool_acl_role_resource_relation` VALUES ('1', '1', '1');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('2', '1', '2');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('3', '1', '3');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('4', '1', '4');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('5', '1', '5');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('6', '1', '6');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('7', '1', '7');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('8', '1', '8');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('9', '1', '9');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('10', '1', '10');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('11', '1', '11');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('12', '1', '12');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('13', '1', '13');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('14', '1', '14');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('15', '1', '15');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('16', '1', '16');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('17', '1', '17');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('18', '1', '18');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('19', '1', '19');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('20', '1', '20');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('21', '1', '21');
INSERT INTO `wool_acl_role_resource_relation` VALUES ('22', '1', '22');













