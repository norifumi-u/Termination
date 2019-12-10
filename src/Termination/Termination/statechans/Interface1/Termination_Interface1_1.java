package Termination.Termination.statechans.Interface1;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Interface1.ioifaces.*;

public final class Termination_Interface1_1 extends org.scribble.runtime.statechans.ReceiveSocket<Termination, Interface1> implements Receive_Interface1_Main_shutdownRequest<EndSocket> {
	public static final Termination_Interface1_1 cast = null;

	protected Termination_Interface1_1(org.scribble.runtime.session.SessionEndpoint<Termination, Interface1> se, boolean dummy) {
		super(se);
	}

	public Termination_Interface1_1(org.scribble.runtime.session.MPSTEndpoint<Termination, Interface1> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public Termination.Termination.statechans.Interface1.EndSocket receive(Main role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(Termination.Main);
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public Termination.Termination.statechans.Interface1.EndSocket async(Main role, shutdownRequest op, org.scribble.runtime.util.Buf<Termination_Interface1_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new Termination_Interface1_1_Future(super.getFuture(Termination.Main));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(Termination.Main);
	}

	@SuppressWarnings("unchecked")
	public Termination.Termination.statechans.Interface1.EndSocket async(Main role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException {
		return async(Termination.Main, op, (org.scribble.runtime.util.Buf<Termination_Interface1_1_Future>) this.se.gc);
	}
}