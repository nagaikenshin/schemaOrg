package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SERVING_SIZE;
import org.kyojo.schemaorg.m3n5.core.Container.ServingSize;

@ExternalDomain
public class ServingSizeConverter implements DomainConverter<ServingSize, String> {

	@Override
	public String fromDomainToValue(ServingSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServingSize fromValueToDomain(String value) {
		return new SERVING_SIZE(value);
	}

}
