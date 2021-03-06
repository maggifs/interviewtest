# Small REST API

Created in Java using Spring Boot. 

No data is added when API is started. 

All methods where tested with Postman.

Files created for the project are located in ```src\main\java\com\example\interviewtest``` and those files are:
* Position.java
* RestRepository.java
* Vessel.java
* VesselPos.java
* VesselPosController.java

## Methods available:

### GET all objects in repository
`GET`

http://localhost:8080/positions

---

### POST an object to the repository
`POST`

http://localhost:8080/positions

date should be ```"YYYY-MM-DD"``` format.

Sample data to POST:
```json
{
	"vessel": {
		"name": "Tjaldur",
		"country": "Iceland"
	},
	"position": {
		"date": "2020-02-04",
		"latitude": 61.23,
		"longitude": 36.1,
		"speed": 21
	}
}
```

---

### GET object by id from the repository
`GET`

http://localhost:8080/positions/:id

---

### DELETE object by id from the repository
`DELETE`

http://localhost:8080/positions/:id
