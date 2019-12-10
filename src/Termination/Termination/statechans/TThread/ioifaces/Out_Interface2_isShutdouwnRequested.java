package Termination.Termination.statechans.TThread.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface Out_Interface2_isShutdouwnRequested<__Succ extends Succ_Out_Interface2_isShutdouwnRequested> {

	abstract public __Succ send(Interface2 role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException, IOException;
}