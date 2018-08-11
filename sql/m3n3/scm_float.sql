CREATE TABLE scm_float(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  java.lang.Double
  * param: java.lang.Class
  */
 d0uble DOUBLE NULL

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);