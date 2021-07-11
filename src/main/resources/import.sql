CREATE TABLE employee_skill_proficiency
(
  id bigint NOT NULL,
  user_id character varying(255) NOT NULL,
  user_name character varying(255),
  skill_id character varying(255),
  skills character varying(255),
  proficiency character varying(255),
  effective_date timestamp without time zone,
  create_date timestamp without time zone,
  update_date timestamp without time zone,
  CONSTRAINT employee_skill_proficiency_pkey PRIMARY KEY (id)
)

CREATE TABLE skills
(
  skill_id character varying(255) NOT NULL,
  skills character varying(255),
  create_date timestamp without time zone,
  update_date timestamp without time zone,
  CONSTRAINT skills_pkey PRIMARY KEY (skill_id)
)
INSERT INTO skills VALUES ('J001','JAVA');
INSERT INTO skills VALUES ('J002','J2EE');
INSERT INTO skills VALUES ('J003','JAVA WEB SERVICE');
INSERT INTO skills VALUES ('J004','JAVA SERVLET');
INSERT INTO skills VALUES ('U001','ANGULAR');
INSERT INTO skills VALUES ('U002','NODEJS');
INSERT INTO skills VALUES ('U003','JAVA SCRIPT');
INSERT INTO skills VALUES ('D001','ORACLE');
INSERT INTO skills VALUES ('D002','SQL SERVER');
INSERT INTO skills VALUES ('D003','MY SQL');
INSERT INTO skills VALUES ('J005','JSP');
INSERT INTO skills VALUES ('S001','Tomcat');
INSERT INTO skills VALUES ('S002','WebSphere');
INSERT INTO skills VALUES ('S003','JBoss');