## Running the Program
java --add-opens java.base/java.lang=ALL-UNNAMED -jar user-registration-app-0.1.0.jar

## Exercise 1
| Test Case | Expected Results | Actual Results | Verdict (Pass, Fail, Inconclusive) |
| --- | --- | --- | --- |
| [ZabuZabu, Zeyu, Shao, zeyu.shao@hotmail.com, 21, Ottawa, K1H7G2] | Sucess | Sucess | Pass 
| [' ', ' ', ' ', ' ', ' ', Ottawa, ' '] | Error (UserName, FirstName, LastName, Email, Age, PostalCode) | Error (UserName, FirstName, LastName, Email, Age, PostalCode) | Pass |
| [Z, Z, Z, zeyu.shao@&*.com, 99, Ottawa, HHH HHH] | Error (UserName, Email, Age, PostalCode) | Error (UserName, Email, Age, PostalCode) | Pass |
| [6ZabuZabu, 5, 6, &*@hotmail.com, Z, Ottawa, K1H 7G2] | Error (UserName, FirstName, LastName, Email, Age) | Error (UserName, FirstName, LastName, Email, Age) | Pass |
| [ZabuZabuZabuZabu, Zeyu@, Shao@, Zeyu, 21, Ottawa, K1JHHH] | Error (UserName, FirstName, LastName, Email, PostalCode) | Error (UserName, FirstName, LastName, Email, PostalCode) | Pass |
| [YOLO, , , 25, 21, Ottawa, HHH7G2] | Error (UserName, Email, PostalCode) | Error (UserName, Email, PostalCode) | Pass |

