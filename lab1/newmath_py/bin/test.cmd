@echo off
setlocal

rem Set PYTHONPATH to include the src directory
set "SCRIPT_DIR=%~dp0"
set "SRC_DIR=%SCRIPT_DIR%\..\src"
set "PYTHONPATH=%PYTHONPATH%;%SRC_DIR%"

rem Run Python unit tests using unittest module
python -m unittest discover -s test %*