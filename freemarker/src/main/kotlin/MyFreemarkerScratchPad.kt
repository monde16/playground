import freemarker.template.Configuration
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
	val cfg = Configuration()

	val template = cfg.getTemplate("freemarker/src/main/resources/template.ftl")
	val languages = listOf("C", "C++", "Kotlin", "Java", "Python")
	val context = hashMapOf(
			Pair("message", "Hello World!"),
			Pair("languages", languages)
	)
	template.process(context, OutputStreamWriter(System.out))
}
