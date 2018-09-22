def text = '''\
            Dear <% out << firstname %> ${lastname},
            
            We <% if (accepted) out.print 'are pleased' else out.print 'regret' %> \
            to inform you that your paper entitled
            '$title' was ${ accepted ? 'accepted' : 'rejected' }.
            
            The conference committee.'''



def binding = [
        firstname: "Grace",
        lastname : "Hopper",
        accepted : true,
        title    : 'Groovy for COBOL programmers'
]
String response

TimeUtil.time {
    def template = new groovy.text.StreamingTemplateEngine().createTemplate(text)
//    def template = new groovy.text.GStringTemplateEngine().createTemplate(text)
    response = template.make(binding)
}

println response