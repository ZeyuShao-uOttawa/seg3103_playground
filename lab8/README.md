## Starting PIT Test Plugin
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/818f5d61-491d-43e6-9b3f-9d79907a8cd2)
## Screenshots of PIT Test Report
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/3f4243af-521d-4f54-b246-bd936d6eaa2d)
![image](https://github.com/ZeyuShao-uOttawa/seg3103_playground/assets/33436865/a7a4096b-d301-47c7-a17a-514d8f9309b7)
## Question Answers
The first mutations for each line switches the operator in the base code with its counterpart, so an addition will be a subtraction and a subtraction will be an addition. 
The second mutations for each line replaces the return values for the function to be `return (x == 0 ? 1 : 0)`, where if x is 0 return 1 otherwise return 0, instead of the regular return values of the calculation functions. 
This report shows all the various mutations that can be applied to the base code, and if the tests for the code covers all the mutations or not.

When a mutation is killed, it means that the mutation that was introduced into the code is caught in the test and the test fails due to the mutation.
