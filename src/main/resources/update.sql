use test;
DROP TABLE `user`;
CREATE TABLE `user`
(
  `id`       INT(11)      NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(200) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT ='用户|曾凡龙|2019-10-24';

