package i.note

import org.springframework.boot.DefaultBootstrapContext
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import javax.annotation.Resource

@Component
@SpringBootApplication
class NoteApplication

@Resource
lateinit var context: DefaultBootstrapContext

fun main(args: Array<String>) {
    runApplication<NoteApplication>(*args)
}
