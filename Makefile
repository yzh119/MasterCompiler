all: clean
	@mkdir -p ./bin
	@cd ./src && javac -cp "../lib/antlr-4.5.2-complete.jar" \
		./com/expye/compiler2016/*/*/*/*/*.java \
		./com/expye/compiler2016/*/*/*/*.java \
		./com/expye/compiler2016/*/*/*.java \
		./com/expye/compiler2016/*/*.java \
		./com/expye/compiler2016/*.java \
		-d ../bin
	@cp ./lib/antlr-4.5.2-complete.jar ./bin
	@cd ./bin && jar xf ./antlr-4.5.2-complete.jar \
			 && rm -rf ./META-INF \
			 && jar cef com/expye/compiler2016/Main Master.jar ./ \
			 && rm -rf ./antlr-4.5.2-complete.jar ./com/expye/compiler2016  ./org  ./st4hidden
	@cp ./bin/Master.jar Master.jar
	@rm -rf ./bin

clean:
	rm -rf ./bin