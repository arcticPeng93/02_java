--여기서는 실행이 Alt+S
select * from scott.dept;

--jdbc_ex 계정 작업
CREATE TABLE USERS (
	ID VARCHAR2(12) PRIMARY KEY,
	PASSWORD VARCHAR2(12) NOT NULL,
	NAME VARCHAR2(30) NOT NULL,
	ROLE VARCHAR2(6) NOT NULL
);
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('guest', 'guest123', '방문자', 'USER');

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('admin', 'admin123', '관리자', 'ADMIN');

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES('member', 'member123', '일반회원', 'USER');

COMMIT

SELECT * FROM USERS;
select count(*) from users;
