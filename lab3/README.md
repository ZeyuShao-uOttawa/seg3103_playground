## Running Jacoco Report
### Compiling JUnit Test File
`javac -cp .;junit-platform-console-standalone-1.7.1.jar;../src ComputationTest.java`
### Running JUnit Test on Computation
`java -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --scan-class-path`
### Creating Jacoco.exec File
`java -javaagent:jacocoagent.jar -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --scan-class-path`
### Creating Jacoco Report
`java -jar jacococli.jar report jacoco.exec --classfiles C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test\Classfiles --sourcefiles C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --html report`
### Jacoco Report
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/4979f9d8-9f2d-45c1-8042-e1c0f6795e0b)
## Statement and Branch Coverage
For the date class, covering all of the statements covers all of the branches
| Test Case | Method | Inputs | Expected Results |
| --- | --- | --- | --- |
| 1 | Constructor | (0, 1, 1) | IllegalArgumentException |
| 2 | Constructor | (32, 1, 1) | IllegalArgumentException |
| 3 | Constructor | (31, 4, 1) | IllegalArgumentException |
| 4 | Constructor | (30, 2, 2024) | IllegalArgumentException |
| 5 | Constructor | (29, 2, 2023) | IllegalArgumentException |
| 6 | Constructor | (1, 13, 1) | IllegalArgumentException |
| 7 | Constructor | (1, 1, -1) | IllegalArgumentException |
| 8 | nextDate | (31, 12, 2000) | (1, 1, 2001) |
| 9 | nextDate | (30, 11, 2000) | (1, 12, 2000) |
| 10 | nextDate | (30, 12, 2000) | (31, 12, 2000) |
| 11 | equals | (30, 12, 2000) (30, 12, 2000) | true |
| 12 | equals | "hello" | false |
| 13 | toString | (30, 12, 2000) | "2000/December/30" |
## Condition and Branch/Condition Coverage
For the date class, covering all of the conditions covers all of the branch/conditions as well
| Test Case | Method | Inputs | Expected Results |
| --- | --- | --- | --- |
| 1 | Constructor | (0, 1, 1) | IllegalArgumentException |
| 2 | Constructor | (32, 1, 1) | IllegalArgumentException |
| 3 | Constructor | (31, 4, 1) | IllegalArgumentException |
| 4 | Constructor | (30, 2, 2024) | IllegalArgumentException |
| 5 | Constructor | (29, 2, 2023) | IllegalArgumentException |
| 6 | Constructor | (1, 13, 1) | IllegalArgumentException |
| 6 | Constructor | (1, 0, 1) | IllegalArgumentException |
| 7 | Constructor | (1, 1, -1) | IllegalArgumentException |
| 8 | nextDate | (31, 12, 2001) | (1, 1, 2002) |
| 9 | nextDate | (30, 11, 2000) | (1, 12, 2000) |
| 10 | nextDate | (30, 12, 2000) | (31, 12, 2000) |
| 11 | nextDate | (29, 2, 2024) | (1, 3, 2024) |
| 12 | nextDate | (28, 2, 2023) | (1, 3, 2023) |
| 12 | nextDate | (1, 6, 2000) | (2, 7, 2000) |
| 12 | nextDate | (1, 9, 2001) | (2, 10, 2001) |
| 13 | equals | (30, 12, 2000) (30, 12, 2000) | true |
| 13 | equals | (30, 12, 2000) (1, 10, 1000) | false |
| 14 | equals | "hello" | false |
| 15 | toString | (30, 12, 2000) | "2000/December/30" |
## Running Jacoco Report for DateTest
### Compiling JUnit Test File
`javac -cp .;junit-platform-console-standalone-1.7.1.jar;../src DateTest.java`
### Running JUnit Test on Computation
`java -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\date\test --scan-class-path`
### Creating Jacoco.exec File
`java -javaagent:jacocoagent.jar -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\date\test --scan-class-path`
### Creating Jacoco Report
`java -jar jacococli.jar report jacoco.exec --classfiles C:\Users\zeyus\Documents\seg3103_playground\lab3\date\test\Classfiles --sourcefiles C:\Users\zeyus\Documents\seg3103_playground\lab3\date\test --html report`
### Inital Result
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/c42aba87-23b3-42f2-980d-942f3327a78e)
### Final Result
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/ca4b7f9e-1e71-4706-9be4-139c202b0d50)
### Conclusion
100% coverage is not possible due to not being able to test if it is not a leap year and the month is 2 but the day is 29. But it is very close to 100%
## Refactoring
After refactoring, the legibility of overall code was improved and the coverage improved by 1 extra coverage, since before the test case that was needed but not runnable had covered two branches, but after refactoring it only covered one so theres only one branch missing.
