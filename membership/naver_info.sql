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

-- 테이블 aidb.naver_info 구조 내보내기
CREATE TABLE IF NOT EXISTS `naver_info` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(500) NOT NULL DEFAULT '0',
  `url` varchar(500) NOT NULL DEFAULT '0',
  `date` varchar(500) NOT NULL DEFAULT '0',
  `keyword` varchar(50) NOT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 aidb.naver_info:~17 rows (대략적) 내보내기
/*!40000 ALTER TABLE `naver_info` DISABLE KEYS */;
INSERT IGNORE INTO `naver_info` (`num`, `title`, `url`, `date`, `keyword`) VALUES
	(1, '청소년 5명 중 1명 “디지털성범죄 노출경험 있다”···그런데도 “인터넷 ...', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=102&oid=032&aid=0003113364', 'Tue, 30 Nov 2021 15:05:00 +0900', ''),
	(2, 'KBO, 신한은행과 2023년까지 타이틀 스폰서 계약 연장', 'https://sports.news.naver.com/news.nhn?oid=109&aid=0004519381', 'Tue, 30 Nov 2021 15:05:00 +0900', ''),
	(3, '경남도, 궤도운송시설물 긴급 안전점검 실시한다', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=102&oid=082&aid=0001129761', 'Tue, 30 Nov 2021 15:05:00 +0900', ''),
	(4, '한은 "올해 경상수지 흑자, GDP 대비 5% 수준에 달할 것"', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=101&oid=629&aid=0000118933', 'Tue, 30 Nov 2021 15:05:00 +0900', ''),
	(5, '제목수정', 'http://URL 들어감', '날짜들어감', ''),
	(6, '이 제목을 전달', '이 url을 전달', '이 날짜를 전달', ''),
	(7, '이 제목을 전달', '이 url을 전달', '이 날짜를 전달', ''),
	(8, '\'<b>오미크론</b> 백신\' 기다렸다 맞나?…당국 &quot;신속한 3차접종 중요&quot;', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=102&oid=079&aid=0003581909', 'Thu, 02 Dec 2021 16:11:00 +0900', ''),
	(9, '경기도서 <b>오미크론</b> 확진자 발생…나이지리아 방문 50대 여성', 'http://www.ifm.kr/news/323866', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(10, '코스피, 이틀 연속 상승랠리에도 동학개미는 1조 \'일단 팔자\'', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=101&oid=008&aid=0004678447', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(11, '전남도, <b>오미크론</b> 변이바이러스 \'방역대응 강화\'', 'http://www.newsworker.co.kr/news/articleView.html?idxno=138862', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(12, '정은경 “코로나 백신 몇 번 맞아야 완성되는지 불확실한 상황”', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=102&oid=022&aid=0003644039', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(13, '[종합] 코스피 2945.27 마감...외인, ‘삼전’ 순매수 집중', 'https://www.etoday.co.kr/news/view/2083692', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(14, '국제 유가 하락에 웃음 지었던 NCC…\'불황형 마진\' 이어질지 물음표', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=101&oid=015&aid=0004635790', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(15, '[데일리픽] 美 빅테크, 블록체인 사업 잰걸음…정부, 거리두기 4단계 카드 \'만...', 'http://www.digitaltoday.co.kr/news/articleView.html?idxno=426982', 'Thu, 02 Dec 2021 16:10:00 +0900', ''),
	(16, '<b>오미크론</b> 출현에 확진자·중환자 폭증, 위기의 출발선에 서다.', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=110&oid=002&aid=0002221609', 'Thu, 02 Dec 2021 16:09:00 +0900', ''),
	(17, '<b>오미크론</b> 확진자 상태는 \'양호\'… 접촉자 \'68명→105명\' 증가', 'https://news.naver.com/main/read.naver?mode=LSD&mid=sec&sid1=102&oid=417&aid=0000760642', 'Thu, 02 Dec 2021 16:09:00 +0900', '');
/*!40000 ALTER TABLE `naver_info` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
