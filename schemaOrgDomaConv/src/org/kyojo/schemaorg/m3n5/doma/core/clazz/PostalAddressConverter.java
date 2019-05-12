package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.POSTAL_ADDRESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.PostalAddress;

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
