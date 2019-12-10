package Termination.Termination.statechans.Interface2;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Interface2.ioifaces.*;

public final class Termination_Interface2_1 extends org.scribble.runtime.statechans.ReceiveSocket<Termination, Interface2> implements Receive_Interface2_TThread_isShutdouwnRequested<Termination_Interface2_2> {
	public static final Termination_Interface2_1 cast = null;

	protected Termination_Interface2_1(org.scribble.runtime.session.SessionEndpoint<Termination, Interface2> se, boolean dummy) {
		super(se);
	}

	public Termination_Interface2_1(org.scribble.runtime.session.MPSTEndpoint<Termination, Interface2> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public Termination_Interface2_2 receive(TThread role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(Termination.TThread);
		return new Termination_Interface2_2(this.se, true);
	}

	public Termination_Interface2_2 async(TThread role, isShutdouwnRequested op, org.scribble.runtime.util.Buf<Termination_Interface2_1_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new Termination_Interface2_1_Future(super.getFuture(Termination.TThread));
		return new Termination_Interface2_2(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(Termination.TThread);
	}

	@SuppressWarnings("unchecked")
	public Termination_Interface2_2 async(TThread role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException {
		return async(Termination.TThread, op, (org.scribble.runtime.util.Buf<Termination_Interface2_1_Future>) this.se.gc);
	}
}