## Compiling JUnit Test File
`javac -cp .;junit-platform-console-standalone-1.7.1.jar;../src ComputationTest.java`
## Running JUnit Test on Computation
`java -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --scan-class-path`
## Creating Jacoco.exec File
`java -javaagent:jacocoagent.jar -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --scan-class-path`
## Creating Jacoco Report
`java -jar jacococli.jar report jacoco.exec --classfiles C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test\Classfiles --sourcefiles C:\Users\zeyus\Documents\seg3103_playground\lab3\computation\test --html report`
## Jacoco Report
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/4979f9d8-9f2d-45c1-8042-e1c0f6795e0b)
