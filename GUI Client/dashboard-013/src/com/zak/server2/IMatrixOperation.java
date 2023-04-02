package com.zak.server2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author salman
 */
public interface IMatrixOperation extends Remote, Task{
    
    public IMatrixOperation MatrixOperationS(float[][] matrixA, float[][] matrixB) throws RemoteException;
    Object executeaddM() throws RemoteException;
    Object executeminusM() throws RemoteException;
    Object execute() throws RemoteException;
    Object executedivideM() throws RemoteException;
    Object getResult() throws RemoteException;
    Object executeMul() throws RemoteException;
}
