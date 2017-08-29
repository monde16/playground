import freemarker.template.Configuration
import freemarker.template.TemplateException

class FreeMarkerHelloWorld {
    static void main(String[] args) {
        // configure Freemarker
        def cfg = new Configuration()

        try {
            // Load the template
            def template = cfg.getTemplate("freemarker/src/main/resources/template.ftl")

            def data = [message: 'Hello World!']
            def languages = ['C', 'C++', 'Kotlin', 'Java', 'Python']

            data.put('languages', languages)
            println("Data = $data")
            def outs = new OutputStreamWriter(System.out)
            template.process(data, outs)
        } catch (IOException|TemplateException e) {
            e.printStackTrace()
        }
    }
}
