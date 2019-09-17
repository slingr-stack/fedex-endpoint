/**
 * TrackPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.track.v18;

public interface TrackPortType extends java.rmi.Remote {
    public com.fedex.ws.track.v18.TrackReply track(com.fedex.ws.track.v18.TrackRequest trackRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.track.v18.GetTrackingDocumentsReply getTrackingDocuments(com.fedex.ws.track.v18.GetTrackingDocumentsRequest getTrackingDocumentsRequest) throws java.rmi.RemoteException;
    public com.fedex.ws.track.v18.SendNotificationsReply sendNotifications(com.fedex.ws.track.v18.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException;
}
