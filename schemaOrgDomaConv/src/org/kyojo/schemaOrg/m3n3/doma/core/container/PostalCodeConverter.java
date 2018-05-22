package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POSTAL_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.PostalCode;

@ExternalDomain
public class PostalCodeConverter implements DomainConverter<PostalCode, String> {

	@Override
	public String fromDomainToValue(PostalCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public PostalCode fromValueToDomain(String value) {
		return new POSTAL_CODE(value);
	}

}
