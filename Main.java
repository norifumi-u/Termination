package Termination;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import Termination.Termination.Termination;
import Termination.Termination.statechans.Main.Termination_Main_1;

public class Main {

    public static void main(String[] args) throws Exception {
        Termination termination = new Termination();
	try (MPSTEndpoint<Termination, Main> main = new MPSTEndpoint<>(termination, Main, new ObjectStreamFormatter())) {
	    main.connect(Interface, SocketChannelEndpoint::new, "localhost", 8888);
        }
    }

    private static void request(Termination_Main_1 m1) throws Exception {
	var t = new Buf<Integer>(0);
	while (t.val < 1000) {
	    t.val++;
	}
	m1.send(Interface, shutdownRequest);
    }
}
