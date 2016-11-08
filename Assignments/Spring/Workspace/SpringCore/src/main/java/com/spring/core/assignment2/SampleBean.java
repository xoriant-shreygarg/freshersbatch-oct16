package com.spring.core.assignment2;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SampleBean implements BeanNameAware, InitializingBean, DisposableBean{

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		System.out.println("setStr("+str+")");
		this.str = str;
	}

	@Override
	public String toString() {
		return "SampleBean [str=" + str + "]";
	}

	public SampleBean(String str) {
		super();
		this.str = str;
	}

	public SampleBean() {
		super();
		System.out.println("SampleBean()");
	}

	public void setBeanName(String arg0) {
		System.out.println("setBeanName("+arg0+")");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}
	
	public void init1(){
		System.out.println("init()");
	}
	
	public void dest1(){
		System.out.println("dest()");
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}


}
