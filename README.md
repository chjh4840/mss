# mss

### H2 설치 및 설정

1. h2 다운로드 및 Linux 서버 업로드
(Download : [h2-2021-12-21.zip](https://github.com/chjh4840/mss/files/7841119/h2-2021-12-21.zip))
2. unzip h2-2021-12-21.zip
3. cd ./h2/bin 
4. chmod 755 h2.sh
5. ./h2.sh -webAllowOthers
6. http://localhost:8082 접속
7. JDBC URL 수정 (jdbc:h2:tcp://localhost/~/mss)
[mss.mv.zip](https://github.com/chjh4840/mss/files/7841102/mss.mv.zip)
-> Database 생성 실패시 해당 파일 사용
8. H2 DB 접속
9. table 생성
	CREATE TABLE CATEGORY(
	ID INT,
	F_ID INT,
	NAME VARCHAR(255)
	);

### 소스 배포

1. 프로젝트 Maven build
2. target 디렉토리 spring-boot-mss-0.0.1-SNAPSHOT.jar 확인
3. 해당 jar를 Linux 서버 업로드
4. java -jar spring-boot-mss-0.0.1-SNAPSHOT.jar 실행
5. http://localhost:8080 접속
