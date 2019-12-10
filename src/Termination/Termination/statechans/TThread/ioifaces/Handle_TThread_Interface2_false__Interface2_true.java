package Termination.Termination.statechans.TThread.ioifaces;

import Termination.Termination.ops.*;

public interface Handle_TThread_Interface2_false__Interface2_true<__Succ1 extends Succ_In_Interface2_false, __Succ2 extends Succ_In_Interface2_true> extends Callback_Interface2_false<__Succ1>, Callback_Interface2_true<__Succ2> {

	abstract public void receive(__Succ1 schan, false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, true op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}