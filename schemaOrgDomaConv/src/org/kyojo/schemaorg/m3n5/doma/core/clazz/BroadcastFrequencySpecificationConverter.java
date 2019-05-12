package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_FREQUENCY_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastFrequencySpecification;

@ExternalDomain
public class BroadcastFrequencySpecificationConverter implements DomainConverter<BroadcastFrequencySpecification, String> {

	@Override
	public String fromDomainToValue(BroadcastFrequencySpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastFrequencySpecification fromValueToDomain(String value) {
		return new BROADCAST_FREQUENCY_SPECIFICATION(value);
	}

}
