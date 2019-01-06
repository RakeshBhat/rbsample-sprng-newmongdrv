## Description
How to use latest spring data still continue using existing spring/spring-boot parent
1. In the POM add this to the properties section
```xml
	<properties>
		<spring-data-releasetrain.version>Kay-SR4</spring-data-releasetrain.version>
	</properties>
```	
2. Add exclusions for the mongodb Jars, under spring-boot-starter-data-mongodb dependency

3. Add The MongoDB Java Driver uber-artifact dependency

---
### Releases

- [lovelace] (https://spring.io/blog/2018/09/21/spring-data-lovelace-ga-released)
- [fowler] (https://spring.io/blog/2015/07/28/spring-data-fowler-sr2-released)
- [gosling] (https://spring.io/blog/2016/10/03/spring-data-hopper-sr4-and-gosling-sr6-released)
- [ingalls] (https://spring.io/blog/2018/05/08/spring-data-ingalls-sr12-and-kay-sr7-released)
- [kay] (https://spring.io/blog/2018/02/20/spring-data-kay-sr4-released)
- [mongodb] (https://docs.spring.io/spring-data/mongodb/docs/2.0.4.RELEASE/changelog.txt)
- [spring-data-mongodb] (https://github.com/spring-projects/spring-data-mongodb/releases)
- [1.10.15] (https://repo.spring.io/libs-release/org/springframework/data/spring-data-mongodb-parent/1.10.15.RELEASE/)
- [2.0.0] (https://repo.spring.io/libs-release/org/springframework/data/spring-data-mongodb/2.0.0.RELEASE/)
- [2.0.4] (https://repo.spring.io/libs-release/org/springframework/data/spring-data-mongodb/2.0.4.RELEASE/)
- [spring-data] (https://mvnrepository.com/artifact/org.springframework.data/spring-data-releasetrain)
- [mongo-java-driver] (https://mongodb.github.io/mongo-java-driver/)

---
### Spring Data, Spring Data MongoDB and MonogDB Driver Mapping

|spring-data-releasetrain.version	|spring-data-mongodb 	|mongodb-driver	|
| --------------------------------- | --------------------- | ------------	|
| Fowler-SR2 						| 	1.7.2.RELEASE		| 	3.0.2		|
| Hopper SR4						| 	1.9.3.RELEASE		| 	2.14.3		|
| Gosling SR6						| 	1.9.3.RELEASE		| 	2.14.3		|
| Kay-SR12							|   1.10.12.RELEASE		| 	3.6.3		|
| Kay-SR7							| 	2.0.7.RELEASE		| 	3.6.3		|
| Kay-SR4                           |   2.0.4.RELEASE		| 	3.6  		|
| Kay-RELEASE						| 	2.0.0.RELEASE		| 	3.5.0		|
