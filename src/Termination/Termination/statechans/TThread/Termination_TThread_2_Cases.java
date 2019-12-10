package Termination.Termination.statechans.TThread;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.TThread.ioifaces.*;

public final class Termination_TThread_2_Cases extends org.scribble.runtime.statechans.CaseSocket<Termination, TThread> implements Case_TThread_Interface2_false__Interface2_true<Termination_TThread_1, EndSocket> {
	public static final Termination_TThread_2_Cases cast = null;
	public final Termination_TThread_2.Branch_TThread_Interface2_false__Interface2_true_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected Termination_TThread_2_Cases(org.scribble.runtime.session.SessionEndpoint<Termination, TThread> se, boolean dummy, Termination_TThread_2.Branch_TThread_Interface2_false__Interface2_true_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public Termination_TThread_1 receive(Interface2 role, false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Termination.false)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new Termination_TThread_1(this.se, true);
	}

	public Termination_TThread_1 receive(false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Termination.Interface2, op);
	}

	public Termination.Termination.statechans.TThread.EndSocket receive(Interface2 role, true op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Termination.true)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public Termination.Termination.statechans.TThread.EndSocket receive(true op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Termination.Interface2, op);
	}

	@Override
	public Branch_TThread_Interface2_false__Interface2_true.Branch_TThread_Interface2_false__Interface2_true_Enum getOp() {
		return this.op;
	}
}