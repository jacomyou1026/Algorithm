-- 코드를 입력하세요
SELECT DATETIME
from ANIMAL_INS 
where DATETIME = (select max(DATETIME) from ANIMAL_INS )