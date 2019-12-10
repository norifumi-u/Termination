package Termination.Termination.statechans.Interface2.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface In_TThread_isShutdouwnRequested<__Succ extends Succ_In_TThread_isShutdouwnRequested> {

	abstract public __Succ receive(TThread role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}