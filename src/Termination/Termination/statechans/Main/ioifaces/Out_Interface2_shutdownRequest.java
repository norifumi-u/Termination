package Termination.Termination.statechans.Main.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface Out_Interface2_shutdownRequest<__Succ extends Succ_Out_Interface2_shutdownRequest> {

	abstract public __Succ send(Interface2 role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, IOException;
}