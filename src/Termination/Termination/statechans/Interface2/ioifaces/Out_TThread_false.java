package Termination.Termination.statechans.Interface2.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface Out_TThread_false<__Succ extends Succ_Out_TThread_false> {

	abstract public __Succ send(TThread role, false op) throws org.scribble.main.ScribRuntimeException, IOException;
}