SRCS = $(shell find * -name "*.java")

CLASSES = $(SRCS:.java=.class)

$(CLASSES): $(SRCS)
	@echo Compiling...
	echo $(SRCS) > sources.txt
	javac @sources.txt
	rm sources.txt
	@echo

all: $(CLASSES)

# https://stackoverflow.com/questions/54749757/how-to-excute-java-class-in-any-folder
run: $(CLASSES)
	java -classpath src fr.zekoyu.avajlauncher.AvajLauncher scenario.txt

clean:
	rm -f $(CLASSES)

re: clean all