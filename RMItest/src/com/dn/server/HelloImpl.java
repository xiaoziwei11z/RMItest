package com.dn.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
	public HelloImpl() throws RemoteException{
		super();
	}
	
	@Override
	public String sayHello(String name) throws RemoteException {
		return "hello" + name;
	}

}
