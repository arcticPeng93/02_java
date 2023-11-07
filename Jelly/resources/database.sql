SELECT * FROM TRAVEL
WHERE NO=1;

ALTER TABLE travel
ADD CONSTRAINT TRAVEL_PK PRIMARY KEY(NO);

--1. 페이지 단위로 10개씩 보여주기
--정렬기준: REGION, TITLE

-- 전체 데이터 건수
SELECT COUNT(*) TOTAL_COUNT FROM TRAVEL;

-- 한 페이지당 10개씩 보여주기
-- 정렬: REGION, TITLE

SELECT *
FROM (
	SELECT ROW_NUMBER() OVER(ORDER BY REGION, TITLE) SEQ, T.*
	FROM TRAVEL t
)
WHERE SEQ BETWEEN 11 AND 20;

CREATE OR REPLACE VIEW TRAVEL_VIEW
AS
	SELECT *
FROM (
	SELECT ROW_NUMBER() OVER(ORDER BY REGION, TITLE) SEQ, T.*
	FROM TRAVEL t
);

SELECT * FROM TRAVEL_VIEW 
WHERE SEQ BETWEEN 11 AND 20;

--2. 지역별로 보여주기
--지역 목록을 제시하고, 선택 후 해당지역 목록 출력
--2-1) 지역 목록 얻기
SELECT DISTINCT REGION FROM TRAVEL;

--2-2) 선택지역의 목록 얻기
SELECT * FROM TRAVEL
WHERE REGION = '수도권'
ORDER BT TITLE;

--2-3) 권역별 관광지 개수
--수도권(13)
--전라권(6)
SELECT REGION, COUNT(*) COUNT
FROM TRAVEL
GROUP BY REGION
ORDER BY COUNT(*);

--3. 검색
--검색 대상 칼럼: TITLE, DESCRIPTION
SELECT * FROM TRAVEL
WHERE TITLE LIKE '%해수욕장%'
ORDER BY REGION, TITLE;

--4. 상세보기
SELECT * FROM TRAVEL WHERE NO