CREATE TABLE scm_date(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  java.time.LocalDate
  * param: int
  *        java.lang.Class
  *        java.time.DayOfWeek
  *        java.time.Month
  *        java.time.chrono.Era
  *        java.time.chrono.IsoChronology
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