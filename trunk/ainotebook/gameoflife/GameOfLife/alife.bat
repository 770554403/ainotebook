set SCRIPT_DIR=%~dp0
java -Xmx300M -classpath "%SCRIPT_DIR%;slf4j-api-1.6.1.jar;%SCRIPT_DIR%slf4j-log4j12-1.6.1.jar;%SCRIPT_DIR%log4j-1.2.16.jar;%SCRIPT_DIR%scala-swing.jar;%SCRIPT_DIR%scala-library.jar;%SCRIPT_DIR%alife_2.8.0-1.0.jar" org.berlin2.bottomuplife.CellSimulation