## Java
For the java class, I ran it by `cd`ing into the `src` directory and compiling the file Main.java by running `javac Main.java` and then running it by `java Main`

## JUnit
For the junit test, I ran it by `cd`ing into the `test` directory, copying over the JUnit jar into the `test` directory, and then compiling the test using `javac -cp .;junit-platform-console-standalone-1.7.1.jar;../src NewmathTest.java`, and lastly running the test using `java -jar junit-platform-console-standalone-1.7.1.jar --class-path C:\Users\zeyus\Documents\seg3103_playground\newmath_java\test --scan-class-path`. Side note I had to move the Newmath class file into the test directory since it could not find it (I probably could have changed the code to import it)

## Elixir
To run Newmath in Elixir, I first ran `mix compile` in the `newmath_ex` directory to compile the Elixir files and then I ran `iex -S mix` to run Newmath in Elixir shell

## EXUnit
To run the Elixir Test I ran `mix test %*` in the `newmath_ex` directory

## Python Run
To run Newmath in Python I first ran `python -i ./bin/run.py` in the `newmath_py` directory to enter the Python shell where I could use the newmath function

## PYUnit
To run the Python test I ran `python -m unittest discover -s test` in the `newmath_py` directory