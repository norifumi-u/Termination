package Termination.Termination.statechans.TThread;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.TThread.ioifaces.*;

public final class Termination_TThread_2 extends org.scribble.runtime.statechans.BranchSocket<Termination, TThread> implements Branch_TThread_Interface2_false__Interface2_true<Termination_TThread_1, EndSocket> {
	public static final Termination_TThread_2 cast = null;

	protected Termination_TThread_2(org.scribble.runtime.session.SessionEndpoint<Termination, TThread> se, boolean dummy) {
		super(se);
	}

	@Override
	public Termination_TThread_2_Cases branch(Interface2 role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Termination.Interface2);
		Branch_TThread_Interface2_false__Interface2_true_Enum openum;
		if (m.op.equals(Termination.false)) {
			openum = Branch_TThread_Interface2_false__Interface2_true_Enum.false;
		}
		else if (m.op.equals(Termination.true)) {
			openum = Branch_TThread_Interface2_false__Interface2_true_Enum.true;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new Termination_TThread_2_Cases(this.se, true, openum, m);
	}

	public void branch(Interface2 role, Termination_TThread_2_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_TThread_Interface2_false__Interface2_true<Termination_TThread_1, EndSocket>) handler);
	}

	@Override
	public void branch(Interface2 role, Handle_TThread_Interface2_false__Interface2_true<Termination_TThread_1, EndSocket> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Termination.Interface2);
		if (m.op.equals(Termination.false)) {
			handler.receive(new Termination_TThread_1(this.se, true), Termination.false);
		}
		else
		if (m.op.equals(Termination.true)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Termination.true);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(Interface2 role, Handle_TThread_Interface2_false__Interface2_true<Succ_In_Interface2_false, Succ_In_Interface2_true> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Termination.Interface2);
		if (m.op.equals(Termination.false)) {
			handler.receive(new Termination_TThread_1(this.se, true), Termination.false);
		}
		else
		if (m.op.equals(Termination.true)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Termination.true);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}