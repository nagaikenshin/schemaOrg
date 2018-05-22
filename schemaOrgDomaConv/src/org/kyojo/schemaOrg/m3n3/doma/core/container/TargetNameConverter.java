package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TARGET_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.TargetName;

@ExternalDomain
public class TargetNameConverter implements DomainConverter<TargetName, String> {

	@Override
	public String fromDomainToValue(TargetName domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetName fromValueToDomain(String value) {
		return new TARGET_NAME(value);
	}

}
