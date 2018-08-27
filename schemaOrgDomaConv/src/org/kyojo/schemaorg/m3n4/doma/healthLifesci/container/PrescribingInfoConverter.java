package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PRESCRIBING_INFO;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PrescribingInfo;

@ExternalDomain
public class PrescribingInfoConverter implements DomainConverter<PrescribingInfo, String> {

	@Override
	public String fromDomainToValue(PrescribingInfo domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrescribingInfo fromValueToDomain(String value) {
		return new PRESCRIBING_INFO(value);
	}

}
