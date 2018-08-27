package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PROPRIETARY_NAME;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ProprietaryName;

@ExternalDomain
public class ProprietaryNameConverter implements DomainConverter<ProprietaryName, String> {

	@Override
	public String fromDomainToValue(ProprietaryName domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProprietaryName fromValueToDomain(String value) {
		return new PROPRIETARY_NAME(value);
	}

}
