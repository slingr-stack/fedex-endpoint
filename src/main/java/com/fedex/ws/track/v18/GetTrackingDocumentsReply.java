/**
 * GetTrackingDocumentsReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.track.v18;

public class GetTrackingDocumentsReply  implements java.io.Serializable {
    private com.fedex.ws.track.v18.NotificationSeverityType highestSeverity;

    private com.fedex.ws.track.v18.Notification[] notifications;

    private com.fedex.ws.track.v18.TransactionDetail transactionDetail;

    private com.fedex.ws.track.v18.VersionId version;

    private com.fedex.ws.track.v18.TrackingDocument[] documents;

    public GetTrackingDocumentsReply() {
    }

    public GetTrackingDocumentsReply(
           com.fedex.ws.track.v18.NotificationSeverityType highestSeverity,
           com.fedex.ws.track.v18.Notification[] notifications,
           com.fedex.ws.track.v18.TransactionDetail transactionDetail,
           com.fedex.ws.track.v18.VersionId version,
           com.fedex.ws.track.v18.TrackingDocument[] documents) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.documents = documents;
    }


    /**
     * Gets the highestSeverity value for this GetTrackingDocumentsReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.ws.track.v18.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this GetTrackingDocumentsReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.ws.track.v18.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this GetTrackingDocumentsReply.
     * 
     * @return notifications
     */
    public com.fedex.ws.track.v18.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this GetTrackingDocumentsReply.
     * 
     * @param notifications
     */
    public void setNotifications(com.fedex.ws.track.v18.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.ws.track.v18.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.ws.track.v18.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this GetTrackingDocumentsReply.
     * 
     * @return transactionDetail
     */
    public com.fedex.ws.track.v18.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this GetTrackingDocumentsReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.ws.track.v18.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this GetTrackingDocumentsReply.
     * 
     * @return version
     */
    public com.fedex.ws.track.v18.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetTrackingDocumentsReply.
     * 
     * @param version
     */
    public void setVersion(com.fedex.ws.track.v18.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the documents value for this GetTrackingDocumentsReply.
     * 
     * @return documents
     */
    public com.fedex.ws.track.v18.TrackingDocument[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this GetTrackingDocumentsReply.
     * 
     * @param documents
     */
    public void setDocuments(com.fedex.ws.track.v18.TrackingDocument[] documents) {
        this.documents = documents;
    }

    public com.fedex.ws.track.v18.TrackingDocument getDocuments(int i) {
        return this.documents[i];
    }

    public void setDocuments(int i, com.fedex.ws.track.v18.TrackingDocument _value) {
        this.documents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTrackingDocumentsReply)) return false;
        GetTrackingDocumentsReply other = (GetTrackingDocumentsReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTrackingDocumentsReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
