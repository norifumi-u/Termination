package Termination.Termination.statechans.TThread;

import Termination.Termination.ops.*;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.TThread.ioifaces.*;

public interface Termination_TThread_2_Handler extends Handle_TThread_Interface2_false__Interface2_true<Termination_TThread_1, EndSocket> {

	@Override
	abstract public void receive(Termination_TThread_1 schan, false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, true op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}