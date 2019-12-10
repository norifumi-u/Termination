package Termination.Termination.statechans.TThread.ioifaces;

import Termination.Termination.ops.*;

public interface Case_TThread_Interface2_false__Interface2_true<__Succ1 extends Succ_In_Interface2_false, __Succ2 extends Succ_In_Interface2_true> extends In_Interface2_false<__Succ1>, In_Interface2_true<__Succ2> {
	public static final Branch_TThread_Interface2_false__Interface2_true<?, ?> cast = null;

	abstract Branch_TThread_Interface2_false__Interface2_true.Branch_TThread_Interface2_false__Interface2_true_Enum getOp();

	abstract public __Succ1 receive(false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public Termination.Termination.statechans.TThread.EndSocket receive(true op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}