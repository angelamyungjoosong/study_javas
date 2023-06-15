-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition  -- ON 
-- ORDER BY column_name(s); 

-- 원하는거보다 많다? group by로 진행 
-- -------- 참조 : poll Statistic example -------------
-- 총 설문자 : 3명

SELECT COUNT(*) CNT
FROM (
SELECT RESPONDENTS_ID, COUNT(*) CNT
FROM statistics
GROUP BY RESPONDENTS_ID
) AS T_STATIC
;




