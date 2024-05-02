package info.developia.testing.poc

import spock.lang.*

class AppTest extends Specification {
    App app = new App()

    def "test get Greeting"() {
        when:
        String result = app.getGreeting()

        then:
        result == "Hello World!"
    }
}
