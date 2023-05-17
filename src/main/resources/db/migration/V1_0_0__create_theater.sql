DROP TABLE IF EXISTS `theater`;
CREATE TABLE `theater` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `theater_name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
   city varchar(255) NOT NULL,
   state varchar(100) NOT NULL,
   country varchar(100) NOT NULL,
   zipcode varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
);