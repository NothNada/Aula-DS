@echo off

javac *.java

rem Verifica se a compilação foi bem-sucedida
if %errorlevel% neq 0 (
    echo Erro
) else (
    echo concluído com sucesso
)