package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TARGET_DESCRIPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.TargetDescription;

@ExternalDomain
public class TargetDescriptionConverter implements DomainConverter<TargetDescription, String> {

	@Override
	public String fromDomainToValue(TargetDescription domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetDescription fromValueToDomain(String value) {
		return new TARGET_DESCRIPTION(value);
	}

}
