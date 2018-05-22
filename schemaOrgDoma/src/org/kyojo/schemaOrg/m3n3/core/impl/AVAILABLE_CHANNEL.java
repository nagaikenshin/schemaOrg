package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ServiceChannel;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class AVAILABLE_CHANNEL implements Container.AvailableChannel {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ServiceChannel> serviceChannelList;

	public AVAILABLE_CHANNEL() {
	}

	public AVAILABLE_CHANNEL(String string) {
		this(new SERVICE_CHANNEL(string));
	}

	public String getString() {
		if(serviceChannelList == null || serviceChannelList.size() == 0 || serviceChannelList.get(0) == null) {
			return null;
		} else {
			Name name = serviceChannelList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(serviceChannelList == null) {
			serviceChannelList = new ArrayList<ServiceChannel>();
		}
		if(serviceChannelList.size() == 0) {
			serviceChannelList.add(new SERVICE_CHANNEL(string));
		} else {
			serviceChannelList.set(0, new SERVICE_CHANNEL(string));
		}
	}

	public AVAILABLE_CHANNEL(ServiceChannel serviceChannel) {
		serviceChannelList = new ArrayList<ServiceChannel>();
		serviceChannelList.add(serviceChannel);
	}

	@Override
	public ServiceChannel getServiceChannel() {
		if(serviceChannelList != null && serviceChannelList.size() > 0) {
			return serviceChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setServiceChannel(ServiceChannel serviceChannel) {
		if(serviceChannelList == null) {
			serviceChannelList = new ArrayList<>();
		}
		if(serviceChannelList.size() == 0) {
			serviceChannelList.add(serviceChannel);
		} else {
			serviceChannelList.set(0, serviceChannel);
		}
	}

	@Override
	public List<ServiceChannel> getServiceChannelList() {
		return serviceChannelList;
	}

	@Override
	public void setServiceChannelList(List<ServiceChannel> serviceChannelList) {
		this.serviceChannelList = serviceChannelList;
	}

	@Override
	public boolean hasServiceChannel() {
		return serviceChannelList != null && serviceChannelList.size() > 0 && serviceChannelList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
