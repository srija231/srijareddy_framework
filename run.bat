set projectLocation=C:\Users\Srija\eclipse-workspace\Srija_Modular
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml