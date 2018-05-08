build: make
make:
	mvn package
run:
	java -cp target/fadhil-blockchain-1.0-SNAPSHOT.jar id.web.fadhil.blockchain.App
clean:
	mvn clean