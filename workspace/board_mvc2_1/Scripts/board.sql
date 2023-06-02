CREATE SEQUENCE BOARD_SEQ
INCREMENT BY 1
START WITH 1
MINVALUE 1
MAXVALUE 100000;

CREATE TABLE BOARD(
	BOARD_NUM NUMBER(10),
	BOARD_TITLE VARCHAR2(1000),
	BOARD_CONTENTS VARCHAR2(3000),
	BOARD_ID VARCHAR2(50),
	BOARD_DATE DATE,
	CONSTRAINT BOARD_PK PRIMARY KEY(BOARD_NUM),
	CONSTRAINT BOARD_FK FOREIGN KEY(BOARD_ID) REFERENCES "MEMBER"(MEMBER_ID)
);

ALTER TABLE BOARD ADD READCOUNT NUMBER(10) DEFAULT 0;


INSERT INTO BOARD
VALUES(BOARD_SEQ.NEXTVAL, '테스트 제목2', '테스트 내용2', 'hds9', SYSDATE, 0);

SELECT * FROM BOARD;

CREATE TABLE FILES(
	FILE_NAME VARCHAR2(100),
	BOARD_NUM NUMBER(10),
	CONSTRAINT FILES_PK PRIMARY KEY(FILE_NAME),
	CONSTRAINT FILES_FK FOREIGN KEY(BOARD_NUM) REFERENCES BOARD(BOARD_NUM)
);

SELECT BOARD_SEQ.CURRVAL FROM DUAL;

SELECT * FROM FILES;






