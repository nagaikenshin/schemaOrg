package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.TRANSMISSION_METHOD;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.TransmissionMethod;

@ExternalDomain
public class TransmissionMethodConverter implements DomainConverter<TransmissionMethod, String> {

	@Override
	public String fromDomainToValue(TransmissionMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public TransmissionMethod fromValueToDomain(String value) {
		return new TRANSMISSION_METHOD(value);
	}

}
