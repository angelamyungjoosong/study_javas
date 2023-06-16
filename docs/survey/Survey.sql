-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition  -- ON 
-- ORDER BY column_name(s); 

-- - 설문자 가능 명단(가입 완료)
-- 1. 홍길동, 2.장길산, 3.신사임당, ...

SELECT*
FROM respondents 
; 

-- - 설문 시작	

-- -------- 참조 : poll contents example -------------
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.

-- 문항 답항 순으로 나와.. 반복패턴 찾기 / 문항이 먼저 나오고 '답항은 문항에 종속적임'.-> 문항이 나올때 답항이 따라 나와야함.
-- 뭉텅이로 가져와서 디스플레이에서 다꿔야함/ DB에서 문항 뭉텅이 가지고 와야함 (시작) 

-- 문항 
SELECT *
FROM questions 
;

