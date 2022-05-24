package mx.uv.t4is.Pinacoteca;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class PinacotecaConf {
    @Bean
    public XsdSchema visitantesSchema(){
        return new SimpleXsdSchema(new ClassPathResource("pinacoteca.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "pinacoteca")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema saludosSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("pinacotecaPort");
        wsdl.setLocationUri("/ws");   
        wsdl.setTargetNamespace("https://t4is.uv.mx/pinacoteca");
        wsdl.setSchema(saludosSchema);
        return wsdl;
    }
    
}
