java org.antlr.v4.Tool MiniJava.g4
javac MiniJava*.java
java -cp ".;C:\Library\ANTLR\antlr-4.5.3-complete.jar" org.antlr.v4.gui.TestRig MiniJava goal -gui < test.txt