package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TARGET;
import org.kyojo.schemaorg.m3n5.core.Container.Target;

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
