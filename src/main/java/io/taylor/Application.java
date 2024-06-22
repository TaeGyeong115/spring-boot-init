package io.taylor;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}


/* tomcat 띄우기 */
//public class Application {
//    public static void main(String[] args) throws LifecycleException {
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        Context context = tomcat.addContext("/", "/");
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println("<html><head><title>");
//                writer.println("Hey, Tomcat");
//                writer.println("</title></head>");
//                writer.println("<body><h1>Hello Tomcat</h1></body>");
//                writer.println("</html>");
//            }
//        };
//
//        String servletName = "helloServlet";
//        tomcat.addServlet("/", servletName, servlet);
//        context.addServletMappingDecoded("/hello", servletName);
//
//        tomcat.getConnector();
//        tomcat.start();
//        tomcat.getServer().await();
//    }
//}