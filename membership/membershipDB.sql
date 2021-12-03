-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 테이블 aidb.membership 구조 내보내기
CREATE TABLE IF NOT EXISTS `membership` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `major` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`num`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;

-- 테이블 데이터 aidb.membership:~0 rows (대략적) 내보내기
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
INSERT IGNORE INTO `membership` (`num`, `name`, `major`, `email`, `password`) VALUES
	(4, '홍길동', '경영학과', 'hong@abc.com', '1234'),
	(5, '김영희', '컴퓨터공학과', 'hee@abc.com', '0000'),
	(6, '먕먕', '수의학과', 'myang@mm.com', '5959'),
	(7, '김뽀삐', '댕댕학과', 'mung@asd.com', '12345'),
	(8, '삼순', '몽몽이학과', 'sam@aa.com', '7777'),
	(9, '도레미', '음악학과', 'dodo@asd.com', '5555');
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
