# ManagementSkill

API Endpoints
------------------
Create:

http://localhost:8080/organisation/employee/skill

Headers : Key : Content-Type      Value : application/json

Method: POST

Body:
{
	"user_id":"E003",
	"user_name":"Vishruth",
	"skill_id":"MS001",
	"skills":"C#",
	"proficiency":"3-Expert",
	"effective_date":"2020-09-13T01:14:25.000+0000"
}
----------------------------------------------------------------------
View:

http://localhost:8080/organisation/employee/skill 

Headers : Key : Content-Type Value : application/json

 Method: GET

http://localhost:8080/organisation/employee/skill/{skillName} 

Example: 
http://localhost:8080/organisation/employee/skill/JAVA 

---------------------------------------------------------------
Delete the record

http://localhost:8080/organisation/employee/{id} 

Example:
http://localhost:8080/organisation/employee/105 

Method : DELETE

Headers : Key : Content-Type Value : application/json

 ------------------------------------------------------------------ 
Update the record

http://localhost:8080/organisation/employee/{id} 

http://localhost:8080/organisation/employee/105 

Headers : Key : Content-Type Value : application/json

 Method: PUT
 
 Body: 
 {
 "id": 105,
 "user_id": "E001",
 "user_name": "Narayanan",
 "skill_id": "J001",
 "skills": "JAVA",
 "proficiency": "1-Expert",
 "effective_date": "2020-09-12T10:03:06.167+0000",
 "create_date": "2020-09-12T10:03:06.167+0000",
 "update_date": "2020-09-12T10:03:06.167+0000"
 }
