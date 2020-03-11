/**
 * * Simple Java program to prove that abstract class can have constructor in
 * Java. * @author http://java67.blogspot.com
 */
public class AbstractConstructorTest {
	public static void main(String args[]) {
		Server server = new Tomcat("Apache Tomcat");
		server.start();
	}
}

// test for git for test
// test line for commit 
abstract class Server {
	protected final String name;

	public Server(String name) {
		this.name = name;
	}

	public abstract boolean start();
}

class Tomcat extends Server {
	public Tomcat(String name) {
		super(name);
	}

	@Override
	public boolean start() {
		System.out.println(this.name + " started successfully");
		return true;
	}
}
