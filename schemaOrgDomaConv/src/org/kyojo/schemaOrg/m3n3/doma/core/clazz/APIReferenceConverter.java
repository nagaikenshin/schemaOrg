package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.API_REFERENCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.APIReference;

@ExternalDomain
public class APIReferenceConverter implements DomainConverter<APIReference, String> {

	@Override
	public String fromDomainToValue(APIReference domain) {
		return domain.getNativeValue();
	}

	@Override
	public APIReference fromValueToDomain(String value) {
		return new API_REFERENCE(value);
	}

}
