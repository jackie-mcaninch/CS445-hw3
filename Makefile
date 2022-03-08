make:
	./gradlew build
	./gradlew run
	
test:
	./gradlew build
	./gradlew jacocoTestReport
	xdg-open app/build/reports/jacoco/test/html/edu.iit.cs445.spring22/index.html

	
clean:
	./gradlew clean
