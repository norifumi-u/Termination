package Termination.Termination.statechans.Interface1.ioifaces;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public interface In_Main_shutdownRequest<__Succ extends Succ_In_Main_shutdownRequest> {

	abstract public __Succ receive(Main role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}