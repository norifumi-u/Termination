package Termination.Termination.statechans.TThread.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface Callback_Interface2_false<__Succ extends Succ_In_Interface2_false> {

	abstract public void receive(__Succ schan, false op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}