package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POSTAL_ADDRESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress;

@ExternalDomain
public class PostalAddressConverter implements DomainConverter<PostalAddress, String> {

	@Override
	public String fromDomainToValue(PostalAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public PostalAddress fromValueToDomain(String value) {
		return new POSTAL_ADDRESS(value);
	}

}
