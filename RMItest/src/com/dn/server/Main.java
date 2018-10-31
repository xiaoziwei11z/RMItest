package com.dn.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.commons.io.IOUtils;

public class Main {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			Hello server = new HelloImpl();
			Context namingContext = new InitialContext();
			namingContext.bind("rmi:hello", server);
			System.out.println("server is ready");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
