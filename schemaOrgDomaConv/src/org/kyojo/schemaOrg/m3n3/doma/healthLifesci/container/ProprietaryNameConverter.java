package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PROPRIETARY_NAME;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProprietaryName;

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
