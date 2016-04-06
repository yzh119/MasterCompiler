all: clean
	@mkdir -p ./bin
	@cd ./src && javac -cp "../lib/antlr-4.5.2-complete.jar" \
		./Master/*/*/*/*/*.java \
		./Master/*/*/*/*.java \
		./Master/*/*/*.java \
		./Master/*/*.java \
		./Master/*.java \
		-d ../bin
	@cp ./lib/antlr-4.5.2-complete.jar ./bin
	@cd ./bin && jar xf ./antlr-4.5.2-complete.jar \
			 && rm -rf ./META-INF \
			 && jar cef Master/Main Master.jar ./ \
			 && rm -rf ./antlr-4.5.2-complete.jar ./Master  ./org  ./st4hidden

clean:
	rm -rf ./bin