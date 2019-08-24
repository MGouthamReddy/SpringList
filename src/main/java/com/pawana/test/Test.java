package com.pawana.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pawana.bean.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("student.config.file.xml");
		Object ob   =ac.getBean("sobj");
		Student st=(Student) ob;   
		System.out.println(st);
		System.out.println(st.getMarkers().getClass().getName());

	}

}
