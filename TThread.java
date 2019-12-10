package Termination;

import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import Termination.Termination.Termination;
import Termination.Termination.statechans.TThread.Termination_TThread_1;
import Termination.Termination.statechans.TThread.Termination_TThread_2;

public class TThread {

    public static void main(String[] args) throws Exception {
        Termination termination = new Termination();
	try (MPSTEndpoint<Termination, TThread> thread = new MPSTEndpoint<>(termination, TThread, new ObjectStreamFormatter())) {
	    thread.connect(Interface, SocketChannelEndpoint::new, "localhost", 8888);
	    var n = 0;
	    System.out.println(n + "th Fibonacci number = " + fib(new Termination_TThread_1(thread), n));
        }
    }

    private static int fib(Termination_TThread_1 t1, int n) throws Exception {
	var x = new Buf<>(0);
	var y = new Buf<>(1);
	var z = new Buf<Integer>();

	Termination_TThread_2 t2 = t1.send(Interface, isShutdownRequested);
	if (t2.receive(Interface, true)) {
	    System.out.println("シャットダウンしました。");
	    return n;
	}
	else {
	    z.val = x.val+y.val;
	    x = y;
	    y = z;
	    n++;
	}
    }
}
