package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.TRANSMISSION_METHOD;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.TransmissionMethod;

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
