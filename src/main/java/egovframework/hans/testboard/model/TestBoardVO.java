package egovframework.hans.testboard.model;

import lombok.Data;

public @Data class TestBoardVO {
	/* 
	 * CREATE TABLE `adannouncement` ( `seqno` int(11) NOT NULL AUTO_INCREMENT,
	 * `title` varchar(200) DEFAULT NULL, `content` varchar(500) DEFAULT NULL,
	 * `writer` varchar(100) DEFAULT NULL, `regdate` datetime DEFAULT NULL, `hits`
	 * int(11) DEFAULT NULL, PRIMARY KEY (`seqno`) ) ENGINE=InnoDB DEFAULT
	 * CHARSET=latin1 COLLATE=latin1_swedish_ci
	 */
			
	private String seqno; //서버와 클라이언트가 데이터를 주고받을 때는 string로만 주고받기 때문에 계산이 목적이 아니면 굳이 다른 타입으로 받을 필요 없음
	private String title;
	private String contnet;
	private String writer;
	private String regdate;
	private String hits;
}
