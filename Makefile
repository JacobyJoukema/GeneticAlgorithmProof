JC = javac
RM = rm
CH = chmod u+x
.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

default: compile run

compile: creatures evolution start

creatures: src/creatures/Creature.class

evolution: src/evolution/Genetic.class

start: src/start/Main.class

run:
	$(CH) run.sh

clean:
	$(RM) *.class
