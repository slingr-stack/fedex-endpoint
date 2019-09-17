/**
 * TrackServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ws.track.v18;

public class TrackServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.ws.track.v18.TrackPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("track");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackRequest"), com.fedex.ws.track.v18.TrackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReply"));
        oper.setReturnClass(com.fedex.ws.track.v18.TrackReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrackingDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsRequest"), com.fedex.ws.track.v18.GetTrackingDocumentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsReply"));
        oper.setReturnClass(com.fedex.ws.track.v18.GetTrackingDocumentsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsRequest"), com.fedex.ws.track.v18.SendNotificationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsReply"));
        oper.setReturnClass(com.fedex.ws.track.v18.SendNotificationsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public TrackServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrackServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrackServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "AppointmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.AppointmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "AppointmentTimeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.AppointmentTimeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "AppointmentWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.AppointmentWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ArrivalLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ArrivalLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "AvailableImagesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.AvailableImagesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "AvailableImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.AvailableImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "BarcodeEntryType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.BarcodeEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CommodityPurposeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CommodityPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CompletedTrackDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CompletedTrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CustomerExceptionRequestDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CustomerExceptionRequestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "DeliveryOptionEligibilityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.DeliveryOptionEligibilityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "DeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.DeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Distance");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "DocumentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.DocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "EligibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.EligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "FaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.FaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.GetTrackingDocumentsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "GetTrackingDocumentsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.GetTrackingDocumentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ImageSizeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ImageSizeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "LocalTimeRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.LocalTimeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "OfficeOrderDeliveryMethodType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.OfficeOrderDeliveryMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "OperatingCompanyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.OperatingCompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "PagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.PagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "PieceCountLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.PieceCountLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "PieceCountVerificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.PieceCountVerificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.SendNotificationsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SendNotificationsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.SendNotificationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SignatureImageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.SignatureImageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SpecialInstructionsStatusCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.SpecialInstructionsStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "SpecialInstructionStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.SpecialInstructionStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackAdvanceNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackAdvanceNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackAdvanceNotificationStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackAdvanceNotificationStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackChargeDetailType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackChargeDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackChargesPaymentClassificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackChargesPaymentClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackDeliveryLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackDeliveryLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackDeliveryOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackDeliveryOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackDetailAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackDetailAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackEvent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackInformationNoteDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackInformationNoteDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingBillOfLadingDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingBillOfLadingDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDateOrTimestamp");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDateOrTimestamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDateOrTimestampType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDateOrTimestampType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocument");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentEmailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentEmailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingFreightBillingDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingFreightBillingDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackingSignatureProofOfDeliveryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackingSignatureProofOfDeliveryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackNotificationPackage");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackNotificationPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackNotificationRecipientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackNotificationRecipientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackOtherIdentifierDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackOtherIdentifierDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackPackageIdentifier");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackPackageIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackPackagingDescriptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackPackagingDescriptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackPayment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackPaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackPossessionStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackPossessionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReconciliation");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackReconciliation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackRequestProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackRequestProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReturnDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackReturnDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReturnLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackReturnLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackReturnMovementStatusType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackReturnMovementStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackSelectionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackSelectionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackServiceDescriptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackServiceDescriptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackSpecialHandling");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackSpecialHandling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackSpecialInstruction");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackSpecialInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackSplitShipmentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackSplitShipmentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackStatusAncillaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackStatusAncillaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TrackStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TrackStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/track/v18", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ws.track.v18.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.ws.track.v18.TrackReply track(com.fedex.ws.track.v18.TrackRequest trackRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v18/track");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "track"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trackRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.track.v18.TrackReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.track.v18.TrackReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.track.v18.TrackReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.track.v18.GetTrackingDocumentsReply getTrackingDocuments(com.fedex.ws.track.v18.GetTrackingDocumentsRequest getTrackingDocumentsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v18/getTrackingDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTrackingDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTrackingDocumentsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.track.v18.GetTrackingDocumentsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.track.v18.GetTrackingDocumentsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.track.v18.GetTrackingDocumentsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ws.track.v18.SendNotificationsReply sendNotifications(com.fedex.ws.track.v18.SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/track/v18/sendNotifications");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sendNotificationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ws.track.v18.SendNotificationsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ws.track.v18.SendNotificationsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ws.track.v18.SendNotificationsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
