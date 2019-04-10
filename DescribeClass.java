package test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DescribeClass {
	public static void main(String[] args) throws Exception {
		//获取Class 对象
		Class<?> fClass = Class.forName("test.reflect.Product");
		System.out.println("name:"+fClass.getName());
		System.out.println("field:"+fClass.getDeclaredFields().length);
		System.out.println("Method:"+fClass.getDeclaredMethods().length);
		//获取 属性
		System.out.println("=======================");
		Field[] fs = fClass.getDeclaredFields();
		System.out.println("field:");
		for(Field f:fs) {
			System.out.println(f.getType().getName()+" "+f.getName());
		}
		//获取 方法信息
		System.out.println("=======================");
		Method[] ms = fClass.getDeclaredMethods();
		System.out.println("Method:");
		for(Method f:ms) {
			System.out.print(Modifier.toString(f.getModifiers())+" "+f.getReturnType().getName()+" "+f.getName());
			
			Class[] ss = f.getParameterTypes();
			for(int i = 0;i<ss.length;i++) {
				System.out.print(" => "+ss[i].getName()+" ");
			}
			System.out.println();
			
		}
		//获取 构造方法信息
		System.out.println("=======================");
		Constructor<?>[] p =  fClass.getConstructors();
		System.out.println("Constructor:");
		for(Constructor f:p) {
			System.out.println(Modifier.toString(f.getModifiers())+" "+f.getName()+" "+f.getName());
		}
		//使用默认构造方法 调用方法
		System.out.println("=======================");
		Constructor<?> c1 = fClass.getDeclaredConstructor();
		Product p1 = (Product) c1.newInstance();
		System.out.println("p1.getName():"+p1.getName());
		System.out.println("p1.getPrice():"+p1.getPrice());
		System.out.println("p1.getClass():"+p1.getClass());
		//使用自定义构造方法 调用方法
		System.out.println("=======================");
		Constructor<?> c2 = fClass.getDeclaredConstructor(String.class,String.class);
		Product p2 = (Product) c2.newInstance("house","10000");
		System.out.println("p2.getName():"+p2.getName());
		System.out.println("p2.getPrice():"+p2.getPrice());
		System.out.println("p2.getClass():"+p2.getClass());
		//调用和赋值给私有属性
		System.out.println("=======================");
		Field m = fClass.getDeclaredField("name");
		m.setAccessible(true);
		System.out.println("p2.name:"+m.get(p2));
		m.set(p2, "20000");
		System.out.println("p2.name:"+m.get(p2));
		//调用私有方法
		System.out.println("=======================");
		Method mm = fClass.getDeclaredMethod("cost");
		mm.setAccessible(true);
		System.out.println("p2.cost:"+mm.invoke(p2));
	}
}
