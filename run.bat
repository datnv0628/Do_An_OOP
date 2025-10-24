@echo off
javac -d out src/view/Main.java src/model/*.java
if %errorlevel% neq 0 (
    echo Compilation failed!
    exit /b %errorlevel%
)
java -cp out src.view.Main
pause

@echo off
javac -d out src/view/Main.java src/model/*.java
if %errorlevel% neq 0 (
    echo Compilation failed!
    exit /b %errorlevel%
)
java -cp out src.view.Main
pause