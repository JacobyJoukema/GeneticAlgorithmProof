JC = javac
RM = rm
CH = chmod u+x
.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

default: compile run

compile: creatures/CharCreature.class genetic/CharEvolution.class start/Main.class

run:
	$(CH) run.sh

clean:
	$(RM) *.class
