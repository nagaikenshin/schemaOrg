CREATE TABLE scm_date_time(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  java.time.OffsetDateTime
  * param: int
  *        java.lang.Class
  *        java.time.DayOfWeek
  *        java.time.Month
  *        java.time.ZoneOffset
  *        long
  */

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);