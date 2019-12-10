package Termination;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;

import Termination.Termination.Termination;
import Termination.Termination.roles.Interface1;
import Termination.Termination.roles.Interface2;

public class Interface {

    public static void main(String[] args) throws Exception {
		try (ScribServerSocket ss = new SocketChannelServer(8888)) {
		    while(true) {
				Termination termination = new Termination();
				try (MPSTEndpoint<Termination, Interface1> interface1 =
				     new MPSTEndpoint<>(termination, interface1 new ObjectStreamFormatter())) {
				    interface1.accept(ss, Main);
				    interface.accept(ss, TThread);
				    new Interface().run(new Termination_Interface1_1(interface1));
				} catch (ScribbleRuntimeException | IOException | ClassNotFoundException e){
				    e.printStackTrace();
				}
		    }
		}
    }

    private void run(Termination_Interface_1 i1) throws Exception {

	Interface1 I1 = new Interface1();
	Interface2 I2 = new Interface2();

	boolean received = false;

	new Thread(){
	    run() {
		while (!I1.received) {
		    if(I1.receive(shutdownRequest, Main)) {
			I1.received = true;
		    }
		}
	    }
	}.start();

	if (I1.received) {
	    I2.send(true, TThread);
	}
    }
}
