JC = javac
RM = rm
CH = chmod u+x
.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

default: compile run

compile: src/Main.class

run:
	$(CH) run.sh

clean:
	$(RM) *.class