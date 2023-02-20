package com.consultadd.maven.ConsultAddAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext applicationContext =
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        JavaLanguage javaLanguage = applicationContext.getBean("Framework",JavaLanguage.class);
        System.out.println(javaLanguage.learningJava());
        System.out.println(javaLanguage.learningPython());
    }
}
