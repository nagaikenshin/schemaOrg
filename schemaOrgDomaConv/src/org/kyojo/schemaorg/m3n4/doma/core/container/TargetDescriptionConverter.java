package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TARGET_DESCRIPTION;
import org.kyojo.schemaorg.m3n4.core.Container.TargetDescription;

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
