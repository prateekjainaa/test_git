package mymain;

import vo.Multiply;

/**
 * Main file for project.
 * @author ejaprja
 *
 */
public class Executor {

	public static void main(String[] args) {
		System.out.println("Hello! welcome to calculator");
		Multiply vo = new Multiply();
		System.out.println(vo.product(2, 200));
		System.out.println("------------------------------");
	}

}
