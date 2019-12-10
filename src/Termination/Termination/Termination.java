package Termination.Termination;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;

public final class Termination extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("Termination.Termination");
	public static final Main Main = Termination.Termination.roles.Main.Main;
	public static final Interface2 Interface2 = Termination.Termination.roles.Interface2.Interface2;
	public static final Interface1 Interface1 = Termination.Termination.roles.Interface1.Interface1;
	public static final TThread TThread = Termination.Termination.roles.TThread.TThread;
	public static final isShutdouwnRequested isShutdouwnRequested = Termination.Termination.ops.isShutdouwnRequested.isShutdouwnRequested;
	public static final false false = Termination.Termination.ops.false.false;
	public static final shutdownRequest shutdownRequest = Termination.Termination.ops.shutdownRequest.shutdownRequest;
	public static final true true = Termination.Termination.ops.true.true;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {Main, Interface2, Interface1, TThread}));

	public Termination() {
		super(Termination.IMPATH, Termination.SOURCE, Termination.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return Termination.ROLES;
	}
}