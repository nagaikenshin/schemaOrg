package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TARGET;
import org.kyojo.schemaOrg.m3n3.core.Container.Target;

@ExternalDomain
public class TargetConverter implements DomainConverter<Target, String> {

	@Override
	public String fromDomainToValue(Target domain) {
		return domain.getNativeValue();
	}

	@Override
	public Target fromValueToDomain(String value) {
		return new TARGET(value);
	}

}
