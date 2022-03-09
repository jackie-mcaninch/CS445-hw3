make:
	./gradlew build
	./gradlew run
	
test:
	./gradlew build
	./gradlew jacocoTestReport
	xdg-open app/build/reports/tests/test/classes/edu.iit.cs445.spring22.TableLampTest.html
	xdg-open app/build/reports/jacoco/test/html/index.html

	
clean:
	./gradlew clean
