package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TARGET_URL;
import org.kyojo.schemaorg.m3n5.core.Container.TargetUrl;

@ExternalDomain
public class TargetUrlConverter implements DomainConverter<TargetUrl, String> {

	@Override
	public String fromDomainToValue(TargetUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetUrl fromValueToDomain(String value) {
		return new TARGET_URL(value);
	}

}
