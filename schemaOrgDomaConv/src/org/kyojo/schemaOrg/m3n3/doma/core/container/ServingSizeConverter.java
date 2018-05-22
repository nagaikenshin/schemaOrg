package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVING_SIZE;
import org.kyojo.schemaOrg.m3n3.core.Container.ServingSize;

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
