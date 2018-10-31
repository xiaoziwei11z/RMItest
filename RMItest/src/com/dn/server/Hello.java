package com.dn.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello {
	public String sayHello(String name) throws RemoteException;
}
