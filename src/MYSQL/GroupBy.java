package MYSQL;

public class GroupBy {
//    SELECT CAR_ID ,
//            CASE
//                WHEN CAR_ID IN (SELECT CAR_ID
//                                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
//                                WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE) THEN '대여중'
//                ELSE '대여 가능'
//            END AS 'AVAILABILITY'
//    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
//    GROUP BY CAR_ID
//    ORDER BY 1 DESC
//
//    SELECT CAR_TYPE, COUNT(*) AS CARS
//    FROM CAR_RENTAL_COMPANY_CAR
//    WHERE (OPTIONS LIKE '%통풍시트%')
//    OR (OPTIONS LIKE '%열선시트%')
//    OR (OPTIONS LIKE '%가죽시트%')
//    GROUP BY CAR_TYPE
//    ORDER BY 1 ASC
//
//    SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
//    FROM APPOINTMENT
//    WHERE APNT_YMD LIKE ('2022-05-%')
//    GROUP BY MCDP_CD
//    ORDER BY 2, 1
//
//    SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
//    FROM FIRST_HALF h JOIN ICECREAM_INFO i ON h.FLAVOR = i.FLAVOR
//    GROUP BY INGREDIENT_TYPE
//    ORDER BY 2
}
