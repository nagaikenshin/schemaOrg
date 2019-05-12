package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.PUBLIC_TOILET;
import org.kyojo.schemaorg.m3n5.pending.Clazz.PublicToilet;

@ExternalDomain
public class PublicToiletConverter implements DomainConverter<PublicToilet, String> {

	@Override
	public String fromDomainToValue(PublicToilet domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicToilet fromValueToDomain(String value) {
		return new PUBLIC_TOILET(value);
	}

}
